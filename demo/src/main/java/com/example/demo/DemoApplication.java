package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        //SpringContainer Object Reference
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        //Object is created by springContainer , you are getting reference only
        Greeter greeter = context.getBean(Greeter.class);
        System.out.println(greeter.sayGreet());

        //
        ProductService productService =context.getBean(ProductService.class);
        System.out.println(productService.findAll());


    }

}
