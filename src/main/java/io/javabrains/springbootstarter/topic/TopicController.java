package io.javabrains.springbootstarter.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
//whatever we request from restApi return as json by spring framework transform in to json
public class TopicController {
    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return Arrays.asList(
                new Topic(1,"1st topic","Spring discription"),
                new Topic(2,"2nd topic","Spring controllers"),
                new Topic(3,"3st topic","Spring request mapping"),
                new Topic(1,"4st topic","Spring application"),
                new Topic(1,"5st topic","Spring serverlet")

        );
    }
}
