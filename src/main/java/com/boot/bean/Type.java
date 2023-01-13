package com.boot.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Type {
    private String Type;
    private int workAge;
}
