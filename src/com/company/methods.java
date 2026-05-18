package com.company;

public class methods {
     int logic (int a, int b){
        int c;
        if (a>b){
             c=a+b;
        }
        else {
             c = (a+b)*5;
        }
        return c;
    }
    static void main(String[] args) {
        int d =45;
        int e =78;
        methods m = new methods();
        System.out.println(m.logic(e,d));
    }
}
