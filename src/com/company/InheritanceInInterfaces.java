package com.company;

interface sampleInterface{
    void meth1();
    void meth2();
}

interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}

class MySampleClass implements childSampleInterface{
    public void meth3(){
        System.out.println("Method 3");
    }

    public void meth4(){
        System.out.println("Method 4");
    }


    public void meth1(){
        System.out.println("Method 1");
    }

    public void meth2(){
        System.out.println("Method 2");
    }
}

public class InheritanceInInterfaces {
    static void main(String[] args) {
        MySampleClass sc = new MySampleClass();
        sc.meth1();
        sc.meth2();
        sc.meth3();
        sc.meth4();
    }
}
