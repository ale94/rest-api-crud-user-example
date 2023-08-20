package com.alejandro_example.restapicruduser.services;

import com.alejandro_example.restapicruduser.entities.UserEntity;
import com.alejandro_example.restapicruduser.repositories.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<UserEntity> getAll() {
        return userRepository.findAll();
    }

    public UserEntity getId(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public UserEntity create(UserEntity user) {
        return userRepository.save(user);
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    public UserEntity update(Long id, UserEntity user) {
        UserEntity newUser = this.getId(id);
        if (user.getName() != null) {
            newUser.setName(user.getName());
        }
        if (user.getUsername() != null) {
            newUser.setUsername(user.getUsername());
        }
        if (user.getEmail() != null) {
            newUser.setEmail(user.getEmail());
        }
        if (user.getPhone() != null) {
            newUser.setPhone(user.getPhone());
        }
        return userRepository.save(newUser);
    }


}
