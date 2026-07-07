package com.tnsif.shoppingmall.repository;

import com.tnsif.shoppingmall.entity.User;

import org.springframework.data.repository.CrudRepository;


public interface UserRepo extends CrudRepository<User, Integer>{
}