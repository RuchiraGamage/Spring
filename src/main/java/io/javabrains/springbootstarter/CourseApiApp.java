package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //tell spring boot to start this application
public class CourseApiApp {
    public static void main(String[] args){
        //we should crete a serverlet container and tell spring to host our application on it
        SpringApplication.run(CourseApiApp.class,args);
    }
}
