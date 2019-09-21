package io.javabrains.springbootstarter.subject;

import io.javabrains.springbootstarter.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Ruchira on 9/21/2019.
 */
@RestController
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @RequestMapping("/topics/{topicId}/courses/{courseId}/subjects")
    public List<Subject> getAllSubjects(@PathVariable int topicId,@PathVariable int courseId){
       return subjectService.getAllSubjects(topicId,courseId);
    }

    @RequestMapping("/topics/{topicId}/courses/{courseId}/subjects/{id}")
    public Subject getSubject(@PathVariable int id){
        return subjectService.getSubject(id);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/topics/{topicId}/courses/{courseId}/subjects")
    public void addSubject(@RequestBody Subject subject,@PathVariable int courseId,@PathVariable int topicId){
        subject.setCourse(new Course(courseId,"","",topicId));
        subjectService.addSubject(subject);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/topics/{topicId}/courses/{courseId}/subjects/{id}")
    public void updateSubject(@RequestBody Subject subject,@PathVariable int courseId,@PathVariable int topicId){
        subject.setCourse(new Course(courseId,"","",topicId));
        subjectService.updateSubject(subject);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/topics/{topicId}/courses/{courseId}/subjects/{id}")
    public void deleteSubject(@PathVariable int id){
        subjectService.deleteSubject(id);
    }
}
