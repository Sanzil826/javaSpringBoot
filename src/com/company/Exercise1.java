package com.company;
import java.util.Scanner;

public class Exercise1 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of english");
        int sub1= sc.nextInt();
        System.out.println("Enter marks of science");
        int sub2= sc.nextInt();
        System.out.println("Enter marks of maths");
        int sub3= sc.nextInt();
        System.out.println("Enter marks of social");
        int sub4= sc.nextInt();
        System.out.println("Enter marks of nepali");
        int sub5= sc.nextInt();
        float sum = sub1 + sub2 +sub3 +sub4 +sub5;
        float percentage = (sum/5);
        System.out.println("The percentage is:"+percentage);
    }
    }

