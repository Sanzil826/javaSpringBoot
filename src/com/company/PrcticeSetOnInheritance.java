package com.company;
import java.util.Scanner;

class Circle{
    public double radius;

    public Circle(double r){
        this.radius=r;
    }

    public double areaCircle(){
        return 3.14*(radius*radius);
    }
}

class Cylinder1 extends Circle{
    public double height;
    public Cylinder1(double r,double h){
        super(r);
       this.height = h;
    }
    public double areaCylinder(){
        return 3.14 * (radius*radius)*height;
    }

}

public class PrcticeSetOnInheritance {
    static void main(String[] args) {
        //Exercise1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius for circle and cylinder and height for cylinder");
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        Cylinder1 cy= new Cylinder1(r,h);
        System.out.println("Area of circle: "+ cy.areaCircle());
        System.out.println("Area of cylinder: "+ cy.areaCylinder());

    }
}
