package com.example.restglassfishhelloworld.database;

import com.example.restglassfishhelloworld.model.Message;
import com.example.restglassfishhelloworld.model.Profile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DatabaseClass {
    private static final Map<Long, Message> messages = new HashMap<>();
    private static final Map<String, Profile> profiles = new HashMap<>();
    private static final Map<Long, ArrayList<String>> comments = new HashMap<>();

    public static Map<Long, Message> getMessages() {
        return messages;
    }

    public static Map<String, Profile> getProfiles() {
        return profiles;
    }

    public static Map<Long, ArrayList<String>> getComments() {
        return comments;
    }
}
