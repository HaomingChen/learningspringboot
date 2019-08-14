# learningspringboot
This is my personal project to study springboot

1.因版本原因无效: server.context-path:/hello
尝试: server.servlet.context-path:/hello

2.使用maven package打包时，仅有类路径下的配置文件会被打包

3.logback.xml自定义logback配置文件必须直接存放在resource文件夹下才会被读取

4.现在logback.xml不需要加上后缀变为logback-spring.xml就可以使用spring的标记语言属性例如<springProfile name="dev">标记

5.在子项目中配置的springboot icon -> favicon.ico无法显示 原因未知

6.ctrl + Shift + Alt + N = 搜索java方法

7.SpringMvc相关配置 -> spring-boot-autoconfigure -> WebMvcAutoConfiguration.java

8.@RestController注解的坑 -> 需后续深入了解
1) 如果只是使用@RestController注解Controller，则Controller中的方法无法返回jsp页面，或者html，
配置的视图解析器 InternalResourceViewResolver不起作用，返回的内容就是Return 里的内容。

2) 如果需要返回到指定页面，则需要用 @Controller配合视图解析器InternalResourceViewResolver才行。
    如果需要返回JSON，XML或自定义mediaType内容到页面，则需要在对应的方法上加上@ResponseBody注解

9.SpringMVC: converter: 前端类型 -> java类型 如:前端文本:18 -> 后端Integer:18

10.HttpMessageConverter: 将Http的请求和响应(文本)解析成Json
参见: https://www.jianshu.com/p/333ed5ee958d

11.通过实现WebMvcConfigurer接口(疑问: 为什么实现类并不需要实现接口中所有的方法)
2.0版本中WebMvcConfigurerAdapter被废弃（该方法实现了WebMvcConfigurer接口）。

12.WebMvcConfigurerAdapter配合@EnableWebMvc在2.x版本失效。
自定义配置类继承WebMvcConfigurationSupport类(@EnableWebMvc继承自该类)
会使Springboot的Spring MVC默认配置失效相当于spring boot 1.x版本中WebMvcConfigurerAdapter
配合@EnableWebMvc使用达到完全接管Spring MVC配置的目的。
原因: 查看WebMvcAutoConfiguration signature -> @ConditionalOnMissingBean(WebMvcConfigurationSupport.class)

13.MessageCodeResolver不了解 与JSR303中@Blank中message定义的错误有关

14.default setting为idea中全局默认设置

15.作用范围: Request < Session(默认30分钟,关闭浏览器失效) < servletContext
SessionId由???(SessionId是由谁创建的?)在程序调用HttpServletRequest.getSession时创建,
并在浏览器首次向服务器发送请求时在Response-header中返回以JSESSIONID为标识的sessionId
sessionId将被缓存与浏览器中,在下次浏览器发出Request时带上以便于服务器验证用户的身份

16.restful CRUD和普通CRUD的区别, restful CRUD以不同的http请求方式代替了以URI来表示请求资源的方式
以URI定位资源,以HTTP描述操作
例如: 普通CRUD查询 uri: getEmp, RestfulCRUD: emp---GET,从而简化URI

17.restful风格API对应的数据库操作
GET（SELECT）：从服务器取出资源（一项或多项),POST（CREATE）：在服务器新建一个资源。
PUT（UPDATE）：在服务器更新资源（客户端提供改变后的完整资源）。DELETE（DELETE）：从服务器删除资源。