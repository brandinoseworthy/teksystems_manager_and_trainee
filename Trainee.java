package com.teksystems_manager_and_trainee;

public class Trainee extends Employee {
        public Trainee(long Id, String Name) {
            super(Id, Name);

        }
        public Trainee(long Id, String Name, String address) {
            super(Id, Name, address);
        }
        public Trainee(long Id, String Name, String address, Long phone, double salary)
        {   super(Id,Name, address, phone);
            basicSalary = salary;

        }

        public Trainee(long Id) {
            super(Id);

        }

}// end class
