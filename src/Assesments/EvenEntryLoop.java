package Assesments;

import java.util.Scanner;

public class EvenEntryLoop {
    public static void main (String [] args){

        int userEntry = 0;
        int numEntries = 0;
        Scanner input = new Scanner(System.in);

        while(numEntries < 999){
            System.out.println("enter an even number>>>");
            userEntry = input.nextInt();
            if(userEntry == 999)
                numEntries = 999;
            else if(userEntry % 2 == 0)
                System.out.println("Good Job");
            else if(userEntry % 2 == 1)
                System.out.println("error please enter an even number");

        }
    }

}
