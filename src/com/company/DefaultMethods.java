package com.company;
import java.lang.Override;

interface Camera{
    void takeSnap();
    void recordVideo();
    private void takingSnap(){
        System.out.println("Taking a picture");
    }
    default void record4KVideo(){
        takingSnap();
        System.out.println("Recording in 4K in interface");
    }
}

interface Wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class CellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickNumber(){
        System.out.println("Connecting... ");
    }

}

class SmartPhone1 extends CellPhone implements Wifi,Camera{
    public void recordVideo(){
        System.out.println("Recording a video");
    }

    public void takeSnap(){
        System.out.println("Taking a picture");
    }

    public void connectToNetwork(String network){
        System.out.println("Connecting to "+network);
    }

    public String[] getNetworks(){
        System.out.println("Getting list of network");
        String[] networkList = {"Harry","PrashantYt","Ronaldo"};
        return networkList;
    }
//     @Override
//     public void record4KVideo(){
//        System.out.println("Recording in 4K in class");
//    }
}

public class DefaultMethods {
    static void main(String[] args) {
        SmartPhone1 sp = new SmartPhone1();
        String[] ar = sp.getNetworks();
        for(String elem: ar){
            System.out.println(elem);
        }
        sp.record4KVideo();

    }
}
