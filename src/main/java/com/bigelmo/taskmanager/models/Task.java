package com.bigelmo.taskmanager.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private int priority;

    @ManyToOne
    private User user;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public Task() {
    }
}
