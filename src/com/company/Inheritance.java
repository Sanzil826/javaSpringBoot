package com.company;

class Base{
    private int x;

    public Base(){
        System.out.println("I am a base class constructor.");
    }

    public Base(int a){
        System.out.println("constructors that contains "+a);
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void print(){
        System.out.println("I am base class");
    }
}

class Derived extends Base {
    private int y;

    public Derived() {
//        super(90); //allows to call overloaded constructor with a parameter
        System.out.println("I am a derived constructor.");
    }

    public Derived(int x, int y) {
        super(x);
        System.out.println("I am a constructor with 2 parameters " + y);
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}

    class ChildDerived extends Derived{
        ChildDerived() {
            System.out.println("I am a child of Derived constructor");
        }
            ChildDerived(int x, int y, int z){
                super(x,y);
                System.out.println("I am a child of derived constructor "+z);
            }
        }



public class Inheritance {
    static void main(String[] args) {
//        Base b = new Base();
//        Derived d = new Derived(2,3);
        ChildDerived cd = new ChildDerived(1,2,3);

//        d.setY(56);
//        System.out.println("The value of y is "+d.getY());
//        d.setX(78);
//        System.out.println("The value of x is "+d.getX());
//        d.print();

    }
}
