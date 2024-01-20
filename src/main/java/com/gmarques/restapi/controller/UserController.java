package com.gmarques.restapi.controller;

import com.gmarques.restapi.entity.User;
import com.gmarques.restapi.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("{userId}")
    public User getUser (@PathVariable("userId") Long userId) {
        return userService.getUser(userId);
    }

    @PostMapping
    public String createUser (@RequestBody User user) {
        try {
            // Verifica se o email está vazio
            if (user.getEmail().isEmpty()) {
                throw new IllegalArgumentException("Email cannot be empty");
            }

            // Verifica se o email já está cadastrado no banco de dados
            if (userService.isUserExists(user.getEmail())) {
                throw new IllegalStateException("Email is already registered");
            }

            // Se tudo estiver correto, cria o usuário
            userService.createUser(user);

            return "User created successfully";
        } catch (Exception e) {
            return e.getMessage(); // Retorna a mensagem de exceção
        }
    }

    @PutMapping
    public String updateUser (@RequestBody User user) {
        userService.updateUser(user);
        return "User updated successfully";
    }

    @DeleteMapping("{userId}")
    public String deleteUser (@PathVariable("userId") Long userId) {
        userService.deleteUser(userId);
        return "User deleted successfully";
    }
}
