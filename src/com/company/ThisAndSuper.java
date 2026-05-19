package com.company;

class One{
    int a;

    One(){
        System.out.println("Base class constructor");
    }

    One(int a){
       this.a =a;
        System.out.println("Base constructor with parameter");
    }

    public int returnOne(){
        return a;
    }
}

class Two extends One{
    Two(){
        System.out.println("derived class constructor");
    }

   public Two(int c){
       super(c);
        System.out.println("Derived constructor with parameter");
    }
}

public class ThisAndSuper {
    static void main(String[] args) {
//    One o =new One(45);
//    System.out.println(o.returnOne());
    Two t = new Two();
    }
}
