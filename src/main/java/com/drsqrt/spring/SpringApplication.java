package com.drsqrt.spring;

import com.drsqrt.spring.configurations.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
    System.out.println("Application Init : " + context.getApplicationName());
  }
}
