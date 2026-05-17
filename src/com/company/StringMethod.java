package com.company;

public class StringMethod {
    static void main(String[] args) {
        String name = "Harry";
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        String b = "              Harry ";
        System.out.println(b.trim());
        System.out.println(name.substring(1,3));
        System.out.println(name.replace('r','p'));
        System.out.println(name.startsWith("H"));
        System.out.println(name.endsWith("ay"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf('H'));
        String name1 = "Harryrry";
        System.out.println(name1.indexOf("rry",4));
        System.out.println(name1.lastIndexOf("rry",4)); //returns 2
        System.out.println(name1.lastIndexOf("rry",7)); //returns 5
        System.out.println(name.equals("Harry"));
        System.out.println(name.equalsIgnoreCase("HARRY"));

    }
}
