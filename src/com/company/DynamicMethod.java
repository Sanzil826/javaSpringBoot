package com.company;

class Phone{
    public void greet(){
        System.out.println("Good Morning");
    }

    public void name(){
        System.out.println("My name is JAVA in class Phone");
    }
}

class SmartPhone extends Phone{
    public void swagat(){
        System.out.println("Namaste");
    }

    public void name(){
        System.out.println("My name is JAVA in class SmartPhone");
    }
}

public class DynamicMethod {
    static void main(String[] args) {
//        Phone p = new Phone();
//        SmartPhone sp = new SmartPhone();
//        p.name();

        Phone obj = new SmartPhone();
//        SmartPhone obj1 = new Phone(); //Not allowed
        obj.greet();
        obj.name();
//        obj.swagat();//Not allowed
    }
}
