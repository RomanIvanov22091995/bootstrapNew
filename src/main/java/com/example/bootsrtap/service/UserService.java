package com.example.bootsrtap.service;

import com.example.bootsrtap.model.User;
import java.util.List;

public interface UserService {
    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(long id);

    List<User> getAllUsers();

    User getUserByEmail(String email);

    User getUserById(long id);
}
