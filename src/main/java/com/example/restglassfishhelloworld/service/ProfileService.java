package com.example.restglassfishhelloworld.service;

import com.example.restglassfishhelloworld.database.DatabaseClass;
import com.example.restglassfishhelloworld.model.Profile;

import java.util.*;

public class ProfileService {
    private final Map<String, Profile> profiles = DatabaseClass.getProfiles();

    public ProfileService() {
        profiles.put("D-Knuth", new Profile(100L, "Donal E Knuth", "Donald", "Knuth"));
        profiles.put("J-Bentley", new Profile(200L, "Jon Bentley", "Jon", "Bentley"));
    }

    public List<Profile> getAllProfiles() {
        return new ArrayList<>(profiles.values());
    }

    public Profile getProfile(String profileName) {
        return profiles.get(profileName);
    }

    public Profile addProfile(Profile profile, String profileName) {
        profile.setId((profiles.size() + 1) * 100L);
        profile.setCreated(new Date());
        profiles.put(profileName, profile);
        return profile;
    }

    public Profile updateProfile(Profile profile, String profileName) {
        if (profileName.isEmpty()) {
            return null;
        }
        Profile old_profile = profiles.get(profileName);
        profile.setId(old_profile.getId());
        profile.setCreated(old_profile.getCreated());
        profiles.put(profileName, profile);
        return profile;
    }

    public void removeProfile(String profileName) {
        profiles.remove(profileName);
    }

}
