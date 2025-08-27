package com.expensetracker.expense_tracker.service;

import com.expensetracker.expense_tracker.model.User;
import com.expensetracker.expense_tracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    public User registerUser(User newUser)
    {
//        newUser.setCreatedAt(LocalDate.now());
//        newUser.setCreatedBy("USER");
        return userRepository.save(newUser);
    }

}
