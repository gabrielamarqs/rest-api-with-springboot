package com.gmarques.restapi.service;

import com.gmarques.restapi.model.User;

import java.util.List;

public interface UserService {
    public String createUser(User user);

    String updateUser(User user);

    public String deleteUser(Long userId);
    public User getUser(Long userId);
    public List<User> getAllUsers();
    public boolean isUserExists(String email);
}
