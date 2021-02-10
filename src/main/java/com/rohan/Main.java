package com.rohan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.rohan.config.SpringConfiguration;
import com.rohan.controller.UserController;

public class Main {
    public static void main(String[] args) {
    	AbstractApplicationContext appContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
    	UserController c = appContext.getBean("userController", UserController.class);	
    	System.out.println(c);
    }
}
