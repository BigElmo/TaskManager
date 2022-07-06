package com.bigelmo.taskmanager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/task")
@Controller
public class TaskController {

    private List<String> tasks;

    @GetMapping("/list")
    public String taskList(Model model) {
        model.addAttribute("tasks", tasks);
        return "task/list";
    }

    public List<String> getTasks() {
        return tasks;
    }

    @Autowired
    public void setTasks(List<String> tasks) {
        this.tasks = tasks;
    }
}
