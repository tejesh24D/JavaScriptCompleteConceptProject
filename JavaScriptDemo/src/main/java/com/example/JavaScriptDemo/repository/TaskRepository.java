package com.example.JavaScriptDemo.repository;




import com.example.JavaScriptDemo.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<Task, String> {
}

