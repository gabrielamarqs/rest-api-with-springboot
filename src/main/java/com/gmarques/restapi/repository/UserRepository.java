package com.gmarques.restapi.repository;

import com.gmarques.restapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    boolean existsByEmail(String email);
    User findByNameOrEmail(String username, String email);
}
