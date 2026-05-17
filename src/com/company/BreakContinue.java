package com.company;

public class BreakContinue {
    static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//            System.out.println("Java is great");
//            if(i==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//
//        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println("Java is great");
            if(i==2){
                System.out.println("Ending the loop");
                continue;
            }

        }
    }
}
