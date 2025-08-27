package com.expensetracker.expense_tracker.controller;

import com.expensetracker.expense_tracker.model.User;
import com.expensetracker.expense_tracker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/registerUser")
    public User registerUser(@RequestBody User newUser)
    {
        User registeredUser=userService.registerUser(newUser);
        return registeredUser;
    }

}
