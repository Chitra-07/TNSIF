package com.tnsif.shoppingmall.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.shoppingmall.entity.User;
import com.tnsif.shoppingmall.repository.UserRepo;

@Service
public class UserService {

    @Autowired
    private UserRepo ur;

    
    public User registerUser(User u) {
        return ur.save(u);
    }

    
    public List<User> getUsers() {
        return (List<User>) ur.findAll();
    }

    
    public Optional<User> getUserById(Integer id) {
        return ur.findById(id);
    }

    
    public User updateUser(User u) {
        return ur.save(u);
    }

 
    public void deleteUser(Integer id) {
        ur.deleteById(id);
    }
}