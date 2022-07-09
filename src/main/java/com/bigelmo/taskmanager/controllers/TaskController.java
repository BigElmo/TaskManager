package com.bigelmo.taskmanager.controllers;

import com.bigelmo.taskmanager.dao.TaskJpaRepository;
import com.bigelmo.taskmanager.models.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/task")
@Controller
public class TaskController {

    private TaskJpaRepository taskJpaRepository;

    @GetMapping("/list")
    public String taskList(Model model) {
        List<Task> tasks = taskJpaRepository.findAll();
        model.addAttribute("tasks", tasks);
        return "task/list";
    }

    @Autowired
    public void setTaskJpaRepository(TaskJpaRepository taskJpaRepository) {
        this.taskJpaRepository = taskJpaRepository;
    }
}
