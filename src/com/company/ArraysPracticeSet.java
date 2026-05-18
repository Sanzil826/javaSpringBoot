package com.company;
//import java.util.Scanner;
//import java.util.Arrays;

public class ArraysPracticeSet {
    static void main(String[] args) {
        //Exercise1
//        double[] num = {1, 2.4, 3.6, 4, 5.0};
//        double sum =0;
//        for(double element: num){
//            sum=sum+element;
//        }
//        System.out.println("The sum is: "+sum);

        //Exercise2
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number:");
//        double a = sc.nextDouble();
//        int b =0;
//        double[] num = {1, 2.4, 3.6, 4, 5.0};
//        for (double element: num){
//            if(a==element){
//                 b++;
//            }
//        }
//        if(b>0){
//            System.out.println("The number is in the array");
//        }
//        else{
//            System.out.println("The number is not in the array");
//        }

        //Exercise3
//        int [] marks = {40,98,76,89,79,67,88};
//        int sum = 0;
//        for (int element: marks){
//            sum =sum+element;
//        }
//        double avg = sum/(marks.length);
//        System.out.println("The average is "+avg);

        //Exercise4
        int [][] matrixA = {{1,2,3},{4,5,6}};
        int [][] matrixB= {{7,8,9},{10,11,12}};
        int [][] sumMatrix = new int[2][3];

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        for (int i = 0; i < sumMatrix.length; i++) {
            for (int j = 0; j < sumMatrix[i].length; j++) {
                System.out.print(sumMatrix[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");
            }

        //Exercise5
//        int [] marks = {9,8,7,6,5,4,3,2,1,0};
//        int [] revMarks = new int[marks.length];
//        int j =0;
//        for (int i = marks.length-1; i >=0 ; i--) {
//            revMarks[i] = marks[j];
//            j++;
//        }
//        for (int element : revMarks){
//            System.out.print(element+", ");
//        }

        //Exercise6
//        int [] num = {2,34,56,76,99,23,45,76,85};
//        int max = num[0];
//        for(int element: num) {
//            if (element > max){
//                max = element;
//            }
//        }
//        System.out.println("The maximum value is: "+max);

        //Exercise7
//        int [] num = {34,56,76,99,23,45,76,85};
//        int min = num[0];
//        for(int element: num) {
//            if (element < min){
//                min = element;
//            }
//        }
//        System.out.println("The minimum value is: "+min);

        //Exercise8
//        int [] arr ={1,2,3,4,10,5,6,7,8,9};
//        int c = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    c++;
//                }
//            }
//        }
//        if(c>0) {
//            System.out.println("It is not sorted");
//        }
//        else{
//            System.out.println("It is sorted");
//        }
        }

        }






