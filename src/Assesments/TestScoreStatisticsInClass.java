package Assesments;

import java.util.Scanner;

public class TestScoreStatisticsInClass {
    public static void main(String[] args){
        int numEntries = -1;
        int highest = 0;
        int lowest = 100;
        int avg;
        int scoreTotal = 0;
        int userEntry = 0;
        Scanner input = new Scanner(System.in);

        while(userEntry != 999){
            System.out.println("please enter a test score>>>");
            userEntry = input.nextInt();
            if(userEntry > 100 || userEntry < 0)
                System.out.println("Your number is not between 0 and 100 and will not be used as a score");
            else if(userEntry > highest && userEntry <= 100 && userEntry >= 0){
                highest = userEntry  ;
            }
            else if(userEntry < lowest && userEntry <= 100 && userEntry >= 0 ){
                lowest = userEntry;
            }
            numEntries++;
            scoreTotal = scoreTotal + userEntry;



        }
        avg = (scoreTotal - 999) / numEntries;
        System.out.println("your average score is " + avg);
        System.out.println("your highest score is " + highest);
        System.out.println("your lowest  score is " + lowest);
    }
}
