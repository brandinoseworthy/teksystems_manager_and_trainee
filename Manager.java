package com.teksystems_manager_and_trainee;

public class Manager extends Employee {
    // fields
    // methods
    @Override
    public double transportAllowance () {
        return 0.15d * basicSalary;
    }

    // constucors
    public Manager(long Id, String Name) {
        super(Id, Name);

    }
    public Manager(long Id, String Name, String address) {
        super(Id, Name, address);
    }
    public Manager(long Id, String Name, String address, Long phone, double salary)
    {   super(Id,Name, address, phone);
       basicSalary = salary;
    }

    public Manager(long Id) {
        super(Id);

    }





}// end class
