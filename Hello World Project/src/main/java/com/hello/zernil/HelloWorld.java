package com.hello.zernil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(value = "com.hello.zernil.Hibernate")
@ComponentScan("com.hello.zernil.Controllers")
@ComponentScan("com.hello.zernil.Hibernate")
    public class HelloWorld {
        public static void main(String[] args) {
            SpringApplication.run(HelloWorld.class, args);
            System.out.println("Hello World");
        }
    }