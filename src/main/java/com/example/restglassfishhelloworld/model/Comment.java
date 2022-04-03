package com.example.restglassfishhelloworld.model;

public class Comment {
    private long id;
    private String comment;

    public Comment() {

    }

    public Comment(String comment) {
        this.comment = comment;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


}
