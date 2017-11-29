//package com.disney.ensemble.monitor;
//
//import com.disney.ensemble.aop.Loggable;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
//@Component
//public class HelloWorldService {
//
//    @Value("${name:World}")
//    private String name;
//
//    public String getHelloMessage() {
//        return "Hello " + this.name;
//    }
//
//    public String getDoMagicMessage() {
//        return "DoMagic " + this.name;
//    }
//
//    @Loggable
//    public String getAnnotatedDoMagicMessage() {
//        return "Annotated DoMagic " + this.name;
//    }
//
//
//}