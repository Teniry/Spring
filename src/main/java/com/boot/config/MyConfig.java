package com.boot.config;

import com.boot.Main;
import com.boot.bean.Student;
import com.boot.bean.Type;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableConfigurationProperties(Student.class)
//开启Student配置绑定功能
//把Student自动注册到容器
public class MyConfig {
    @Bean
    public Student student(){
        Student student=new Student("wj",18);
        return student;
    }

    @Bean
    public Type type(){
        Type type=new Type("Teacher",15);
        return type;
    }

    public static void main(String[] args) {
        //1、返回我们IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(Main.class, args);

        //2、查看容器里面的组件
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

        boolean tom = run.containsBean("tom");
        System.out.println("容器中Tom组件："+tom);

        boolean user01 = run.containsBean("user01");
        System.out.println("容器中user01组件："+user01);

        boolean tom22 = run.containsBean("tom22");
        System.out.println("容器中tom22组件："+tom22);


    }

}
