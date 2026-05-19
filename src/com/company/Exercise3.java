package com.company;

import java.util.Random;
import java.util.Scanner;

class Game{
    private int num;
    private int guess;
    private int numberOfGuesses=0;

    public Game(int n){
        num =n;
    }

    public int takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your guess: ");
        guess = sc.nextInt();
        return guess;
    }

    public boolean isCorrectNumber(){
        if (num == guess){
            return true;
        }
        else{
            return false;
        }
    }

    public void setNumberOfGuesses(){
        numberOfGuesses++;
    }

    public int getNumberOfGuesses(){
        return numberOfGuesses;
    }
}

public class Exercise3 {
    static void main(String[] args) {
        Random random = new Random();
        int comp = random.nextInt(100);
        Game g = new Game(comp);
        System.out.println("The random number is " + comp);

        while (true) {
            int guessedNumber = g.takeUserInput();
            System.out.println("Your guess is " + guessedNumber);

            boolean check = g.isCorrectNumber();
            if (check == true) {
                g.setNumberOfGuesses();
                System.out.println("You guessed correct in " + g.getNumberOfGuesses());
                break;
            } else {
                System.out.println("Try again!");
                if (guessedNumber > comp) {
                    System.out.println("Guess lower");
                    g.setNumberOfGuesses();
                } else {
                    System.out.println("Guess higher");
                    g.setNumberOfGuesses();
                }

            }
        }
    }




}
