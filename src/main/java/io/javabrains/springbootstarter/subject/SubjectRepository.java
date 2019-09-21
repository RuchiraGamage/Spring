package io.javabrains.springbootstarter.subject;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Ruchira on 9/21/2019.
 */
public interface SubjectRepository extends CrudRepository<Subject,Integer> {

    public List<Subject> findByCourseId( int courseId);

}
