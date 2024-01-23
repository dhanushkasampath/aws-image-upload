package com.amigoscode.awsimageupload.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonConfig {

    @Bean
    public AmazonS3 s3(){
//        AWSCredentials awsCredentials = new BasicAWSCredentials("AKIAYTJDDKJ67T3FESFJ","apOWvnPTibwy2cvZA04263P8jzmBazpwv/OBXg17");
        AWSCredentials awsCredentials = new BasicAWSCredentials("AKIAYTJDDKJ67ITF6YWC","DxI1zJDmQ2e8B6tQ3w2GmoShYpa1GgfKtT/p9MN2");
        return AmazonS3ClientBuilder
                .standard()
                .withRegion("eu-west-1")
                .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
                .build();
    }
}
