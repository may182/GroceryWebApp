package com.Grocery.App.controller;

import com.Grocery.App.model.User;
import com.Grocery.App.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@CrossOrigin("*")
public class UserController {
  @Autowired
  private UserRepository userRepo;


  //Add user to the database

  @PostMapping(path = "createUser")
  public User createUser(@RequestBody User user){
      userRepo.save(user);
      return user;
  }

  @GetMapping(path = "user")
  public List<User> displayUser(){
    return userRepo.findAll();
  }





}
