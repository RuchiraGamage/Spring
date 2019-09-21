package io.javabrains.springbootstarter.subject;

import io.javabrains.springbootstarter.course.Course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by Ruchira on 9/21/2019.
 */
@Entity
public class Subject {
    @Id
    private int id;
    private String name;
    private String discription;

    @ManyToOne
    private Course course;

    public Subject(int id, String name, String discription, int courseId,int topicId) {
        this.id = id;
        this.name = name;
        this.discription = discription;
        this.course = new Course(courseId,"","",topicId);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
