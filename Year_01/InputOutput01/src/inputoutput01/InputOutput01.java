package inputoutput01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Ayas Nasih - S1600655 
 * 
 * Reads the first 10 Digits of Pi from a text file and displays them.
 */
public class InputOutput01 {

    public static void main(String[] args) throws FileNotFoundException {

        File myFile = new File("Pi.txt");
        Scanner scan = new Scanner(myFile);
        
        System.out.println("The first 10 digits of Pi are: ");

        while (scan.hasNextLine()) {
            String data = scan.nextLine();
            System.out.println(data);
        }
        
    }

}
