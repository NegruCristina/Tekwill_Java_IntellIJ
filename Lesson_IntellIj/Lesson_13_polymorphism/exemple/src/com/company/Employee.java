package com.company;

import java.util.Date;

public class Employee extends Person {
    protected Date startDate;
    protected Long salary;
    public Employee(String n, int y, String a, Date startDate, Long salary){
        super(n, y, a);
        this.startDate=startDate;
        this.salary=salary;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
    public Long getSalary(){
        return salary;
    }
}
