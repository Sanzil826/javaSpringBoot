package com.company;
import java.util.Scanner;

class Cylinder{
    private double radius;
    private double height;

//Exercise1
    public void setRadius(double r){
        radius =r;
    }

    public double getRadius(){
        return radius;
    }

    public void setHeight(double h){
        height =h;
    }

    public double getHeight(){
        return height;
    }

    public double area(){
        return 3.14 * (radius*radius)*height;
    }

    public double surfaceArea(){
        return 2*3.14*(radius*radius)+(2*3.14*radius*height);
    }

    //Exercise2
//    public Cylinder(double r,double h){
//        radius =r;
//        height=h;
//        System.out.println("Area is "+3.14 * (radius*radius)*height);
//        System.out.println("Surface Area is "+((2*3.14*(radius*radius))+(2*3.14*radius*height)));
//    }
//}

//Exercise3
//class Rectangle{
//    private double length;
//    private double breadth;
//
//    public Rectangle(){
//        length = 4;
//        breadth = 5;
//        System.out.println("Area is "+length*breadth);
//    }
//
//    public Rectangle(double l, double b){
//        length =l;
//        breadth=b;
//        System.out.println("Area is "+length*breadth);
//    }
}

public class PractiseSetCH_9 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of cylinder: ");
        double r = sc.nextInt();
        System.out.println("Enter height of cylinder; ");
        double h = sc.nextInt();

        //Exercise1
        Cylinder c = new Cylinder();
        c.setHeight(h);
        c.setRadius(r);
        System.out.println("The radius is " + c.getRadius());
        System.out.println("the height is " + c.getHeight());
        System.out.println("The area is " + c.area());
        System.out.println("the surface area is " + c.surfaceArea());

        //Exercise2
//        Cylinder c= new Cylinder(r,h);

        //Exercise3
//        Rectangle r= new Rectangle(10,5);

    }
}
