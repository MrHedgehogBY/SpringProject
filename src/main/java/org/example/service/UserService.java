package org.example.service;

import org.example.models.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
