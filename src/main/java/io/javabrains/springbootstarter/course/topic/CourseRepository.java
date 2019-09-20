package io.javabrains.springbootstarter.course.topic;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Ruchira on 9/20/2019.
 * this is for data layer which doesn't need to build scratch but using crudRepository
 */
public interface CourseRepository extends CrudRepository<Course,Integer> {

    //here the naming convention give ability to impliment the method by JPA by looking at the field in the classes
    public List<Course> findByTopicId(int id);

}
