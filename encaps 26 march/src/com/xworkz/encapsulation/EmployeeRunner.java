package com.xworkz.encapsulation;

public class EmployeeRunner {
    public static void main(String[] args) {

        Employee employee = new Employee("Radha", 22);
        employee.display();


        employee.setName("Sonika");
        employee.setAge(22);

        employee.display();
    }
}

