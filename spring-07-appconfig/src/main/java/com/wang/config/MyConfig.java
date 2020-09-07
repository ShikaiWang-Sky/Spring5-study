package com.wang.config;

import com.wang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//这个也会被Spring容器托管, 注册到容器中, 因为它本来就是一个@Component
//@Configuration代表这是一个配置类, 和beans.xml的作用是一致的
@Configuration

//开启包扫描, 参数为包的路径
@ComponentScan("com.wang.pojo")

//引入配置类,参数为被引入类的class属性
@Import(MyConfig2.class)

public class MyConfig {

    //注册一个bean, 就相当于我们之前在xml中写的一bean标签
    //这个方法的名字就相当于bean标签中的id属性
    //这个方法的返回值就相当于bean标签中的class属性
    @Bean
    public User user() {
        //返回值就是要注入到bean中的对象
        return new User();
    }

}
