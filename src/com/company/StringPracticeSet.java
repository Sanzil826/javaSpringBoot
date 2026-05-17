package com.company;

public class StringPracticeSet {
    static void main(String[] args) {
        //Exercise1
        String name = "CODE WITH HARRY";
        System.out.println(name.toLowerCase());

        //Exercise2
        System.out.println(name.replace(' ', '_'));

        //Exercise3
        String letter = "Dear <|name|>, Thanks! a lot";
        System.out.println(letter.replace("<|name|>", "Messi"));

        //Exercise4
        String myString = "This string  contains   double and triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //Exercise5
        String letter1 = "Dear Harry,\n \tThis Java Course is nice. \n\tThanks!";
        System.out.println(letter1);
    }
}
