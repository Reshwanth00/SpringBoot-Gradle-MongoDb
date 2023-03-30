package com.example.demo.Service;

import com.example.demo.Model.User;
import com.example.demo.RepositoryLayer.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepositor;

    public User delUser(int id) {
        User user = userRepositor.findById(id).get();
        userRepositor.delete(user);
        return user;
    }

    public void addUser(User user) {
        userRepositor.save(user);
    }

    public List<User> getUser() {
        List<User> list = userRepositor.findAll();
        return list;
    }

    public void putUser(int id, String name) {
        User user = userRepositor.findById(id).get();
        user.setName(name);
        userRepositor.save(user);
    }
}
