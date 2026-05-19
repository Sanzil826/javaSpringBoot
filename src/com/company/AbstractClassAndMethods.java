package com.company;
import java.lang.Override;

abstract class Base1{
    public Base1(){
        System.out.println("constructor of Base1");
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    abstract public void greet();
    abstract public void greet1();
}

class Derived1 extends Base1{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet1(){
        System.out.println("Good Afternoon");
    }
}

abstract class Derived2 extends Base1{
    public void print(){
        System.out.println("Hello world");
    }

}

public class AbstractClassAndMethods {
    static void main(String[] args) {
//        Base1 b = new Base1();//throws error as we cannot create objects of abstract classes
        Derived1 d = new Derived1();
        d.greet();
        d.greet1();
        d.sayHello();
//        Derived2 d2= new Derived2();//throws an error
    }
}
