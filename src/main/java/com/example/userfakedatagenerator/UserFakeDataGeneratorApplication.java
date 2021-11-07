package com.example.userfakedatagenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserFakeDataGeneratorApplication {

    // TODO:
    // 1. fix replacing error (+)
    // 2. find way to generate random local characters (+)
    // 3. add double error value handling
    // 4. add local characters handling depends on field

    public static void main(String[] args) {
        SpringApplication.run(UserFakeDataGeneratorApplication.class, args);
    }
}
