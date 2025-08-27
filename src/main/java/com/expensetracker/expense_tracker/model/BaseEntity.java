package com.expensetracker.expense_tracker.model;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity {
    private LocalDate createdAt;
    private String createdBy;
    private LocalDate modifiedAt;
    private String modifiedBy;
}
