package com.company;

public class Array {
    static void main(String[] args) {
//        int [] marks = new int[5];
        int[] marks = {100, 60, 74, 56, 35};
        String[] students = {"Harry", "Rohan", "Subham", "lovish"};
//        marks[3] = 100;
//        System.out.println(marks[3]);
        System.out.println(marks.length);
        System.out.println(students.length);

//        for (int i = 0; i < marks.length; i++) {
//            System.out.println(students[i]);
//        }

        for (String element : students) {
            System.out.println(element);
        }

        int[][] flats;
        flats = new int[2][3];
        flats[0][0] = 101;

        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");

        }
    }
}