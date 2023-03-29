package com.example.demo.Service;

import com.example.demo.Model.User;
import com.example.demo.RepositoryLayer.UserRepositor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepositor userRepositor;

    public User delUser(int id) {
        User user = userRepositor.findById(id).get();
        userRepositor.delete(user);
        return user;
    }
}
