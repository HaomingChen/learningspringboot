package com.itguigu.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author Haoming Chen
 * Created on 2019/6/5
 * <p>
 * 将配置文件中配置的每一个属性的值，映射到这个组件中
 * @ConfigurationProperties 告诉springboot这个文件中的属性都是配置文件中的属性
 * prefix = "person" 配置文件中哪个下面的属性进行一一映射
 * 只有这个组件是容器中的组件， 才能使用容器提供的ConfigurationProperties功能
 */
@Component
@ConfigurationProperties(prefix = "person")
//@PropertySource(value = {"classpath:person.properties"})
public class Person {
    /**
     * <bean class = "Person">
     * <property name = "lastName" value = "字面量/${key}从环境变量，配置文件中获取值"></property>
     * </bean>
     */
    private String lastName;
    private Integer age;
    private Boolean boss;
    private Date birth;
    private Dog dog;

    private Map<String, Object> maps;
    private List<Object> lists;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", dog=" + dog +
                ", maps=" + maps +
                ", lists=" + lists +
                '}';
    }
}
