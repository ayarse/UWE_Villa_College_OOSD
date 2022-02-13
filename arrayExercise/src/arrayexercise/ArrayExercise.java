package arrayexercise;

import java.util.Scanner;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class ArrayExercise {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int number[] = new int[5];
        int sum = 0;
        
        for(int i = 0; i < number.length; i++)
        {
            System.out.println("Enter a number (" + ( i +1 ) + ")");
            sum += number[i] = scan.nextInt();
        }
//        for(int j =0; j < number.length; j++) {
//            sum = sum + number[j];
//        }
        System.out.println("The total is " + sum);
    }
    
}
