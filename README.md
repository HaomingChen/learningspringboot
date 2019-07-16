# learningspringboot
This is my personal project to study springboot

1.因版本原因无效: server.context-path:/hello
尝试: server.servlet.context-path:/hello

2.使用maven package打包时，仅有类路径下的配置文件会被打包

3.logback.xml自定义logback配置文件必须直接存放在resource文件夹下才会被读取

4.现在logback.xml不需要加上后缀变为logback-spring.xml就可以使用spring的标记语言属性例如<springProfile name="dev">标记

5.在子项目中配置的springboot icon -> favicon.ico无法显示 原因未知

6. Ctrl + Shift + Alt + N = 搜索java方法

7. SpringMvc相关配置 -> spring-boot-autoconfigure -> WebMvcAutoConfiguration.java

8. @RestController注解的坑 -> 需后续深入了解
1) 如果只是使用@RestController注解Controller，则Controller中的方法无法返回jsp页面，或者html，
配置的视图解析器 InternalResourceViewResolver不起作用，返回的内容就是Return 里的内容。

2) 如果需要返回到指定页面，则需要用 @Controller配合视图解析器InternalResourceViewResolver才行。
    如果需要返回JSON，XML或自定义mediaType内容到页面，则需要在对应的方法上加上@ResponseBody注解