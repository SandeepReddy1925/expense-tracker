package com.expensetracker.expense_tracker.model;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;
import lombok.Data;


import lombok.Generated;

import java.time.LocalDate;

@JsonPropertyOrder({
        "id",
        "name",
        "email",
        "password",
        "createdAt",
        "createdBy",
        "modifiedAt",
        "modifiedBy"
})
@Data
@Entity
@Table(name="users")
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   // @Column(name="id")
    private int id;
    private String name;
    private String email;
    private String password;
}
