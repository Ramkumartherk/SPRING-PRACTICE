package com.cl.cs1.service;

import com.cl.cs1.model.User;

public interface UserService {
    void save(User user);
    void saveRole(Iterable i);
    User findByUsername(String username);
}
//	boolean authenticateUser(String username, String password);

