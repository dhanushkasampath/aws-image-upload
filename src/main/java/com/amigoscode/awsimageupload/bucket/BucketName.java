package com.amigoscode.awsimageupload.bucket;

public enum BucketName {
    PROFILE_IMAGE("dhanushka-amigo-image-upload");

    private final String bucketName;


    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName(){
        return bucketName;
    }
}
