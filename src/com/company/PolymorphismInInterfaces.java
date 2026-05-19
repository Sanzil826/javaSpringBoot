package com.company;

interface Camera1{
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

interface Wifi1{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class CellPhone1{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickNumber(){
        System.out.println("Connecting... ");
    }

}

class SmartPhone2 extends CellPhone1 implements Wifi1,Camera1{
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

public class PolymorphismInInterfaces {
    static void main(String[] args) {
        Camera1 c = new SmartPhone2();//using smartphone as camera
//        c.getNetworks(); //not allowed
        c.takeSnap();
        c.recordVideo();
        c.record4KVideo();

        SmartPhone2 sp = new SmartPhone2();
        sp.connectToNetwork("TP LINK");
        sp.callNumber(983234238);
        sp.pickNumber();
    }
}
