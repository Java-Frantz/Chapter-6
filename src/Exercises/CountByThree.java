package Exercises;

public class CountByThree {
    public static void main (String[] args){
        int count = 0;
        while (count < 300){
            count = count + 3;
            System.out.println("-" + count + "-");
            if(count % 30 == 0)
                System.out.println();
        }
    }
}
