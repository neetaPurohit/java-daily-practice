package ProgrammingChallenge;

import java.util.Scanner;

//create a program to guess number
public class gessNum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the number guessing game");
        int num = 5, guess;

        do{
            System.out.print("Please guess the number between 0 to 10: ");
            guess = sc.nextInt();
        }while (num != guess);
        System.out.println("You have successfully guessed the number");
    }
}
