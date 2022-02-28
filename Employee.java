package com.teksystems_manager_and_trainee;

import org.w3c.dom.ls.LSOutput;

public class Employee {

    // fields
    public long employeeID;
    public String emplpoyeeName;
    public String employeeAddress;
    public Long emplpoyeePhone;
    double basicSalary;
    double specialAllowance = 250.80d;
    double Hra = 1000.50d;

    // methods
    public double calculateSalary () {
        return basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * Hra/100);
    }

    public double transportAllowance () {
        return .1d * basicSalary;
    }

    // constructors
    public Employee(long Id)
    {
        this.employeeID = Id;

    }
    public Employee(long Id, String Name)
    {
        this.employeeID = Id;
        this. emplpoyeeName = Name;
    }
    public Employee(long Id, String Name, String address)
    {
        this.employeeID = Id;
        this. emplpoyeeName = Name;
        this.employeeAddress = address;
    }
    public Employee(long Id, String Name, String address, Long phone)
        {
            this.employeeID = Id;
            this. emplpoyeeName = Name;
            this.employeeAddress = address;
            this.emplpoyeePhone =  phone;
        }

    // getters and setters


} // end class
