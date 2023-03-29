package com.example.demo.ControllerLayer;

import com.example.demo.Model.User;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/post")
    public ResponseEntity<String> addUser(@RequestBody User user){
        userService.addUser(user);
        return new ResponseEntity<>("Success", HttpStatus.ACCEPTED);
    }
    @GetMapping("/get")
    public ResponseEntity<List<User>> getUser(){
        return new ResponseEntity<>(userService.getUser(),HttpStatus.ACCEPTED);
    }
    @PutMapping("/put")
    public ResponseEntity<String> putUser(@RequestParam int id,@RequestParam String name){
        userService.putUser(id,name);
        return new ResponseEntity<>("Changed",HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/delete")
    public ResponseEntity<User> delUser(@RequestParam int id){
        User user = userService.delUser(id);
        return new ResponseEntity<>(user,HttpStatus.ACCEPTED);
    }
}
