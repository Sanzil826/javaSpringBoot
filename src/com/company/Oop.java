package com.company;

 class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("id is: "+id);
        System.out.println("name is: "+name);
    }

    public int getSalary(){
        return salary;
    }
}

public class Oop {

    static void main(String[] args) {
        Employee harry = new Employee();
        Employee john = new Employee();
        harry.id =12;
        harry.name ="Harry";
        harry.salary = 10000;

        john.id = 45;
        john.name ="John Gurung";
        john.salary = 20000;
//        System.out.println(harry.id);
//        System.out.println(harry.name);
        harry.printDetails();
        System.out.println(harry.getSalary());
        john.printDetails();
        System.out.println(john.getSalary());
    }
}
