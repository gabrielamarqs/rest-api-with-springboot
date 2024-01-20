package com.gmarques.restapi.entity;

import jakarta.persistence.*;
import jakarta.persistence.GenerationType;

import java.util.Set;

@Entity
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Long userId;
    @Column(nullable = false, name="user_name")
    private String name;
    @Column(nullable = false, name="user_email", unique = true)
    private String email;
    @Column(nullable = false, name="user_password")
    private String password;

    @ManyToMany
    private Set<Role> roles;

    public User() {
    }

    public User(Long userId, String name, String email, String password, Set<Role> roles) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
