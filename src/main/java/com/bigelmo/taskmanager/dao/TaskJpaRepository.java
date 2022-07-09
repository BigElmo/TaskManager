package com.bigelmo.taskmanager.dao;

import com.bigelmo.taskmanager.models.Task;
import com.bigelmo.taskmanager.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskJpaRepository extends JpaRepository<Task, Long> {

    List<Task> findAllByUser(User user);

    List<Task> findAllByUserIsNull();

    List<Task> findAllByUserNotNull();
}
