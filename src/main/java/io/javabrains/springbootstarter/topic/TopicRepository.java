package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ruchira on 9/20/2019.
 * this is for data layer which doesn't need to build scratch but using crudRepository
 */
public interface TopicRepository extends CrudRepository<Topic,Integer> {

}
