package io.javabrains.springbootstarter.subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ruchira on 9/21/2019.
 */

@Service
public class SubjectService {

    @Autowired
    SubjectRepository subjectRepository;


    public List<Subject> getAllSubjects(int topicId, int courseId) {
        return subjectRepository.findByCourseId(courseId);
    }

    public Subject getSubject(int id) {
      return subjectRepository.findOne(id);
    }

    public void addSubject(Subject subject) {
        subjectRepository.save(subject);
    }

    public void updateSubject(Subject subject) {
        subjectRepository.save(subject);
    }

    public void deleteSubject(int id) {
        subjectRepository.delete(id);
    }
}
