package com.example.JavaScriptDemo.service;



import com.example.JavaScriptDemo.model.Task;
import com.example.JavaScriptDemo.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task addTask(Task task) {
        return taskRepository.save(task);
    }

    public void deleteTask(String id) {
        taskRepository.deleteById(id);
    }

    public Task completeTask(String id) {
        Task task = taskRepository.findById(id).orElseThrow();
        task.setCompleted(true);
        return taskRepository.save(task);
    }
}
