package fileread20;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class FileRead20 {

    public static void main(String[] args) {
        
        // Initialize variables for keeping track of input read from file.
        int sum = 0, count = 0;
        
        // Use try catch block as the file may not exist or not be readable etc
        try {
            
            Scanner scan = new Scanner(new File("Numbers.txt"));
            
            while(scan.hasNext()) {
                sum = sum + (scan.nextInt());
                count++;
            }
            
            System.out.println("The sum of all numbers is " + sum);
            System.out.println("The average of all numbers is " + (sum / count));
            
            
        } catch(Exception e) {
            System.out.println("Some error has occured. Does the file exist?");
        }
        
    }
    
}
