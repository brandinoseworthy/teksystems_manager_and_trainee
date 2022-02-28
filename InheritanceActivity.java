package com.teksystems_manager_and_trainee;

public class InheritanceActivity {
    public static void main(String[] args) {

        Manager managerPeter = new Manager(126534, "Peter", "Chennai India", 237844L, 65000);
            System.out.println(managerPeter.calculateSalary()); // works

        Trainee traineeJack =  new Trainee(29846, "Jack", "Mumbai India", 442085L, 45000);
            System.out.println(traineeJack.calculateSalary()); // works

        System.out.println(managerPeter.transportAllowance()); // works

        System.out.println(traineeJack.transportAllowance()); // works






    }// end method



}// end class
