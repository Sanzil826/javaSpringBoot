package com.company;

public class methodOverloading {

    static void foo(int a, int b){
        System.out.println("Good morning bro! "+a+" "+b);
    }

    static void foo(int a){
        System.out.println("Good morning"+a);
    }

    static void change(int a){
        a=98;
    }

    static void change2(int [] arr){
        arr[0]=98;
    }

    static void tellJoke(){
        System.out.println("This is a joke.");
    }
    static void main(String[] args) {
        int [] marks ={34,56,78,34,65};
        //changing the integer
//        int x =45;
//        change(x);
//        System.out.println("The value of x after running change is :"+x);

        //changing the array
        change2(marks);
        System.out.println(marks[0]);

        //MethodOverloading
        foo(1,2); //a,b are parameters
        foo(300);//arguments are factual
    }
}
