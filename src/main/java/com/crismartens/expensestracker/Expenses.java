package com.crismartens.expensestracker;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

import java.util.Objects;

@Entity
public class Expenses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long userId;
    private double amount;
    private Integer categoryId;
    private String description;

    public Expenses() {
    }
    public Expenses(long userId, double amount, Integer categoryId, String description) {
        this.id = id;
        this.userId = userId;
        this.amount = amount;
        this.categoryId = categoryId;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Expenses expenses = (Expenses) o;
        return id == expenses.id && userId == expenses.userId && Double.compare(amount, expenses.amount) == 0 && Objects.equals(categoryId, expenses.categoryId) && Objects.equals(description, expenses.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, amount, categoryId, description);
    }
}
