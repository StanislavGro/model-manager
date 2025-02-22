package ru.youngstanis;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext applicationContext) {
//        return args -> {
//            System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//            String[] beadNames = applicationContext.getBeanDefinitionNames();
//
//            Arrays.sort(beadNames);
//            for(String beanName : beadNames) {
//                System.out.println(beanName);
//            }
//        };
//    }
}
