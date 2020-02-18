package com.xinchenh.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


//Component 会自动帮你配制
//Component("samsung") by default Non qualified and De capitialized
@Component
public class Samsung {

    @Autowired
    @Qualifier("snapdragon")
    //Qualifier代表优先要哪一个
    private MobileProcessor cpu;

    public void config(){
        System.out.println("Samsung Boom");
        cpu.process();
    }

    public MobileProcessor getCpu() {
        return cpu;
    }

    public void setCpu(MobileProcessor cpu) {
        this.cpu = cpu;
    }
}
