package com.company;

interface Bicycle{
    int a =45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    void blowHornK3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle,HornBicycle{
    void blowHorn(){
        System.out.println("pee pee poo poo");
    }

    public void applyBrake(int decrement){
        System.out.println("apply brake");
    }
    public void speedUp(int increment){
        System.out.println("Acceleration");
    }

    public void blowHornK3g(){
        System.out.println("Horn 3g blown");
    }

    public void blowHornmhn(){
        System.out.println("Horn mhn blown");
    }
}

public class Interfaces {
    static void main(String[] args) {
        AvonCycle ac = new AvonCycle();
        ac.applyBrake(1);
        ac.speedUp(34);
        ac.blowHorn();
        System.out.println(ac.a);//You cannot modify the properties in interfaces as they are final
//        ac.a =78; //throws error
        ac.blowHornK3g();
        ac.blowHornmhn();
    }
}
