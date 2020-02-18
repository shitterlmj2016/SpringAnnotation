package com.xinchenh.Spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary 代表如果有这多个的话优先选择这个
@Primary
public class AppleASeries implements MobileProcessor{
    public void process(){
        System.out.println("A13 Bionic chip");
    }
}
