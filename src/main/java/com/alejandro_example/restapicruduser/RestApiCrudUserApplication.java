package com.alejandro_example.restapicruduser;

import com.alejandro_example.restapicruduser.entities.UserEntity;
import com.alejandro_example.restapicruduser.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiCrudUserApplication implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(RestApiCrudUserApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        var user1 = UserEntity.builder()
            .id(null)
            .name("Peter")
            .username("peter12")
            .email("peter@gmail.com")
            .phone("45633212")
            .build();

        var user2 = UserEntity.builder()
            .id(null)
            .name("Jhon")
            .username("jhonf22")
            .email("jhonf22@gmail.com")
            .phone("45129632")
            .build();

        var user3 = UserEntity.builder()
            .id(null)
            .name("Donny")
            .username("don8")
            .email("donny@gmail.com")
            .phone("63215896")
            .build();

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);

    }
}
