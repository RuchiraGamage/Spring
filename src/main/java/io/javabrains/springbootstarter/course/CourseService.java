package io.javabrains.springbootstarter.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


//in spring service class is a singleton it only create once and inject through dependancy injection to the other services need it
@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;


    public List<Course> getAllCourses(int id)
    {
        List<Course> courses=new ArrayList<Course>();
        courseRepository.findByTopicId(id)
                .forEach(courses::add);

        return courses;
    }

    public Course getCourse(int id){

        //return topics.stream().filter(t->t.getId()==id).findFirst().get();
        return courseRepository.findOne(id);
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {

        courseRepository.save(course);
    }

    public void deleteCourse(int id) {
      // topics.removeIf(t->t.getId()==id);
        courseRepository.delete(id);
    }
}
