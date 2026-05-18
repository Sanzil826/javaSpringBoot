package com.company;

//Exercise1
//class Employees{
//    int salary;
//    String name;
//    public int salary(){
//        return salary;
//    }
//    public String getName(){
//        return name;
//    }
//    public void setName(String n){
//        name = n;
//    }
//}

//Exercise2
//class Cellphone{
//    public void ring(){
//        System.out.println("It is ringing");
//    }
//
//    public void vibration(){
//        System.out.println("Vibrating");
//    }
//}

//Exercise3
//class Square{
//    int len;
//    public void setLength(int l){
//        len =l;
//    }
//
//    public int area(){
//        return len*len;
//    }
//
//    public int perimeter(){
//        return 4*len;
//    }
//}

//Exercise4
class TommyVecetti{
    public void hitting(){
        System.out.println("hit");
    }

    public void running(){
        System.out.println("running");
    }

    public void firing(){
        System.out.println("fire");
    }
}



public class OopPracticeSet {
    static void main(String[] args) {
        //Exercise1
//        Employees harry = new Employees();
//        harry.setName("Harry Tamang");
//        harry.salary = 40000;
//        System.out.println(harry.getName());
//        System.out.println(harry.salary());

        //Exercise2
//        Cellphone c = new Cellphone();
//        c.ring();
//        c.vibration();

        //Exercise3
//        Square s = new Square();
//        s.setLength(9);
//        System.out.println(s.area()+" m2");
//        System.out.println(s.perimeter()+" m");

        //Exercise4
        TommyVecetti tv = new TommyVecetti();
        tv.firing();
        tv.hitting();
        tv.running();


    }
}
