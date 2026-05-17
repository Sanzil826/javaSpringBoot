package com.company;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    static void main(String[] args) {
        String[] choices = {"r","s","p"};
        Random random = new Random();
        String choose1 = choices[random.nextInt(choices.length)];

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose r for rock, p for paper and s for scissor.");
        String choose2 = sc.next();

        System.out.println("Your choice: "+choose2);
        System.out.println("Computer choose: "+choose1);

        if (choose1.equals("r") && choose2.equals("s"))
            System.out.println("Computer wins");
        else if (choose1.equals("r") && choose2.equals("p"))
            System.out.println("You win");
        else if (choose1.equals("r") && choose2.equals("r"))
            System.out.println("Draw");
        else if (choose1.equals("p") && choose2.equals("r"))
            System.out.println("Computer wins");
        else if (choose1.equals("p") && choose2.equals("s"))
            System.out.println("You win");
        else if (choose1.equals("p") && choose2.equals("p"))
            System.out.println("Draw");
        else if (choose1.equals("s") && choose2.equals("p"))
            System.out.println("Computer wins");
        else if (choose1.equals("s") && choose2.equals("r"))
            System.out.println("You win");
        else System.out.println("Draw");


    }
}
