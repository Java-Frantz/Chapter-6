package Assesments;

import java.util.Scanner;

public class TestScoreStatistics {
    public static void main(String[] args){
        int userEntry = 0;
        int numEntries = 0;
        Scanner input = new Scanner(System.in);

        while(numEntries < 999){
            System.out.println("Enter a test score between 0 and 100");
            userEntry = input.nextInt();
            if(userEntry < 0 || userEntry > 100){
                System.out.println("Please enter a number between 0 and 100");}
            else if(userEntry > 0 && userEntry < 100){


        }
    }
}
