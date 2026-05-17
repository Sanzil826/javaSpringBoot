package com.company;
import java.lang.String;
import java.util.Scanner;

public class Strings {
    static void main(String[] args) {
        String name = new String("harry");
        System.out.println(name);
        int a=10;
        double b =1.54;
        System.out.printf("The value of a is %d and b is %f",a,b);
        System.out.format("The value of a is %d and b is %f",a,b);
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        System.out.println(c);
    }
}
