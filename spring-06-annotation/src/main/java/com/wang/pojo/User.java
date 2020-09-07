package com.wang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//等价于       <bean id="user" class="com.wang.pojo.User"/>
//@Component    组件, bean的名字默认为小写class
@Component
public class User {

    //相当于    <bean id="user" class="com.wang.pojo.User">
    //        <property name="name" value="sky wang"/>
    //    </bean>
    @Value("sky wang")
    public String name;
}
