package com.xinchenh.Spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//在这个包里寻找component
@ComponentScan(basePackages="com.xinchenh.Spring")
public class AppConfig {

//  需要Annotation 说明这是一个bean
//    @Bean
//    public Samsung getPhone(){
//        return new Samsung();
//    }
//
//    @Bean
//    public MobileProcessor getProcessor(){
//        return new Snapdragon();
//    }
}
