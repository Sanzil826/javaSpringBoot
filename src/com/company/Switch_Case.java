package com.company;
import java.util.Scanner;

public class Switch_Case {
    static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        switch (age) {
            case 18 -> System.out.println("You can drive");
            case 23 -> System.out.println("You need to find a job");
            case 60 -> System.out.println("You need to retire");
            default -> System.out.println("Enjoy your life");
        }
    }
}
