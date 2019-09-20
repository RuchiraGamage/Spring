package io.javabrains.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

//whatever we request from restApi return as json by spring framework transform in to json
@RestController
public class TopicController {

    //through auto wired when spring create instance of this it search registry for instance of required service singleton object and take that instance and inject to this
     @Autowired
    private TopicService topicService;

    //what ever we return convert to a json and return as a http response.springMVC handle json conversions
    //it maps http request with whatever get,put,delete,post with the uri and method in the controller
    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){

        return topicService.getAllTopic();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable int id){

        return topicService.getTopic(id);
    }

    //here post we get jason payload from request body and spring pass it in to Topic object which we needed
    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic,@PathVariable int id){
        topicService.updateTopic(topic,id);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/topics/{id}")
    public void deleteTopic(@PathVariable int id){
        topicService.deleteTopic(id);
    }

}