package com.gmarques.restapi.service.impl;

import com.gmarques.restapi.entity.User;
import com.gmarques.restapi.repository.UserRepository;
import com.gmarques.restapi.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService {

    UserRepository userRepository;

    public UserServiceImplementation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String createUser(User user) {
        userRepository.save(user);
        return "User created successfully";
    }

    @Override
    public String updateUser(User user) {
        userRepository.save(user);
        return "User updated successfully";
    }

    @Override
    public String deleteUser(Long userId) {
        userRepository.deleteById(userId.toString());
        return "User deleted successfully";
    }

    @Override
    public User getUser(Long userId) {
        return userRepository.findById(userId.toString()).get();
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public boolean isUserExists(String email) {
        return userRepository.existsByEmail(email);
    }
}
