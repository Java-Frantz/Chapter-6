package Assesments;

import java.util.Scanner;

public class CountByAnything {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to count by");
        int count = input.nextInt();

        while(count < 300 ){
            count = count + 3;
            if(count % 30 == 0)
                System.out.println("--------------------------");
            System.out.println(count);

        }

    }
}
