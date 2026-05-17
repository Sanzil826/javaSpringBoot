package com.company;
import java.util.Scanner;

public class LoopsPracticeSet {
    static void main(String[] args) {
        //Exercise1
//        for (int i = 1; i < 5 ; i++) {
//            for (int j =5;j>i;j--){
//                System.out.print("*\t");
//            }
//            System.out.println("\n");
//
//        }

        //Exercise2
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int num = sc.nextInt();
//        int sum =0;
//        while (num!=0){
//            sum= sum + 2*(num-1);
//            num--;
//        }
//        System.out.println("The sum is :"+sum);

        //Exercise3
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int num = sc.nextInt();
//        for (int i = 0; i <=10 ; i++) {
//            System.out.println(num+" X "+i+" = "+num*i);
//        }

        //Exercise4
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int num = sc.nextInt();
//        for (int i = 10; i >=0 ; i--) {
//            System.out.println(num+" X "+i+" = "+num*i);
//        }

        //Exercise5
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int num = sc.nextInt();
//        int f =1;
//        for(int i=1;i<=num;i++){
//            f = f*i;
//        }
//        System.out.println("The factorial is: "+f);

        //Exercise6
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int num = sc.nextInt();
//        int f =1;
//        while(num!=0){
//            f=f*num;
//            num--;
//        }
//        System.out.println("The factorial is "+f);

        //Exercise7
        int i=1;
        while(i<5){
            int j=5;
            while(j>i){
                System.out.print("*\t");
                j=j-1;
            }
            System.out.println("\n");
            i++;
        }
    }
}
