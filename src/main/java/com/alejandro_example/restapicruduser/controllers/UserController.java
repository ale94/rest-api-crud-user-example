package com.alejandro_example.restapicruduser.controllers;

import com.alejandro_example.restapicruduser.entities.UserEntity;
import com.alejandro_example.restapicruduser.services.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<UserEntity> getAll() {
        return userService.getAll();
    }

    @GetMapping("/users/{id}")
    public UserEntity getById(@PathVariable Long id) {
        return userService.getId(id);
    }

    @PostMapping("/users")
    public UserEntity create(@RequestBody UserEntity user) {
        return userService.create(user);
    }

    @DeleteMapping("/users/{id}")
    public String delete(@PathVariable Long id) {
        var user = userService.getId(id);
        return "User " + user.getId() + " deleted successfully";
    }

    @PutMapping("/users/{id}")
    public UserEntity update(@RequestBody UserEntity user, @PathVariable Long id) {
        return userService.update(id, user);
    }

}
