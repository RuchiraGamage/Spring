package io.javabrains.springbootstarter.topic;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.TopLevelAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//in spring service class is a singleton it only create once and inject through dependancy injection to the other services need it
@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;


    public List<Topic> getAllTopic()
    {
        List<Topic> topics=new ArrayList<Topic>();
        topicRepository.findAll()
                .forEach(topics::add);

        return topics;
    }

    public Topic getTopic(int id){

        //return topics.stream().filter(t->t.getId()==id).findFirst().get();
        return topicRepository.findOne(id);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic, int id) {

        topicRepository.save(topic);
    }

    public void deleteTopic(int id) {
      // topics.removeIf(t->t.getId()==id);
        topicRepository.delete(id);
    }
}
