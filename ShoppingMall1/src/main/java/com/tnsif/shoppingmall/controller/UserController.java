package com.tnsif.shoppingmall.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tnsif.shoppingmall.entity.User;
import com.tnsif.shoppingmall.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService us;

    
    @PostMapping("/saveuser")
    public User registerUser(@RequestBody User u) {
        return us.registerUser(u);
    }

    
    @GetMapping("/getusers")
    public List<User> getUsers() {
        return us.getUsers();
    }

   
    @GetMapping("/getuser/{id}")
    public Optional<User> getUserById(@PathVariable("id") Integer id) {
        return us.getUserById(id);
    }

 
    @PutMapping("/updateuser")
    public User updateUser(@RequestBody User u) {
        return us.updateUser(u);
    }

    
    @DeleteMapping("/deleteuser/{id}")
    public void deleteUser(@PathVariable("id") Integer id) {
        us.deleteUser(id);
    }
}