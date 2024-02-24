package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
        Carrier carrier=context.getBean("carrier",Carrier.class);
        carrier.callTheService();
        System.out.println("Hello world!");
    }
}