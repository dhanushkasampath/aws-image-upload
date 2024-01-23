package com.amigoscode.awsimageupload.datastore;

import com.amigoscode.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("6facad79-a6c2-43b6-8efe-b80a0a8c8408"), "dhanushka", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("5e14a438-b996-4ef8-948b-3ebdcf25892b"), "sampath", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("7e59c641-f09d-47ac-b4bd-be14e57600fc"), "kumara", null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}
