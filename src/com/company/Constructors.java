package com.company;
class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(int id, String name){
        this.id = id;
        this.name= name;
        System.out.println("There are two arguments");
    }

    public MyMainEmployee(int id){
        this.id = id;
        System.out.println("There is only one argument");
    }

    public MyMainEmployee(){
        System.out.println("There is no arguments");
    }

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public void setId(int i){
        id=i;
    }
}
public class Constructors {
    static void main(String[] args) {
        MyMainEmployee harry = new MyMainEmployee();
        System.out.println(harry.getName());
        System.out.println(harry.getId());
    }
}
