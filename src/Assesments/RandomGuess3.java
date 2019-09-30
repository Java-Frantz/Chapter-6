package Assesments;


import java.util.Random;
import java.util.Scanner;

public class RandomGuess3 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int choice = 999;
        int numGuesses = 0;
        int rand_pick = rand.nextInt(100) + 1;
        while( choice != rand_pick) {
            System.out.println("Please pick a number between 1 and 100 >>>");
            choice = input.nextInt();

            if (choice == rand_pick) {
                System.out.println("Congratulations you are a good guesser.");
            } else if (choice > rand_pick) {
                System.out.println("Nope, it was lower. ");
            } else if (choice < rand_pick) {
                System.out.println("Nope, it was higher. ");
            }
            numGuesses = numGuesses + 1;

        }
        System.out.println("It took you " + numGuesses + " guesses.");
    }
}




