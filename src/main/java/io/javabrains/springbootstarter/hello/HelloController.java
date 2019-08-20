package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//simple rest api usually is for just return json
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHi(){
        return "hi";
    }
}
