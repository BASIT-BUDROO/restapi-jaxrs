package com.example.restglassfishhelloworld.resource;

import com.example.restglassfishhelloworld.model.Comment;
import com.example.restglassfishhelloworld.service.CommentService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/")
public class CommentResource {

    CommentService commentService = new CommentService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> getComments(@PathParam("messageId") Long messageId) {
        return commentService.getAllComments(messageId);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addComment(@PathParam("messageId") Long messageId, Comment comment) {
        commentService.addComment(messageId, comment);
    }

}

