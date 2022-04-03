package com.example.restglassfishhelloworld.service;

import com.example.restglassfishhelloworld.database.DatabaseClass;
import com.example.restglassfishhelloworld.model.Comment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class CommentService {
    private final Map<Long, ArrayList<String>> comments = DatabaseClass.getComments();

    public CommentService() {

    }

    public ArrayList<String> getAllComments(Long messageId) {
        return comments.get(messageId);
    }

    public void addComment(Long messageId, Comment comment) {
        comment.setId(messageId);
        if (comments.get(messageId) != null) {
            comments.get(messageId).add(comment.getComment());
        } else {
            comments.put(messageId, new ArrayList<>(Collections.singletonList(comment.getComment())));
        }
    }
}
