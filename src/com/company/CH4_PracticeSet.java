package com.company;
import java.util.Scanner;

public class CH4_PracticeSet {
    static void main(String[] args) {
        //Que2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for English");
        double sub1 = sc.nextDouble();

        System.out.println("Enter marks for Science");
        double sub2 = sc.nextDouble();

        System.out.println("Enter marks for Maths");
        double sub3 = sc.nextDouble();

        double sum = sub1 + sub2 +sub3;
        double per = sum/3;

        System.out.println("Your percentage is "+per);

        if((sub1>=33 && sub2>=33 && sub3>=33) && (per >=40))
            System.out.println("You pass");
        else
            System.out.println("You failed");

        //Que 3
//        Scanner sc = new Scanner(System.in);
//        double tax = 0;
//        System.out.println("Enter your salary:");
//        double sal = sc.nextDouble();
//        if (sal>=250000 && sal <500000){
//             tax = tax + (sal-250000)*0.05;
//            System.out.println("You paid Rs"+tax+" in tax");
//        }
//        else if (sal>=500000 && sal <1000000){
//            tax = tax + (500000-250000)*0.05;
//             tax = tax + (sal-500000)*0.2;
//            System.out.println("You paid Rs"+tax+" in tax");
//        }
//        else if (sal >=1000000) {
//            tax = tax + (500000-250000)*0.05;
//            tax = tax + (1000000-500000)*0.2;
//             tax = tax + (sal-1000000)*0.3;
//            System.out.println("You paid Rs"+tax+" in tax");
//        }
//        else
//            System.out.println("You are too poor to pay tax");

        //Que 4
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number from 1 to 7:");
//        int day = sc.nextInt();
//        switch (day) {
//            case 1 -> System.out.println("Sunday");
//            case 2 -> System.out.println("Monday");
//            case 3 -> System.out.println("Tuesday");
//            case 4 -> System.out.println("Wednesday");
//            case 5 -> System.out.println("Thursday");
//            case 6 -> System.out.println("Friday");
//            default -> System.out.println("Saturday");
//        }

        //Que 5
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your website:");
//        String website = sc.nextLine();
//        if (website.endsWith(".org"))
//            System.out.println("Organization website");
//        else if (website.endsWith(".com"))
//            System.out.println("Commercial website");
//        else if (website.endsWith(".in"))
//            System.out.println("Indian Website");
//        else System.out.println("Unknown website");
        }


    }

