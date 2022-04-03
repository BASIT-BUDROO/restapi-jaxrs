package com.example.restglassfishhelloworld.resource;

import java.util.List;

import com.example.restglassfishhelloworld.model.Profile;
import com.example.restglassfishhelloworld.service.ProfileService;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/profiles")
public class ProfileResource {

    ProfileService profileService = new ProfileService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Profile> getProfile() {
        return profileService.getAllProfiles();
    }

    @GET
    @Path("/{profileName}")
    @Produces(MediaType.APPLICATION_JSON)
    public Profile getProfile(@PathParam("profileName") String profileName) {
        return profileService.getProfile(profileName);
    }

    @POST
    @Path("/{profileName}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Profile addProfile(Profile profile, @PathParam("profileName") String profileName) {
        return profileService.addProfile(profile, profileName);
    }

    @PUT
    @Path("/{profileName}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Profile updateProfile(Profile profile, @PathParam("profileName") String profileName) {
        return profileService.updateProfile(profile, profileName);
    }

    @DELETE
    @Path("/{profileName}")
    public void deleteProfile(@PathParam("profileName") String profileName) {
        profileService.removeProfile(profileName);
    }


}