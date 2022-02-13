package arraytutorialtask1;
import java.util.Scanner;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class ArrayTutorialTask1 {

    public static void main(String[] args) {
        
        // Declare initializes scanner for input, array for storing input, 
        // and variables to hold output
        Scanner scan = new Scanner(System.in);
        double arrDoubles[] = new double[5];
        double sum = 0, 
               average = 0, 
               largest = 0;
        
        // Loop and prompt for input from user to store in array
        for(int i = 0; i < arrDoubles.length; i++)
        {
            System.out.println("Enter a double value (" + ( i +1 ) + ")");
            arrDoubles[i] = scan.nextInt();
        }
        
        System.out.println("---------------------------");
        
        // Loop through array again to calculate output values
        for(int j =0; j < arrDoubles.length; j++) {
            sum = sum + arrDoubles[j];
            if(arrDoubles[j] >= largest)
            {
                largest = arrDoubles[j];
            }
            System.out.println(j + " = " + arrDoubles[j]);
        }
        
        average = sum / arrDoubles.length;
        
        System.out.println("---------------------------");
        System.out.println("The largest number entered was " + largest);
        System.out.println("The average is " + average);
        System.out.println("The sum total is " + sum);
    }
    
}
