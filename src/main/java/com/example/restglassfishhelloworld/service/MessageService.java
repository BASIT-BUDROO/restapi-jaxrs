package com.example.restglassfishhelloworld.service;

import com.example.restglassfishhelloworld.database.DatabaseClass;
import com.example.restglassfishhelloworld.model.Message;

import java.util.*;

public class MessageService {

    private final Map<Long, Message> messages = DatabaseClass.getMessages();

    public MessageService() {
        messages.put(1L, new Message(100L, "The Art of Computer Programming Vol1", "Donal E Knuth"));
        messages.put(2L, new Message(200L, "The Art of Computer Programming Vol2", "Donal E Knuth"));
    }

    public List<Message> getAllMessages() {
        return new ArrayList<>(messages.values());
    }

    public Message getMessage(long id) {
        return messages.get(id);
    }

    public Message addMessage(Message message) {
        message.setId((messages.size() + 1)* 100L);
        message.setCreated(new Date());
        messages.put((long) (messages.size()+1), message);
        return message;
    }

    public Message updateMessage(Message message, long messageId) {
        if (messageId <= 0) {
            return null;
        }
        Message old_msg = messages.get(messageId);
        message.setId(old_msg.getId());
        message.setCreated(old_msg.getCreated());
        message.setAuthor(old_msg.getAuthor());
        messages.put(messageId, message);
        return message;
    }

    public void removeMessage(long id) {
        messages.remove(id);
    }
}
