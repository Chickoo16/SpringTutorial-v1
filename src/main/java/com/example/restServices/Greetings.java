package com.example.restServices;

public class Greetings {
    private long id;
    private String content;

    public Greetings(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return this.id;
    }

    public String getContent() {
        return this.content;
    }
}
