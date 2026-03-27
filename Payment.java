package com.fittrack.model;

import java.time.LocalDate;

public class Payment 
{

    private double amount;
    private LocalDate date;
    private String type; 
    
    public Payment(double amount, String type) 
    {
        setAmount(amount);
        setType(type);
        this.date = LocalDate.now();
    }

    public double getAmount() 
    {
        return amount;
    }

    public LocalDate getDate() 
    {
        return date;
    }

    public String getType() 
    {
        return type;
    }

    public void setAmount(double amount) 
    {
        if (amount <= 0) 
        {
            throw new IllegalArgumentException("Amount must be positive");
        }
        this.amount = amount;
    }

    public void setType(String type) 
    {
        if (type == null || type.isEmpty()) 
        {
            throw new IllegalArgumentException("Payment type cannot be empty");
        }
        this.type = type;
    }

    @Override
    public String toString() 
    {
        return "Date: " + date +
               " | Amount: ₹" + amount +
               " | Type: " + type;
    }
}