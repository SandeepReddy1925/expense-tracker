package com.expensetracker.expense_tracker.repository;

import com.expensetracker.expense_tracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String>{
}
