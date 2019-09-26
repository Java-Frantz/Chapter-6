package Assesments;

import java.util.Scanner;

public class TestScoreStatisticsInClass {
    public static void main(String[] args){
        int numEntries = 0;
        int highest = 0;
        int lowest = 100;
        int avg;
        int scoreTotal;
        int userEntry = 0;
        Scanner input = new Scanner(System.in)

        while(userEntry != 999){
            System.out.println("please enter a test score>>>");
            userEntry = input.nextInt();
            if(userEntry > highest && userEntry <= 100 && userEntry >= 0){
                userEntry = highest;
            }
            else if(userEntry < lowest){
                lowest = userEntry;
            }
            else
                System.out.println("error");

            numEntries++;
            scoreTotal = scoreTotal + userEntry;
        }
    }
}
