package io.javabrains.springbootstarter.topic;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//in spring service class is a singleton it only create once and inject through dependancy injection to the other services need it
@Service
public class TopicService {

    private List<Topic> topics= new ArrayList<Topic>( Arrays.asList(
            new Topic(1,"1st topic","Spring discription"),
            new Topic(2,"2nd topic","Spring controllers"),
            new Topic(3,"3st topic","Spring request mapping"),
            new Topic(4,"4st topic","Spring application"),
            new Topic(5,"5st topic","Spring serverlet")
    ));


    public List<Topic> getAllTopic(){
        return topics;
    }

    public Topic getTopic(int id){

        return topics.stream().filter(t->t.getId()==id).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(Topic topic, int id) {
        for (int i = 0; i <topics.size() ; i++) {
            if (topics.get(i).getId()==id){
                topics.set(i,topic);
            }
        }

    }

    public void deleteTopic(int id) {
       topics.removeIf(t->t.getId()==id);
    }
}
