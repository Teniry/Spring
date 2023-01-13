package com.boot.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/*@Component*/
//@ConfigurationProperties(prefix = "student")
@ToString
@AllArgsConstructor     //有参构造
@NoArgsConstructor     //无参构造
@Data   //get(),set()方法
public class Student {
    private String name;
    private int age;


}
