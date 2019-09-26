package Assesments;

import java.util.Scanner;

public class OpenDoorGame {
    public static void main(String [] args){
        int doorNum = 0;

        Scanner input = new Scanner(System.in);
        while(doorNum >= 4) {
            System.out.println("Please pick a door 1 2 or 3");
            doorNum = input.nextInt();

            if (doorNum == 1)
                System.out.println("Your prize is $500");


            else if (doorNum == 2)
                System.out.println("Your prize is $1000");


            else if (doorNum == 3)
                System.out.println("Your prize is $250");

            else if (doorNum != 1 || doorNum != 2 || doorNum != 3)
                System.out.println("Invalid input, please select a door number between 1 and 3");
        }




    }
}
