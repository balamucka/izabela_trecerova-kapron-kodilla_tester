package com.kodilla.hibernate.repository;

import com.kodilla.hibernate.task.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Task, Integer> {
    List<Task> findByDuration(int duration);
}
