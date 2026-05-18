package com.company;

public class VariableArguments {
//    static int sum(int a, int b){
//        return a+b;
//    }

    static int sum(int x,int ...arr) {
        //Available as int []arr;
        int val = x;
        for (int elem : arr) {
            val = val + elem;
        }
        return val;
    }

    static void main(String[] args) {
        System.out.println("welcome");
//        System.out.println(sum());//prints error;
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
    }
}
