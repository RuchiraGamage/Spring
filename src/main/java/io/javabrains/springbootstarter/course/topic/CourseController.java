package io.javabrains.springbootstarter.course.topic;

import io.javabrains.springbootstarter.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//whatever we request from restApi return as json by spring framework transform in to json
@RestController
public class CourseController {

    //through auto wired when spring create instance of this it search registry for instance of required service singleton object and take that instance and inject to this
     @Autowired
    private CourseService courseService;

    //what ever we return convert to a json and return as a http response.springMVC handle json conversions
    //it maps http request with whatever get,put,delete,post with the uri and method in the controller
    @RequestMapping("/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable int id){

        return courseService.getAllCourses(id);
    }

    @RequestMapping("/topics/{topicId}/courses/{id}")
    public Course getCourse(@PathVariable int id){

        return courseService.getCourse(id);
    }

    //here post we get jason payload from request body and spring pass it in to Topic object which we needed
    @RequestMapping(method = RequestMethod.POST,value = "/topics/{topicId}/courses")
    public void addCourse(@RequestBody Course course,@PathVariable int topicId){
        course.setTopic(new Topic(topicId,"",""));
        courseService.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/topics/{topicId}/courses/{id}")
    public void updateCourse(@RequestBody Course course,@PathVariable int topicId, @PathVariable int id){
        course.setTopic(new Topic(topicId,"",""));
        courseService.updateCourse(course);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/topics/{topicId}/courses/{id}")
    public void deleteCourse(@PathVariable int id){
        courseService.deleteCourse(id);
    }

}