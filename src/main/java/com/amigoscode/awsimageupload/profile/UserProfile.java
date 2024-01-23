package com.amigoscode.awsimageupload.profile;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Optional;
import java.util.UUID;

@AllArgsConstructor
@Data
public class UserProfile {

    private final UUID userProfileId;
    private final String username;
    private String userProfileImageLink;

    public Optional<String> getUserProfileImageLink(){//so that the people who use this knows this is nullable
        return Optional.ofNullable(userProfileImageLink);
    }

    //todo have to override equals and hash code method
    //then create in-memory database
}
