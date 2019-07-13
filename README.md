# learningspringboot
This is my personal project to study springboot

1.因版本原因无效: server.context-path:/hello
尝试: server.servlet.context-path:/hello

2.使用maven package打包时，仅有类路径下的配置文件会被打包

3.logback.xml自定义logback配置文件必须直接存放在resource文件夹下才会被读取

4.现在logback.xml不需要加上后缀变为logback-spring.xml就可以使用spring的标记语言属性例如<springProfile name="dev">标记
