package com.company;

class MyEmployee{
    private int id;
    private String name;

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

public class GetterSetter {
    static void main(String[] args) {
    MyEmployee harry = new MyEmployee();
//    harry.id = 34; //throws error dur to private
//    harry.name = "Harry";
        harry.setId(12);
        harry.setName("Harry Bahadur");
        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}
