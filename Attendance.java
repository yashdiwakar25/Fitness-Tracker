package com.fittrack.model;

import java.time.LocalDate;

public class Attendance 
{

    private LocalDate date;
    private boolean present;

    public Attendance() 
    {
        this.date = LocalDate.now();
        this.present = true;
    }

    public LocalDate getDate() 
    {
        return date;
    }

    public boolean isPresent() 
    {
        return present;
    }

    public void setPresent(boolean present) 
    {
        this.present = present;
    }

    @Override
    public String toString() 
    {
        return "Date: " + date + " | Status: " + (present ? "Present" : "Absent");
    }
}