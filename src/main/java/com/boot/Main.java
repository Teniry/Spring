package com.boot;

import com.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 主程序类
 * 这是SpringBoot应用
 */
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Main.class, args);
        MyConfig bean = run.getBean(MyConfig.class);
        System.out.println(bean.student());
        System.out.println(bean.type());


    }


}

