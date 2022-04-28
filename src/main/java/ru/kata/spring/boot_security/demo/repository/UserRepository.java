package ru.kata.spring.boot_security.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserRepository {
    void addUser(User user);
    List<User> getAllUsers();
    void deleteUser(Long id);
    User getUserById(Long id);
    void updateUser(User user);
    User getUserByUsername(String username);
}
