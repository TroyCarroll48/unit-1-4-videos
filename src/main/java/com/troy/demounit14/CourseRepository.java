package com.troy.demounit14;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {

    public List<Course> findByName(String name);
    public List<Course> findByDescription(String name);
    public List<Course> findByTopicId(String topicId);
    public List<Course> getCourseByTopic(String topicId);



    void delete(String id);

    Course findOne(String id);
}
