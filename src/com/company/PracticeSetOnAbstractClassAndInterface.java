package com.company;

//Exercise1
//abstract class Pen{
//    abstract void write();
//    abstract void refill();
//}
//
//class FountainPen extends Pen{
//    public void write(){
//        System.out.println("Writing...");
//    }
//
//    public void refill(){
//        System.out.println("Refilling...");
//    }
//}

//Exercise2
class Monkey{
    void jump(){
        System.out.println("jumping");
    }

    void bite(){
        System.out.println("Biting");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    @Override
    public void eat(){
        System.out.println("Eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}

//Exercise3

//abstract class Telephone{
//    abstract void ring();
//    abstract void lift();
//    abstract void disconnect();
//}
//
//class SmartTelephone extends Telephone{
//    public void ring(){
//        System.out.println("Ringing...");
//    }
//
//    public  void lift(){
//        System.out.println("Lifting");
//    }
//
//    public void disconnect(){
//        System.out.println("Disconnect");
//    }
//
//    void selfie(){
//        System.out.println("Taking a selfie");
//    }
//}

public class PracticeSetOnAbstractClassAndInterface {
    static void main(String[] args) {
        //Exercise1
//        FountainPen fp = new FountainPen();
//        fp.write();
//        fp.refill();

        //Exercise2
//        Human h = new Human();
//        h.jump();
//        h.eat();
//        h.sleep();
//        h.bite();

        //Exercise3
//        Telephone t = new SmartTelephone();
//      t.selfie();-->throws an error
//        t.disconnect();
//        t.lift();
//        t.ring();

        //Exercise4
        Monkey m = new Human();
        m.bite();
        m.jump();
//        m.eat(); --> throws an error
//        m.sleep(); --> throws an error
    }
}
