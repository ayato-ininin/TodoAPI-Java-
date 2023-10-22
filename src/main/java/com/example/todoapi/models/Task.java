package com.example.todoapi.models;

// DB保存用のEntity
// ORMには使用していない
public class Task {
    private long id;
    private String title;

    public Task(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}