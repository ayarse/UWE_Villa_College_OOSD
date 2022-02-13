package filereadwrite02;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class FileReadWrite02 {

    public static void main(String[] args) throws IOException {
        
        // Declare and initialize some variables.
        Scanner scan = new Scanner(System.in);
        String fruit;
        int price;
        FileWriter fw = new FileWriter("Fruit.txt", true);
     
        // Introduction Message
        System.out.println("=========================================");
        System.out.println("= Welcome to the Fruit Bank of Maldives =");
        System.out.println("=========================================\n");
        
        // Prompt User
        System.out.println("Enter a fruit to submit.");
        fruit = scan.next();
        
        System.out.println("What is the price of this fruit?");
        price = scan.nextInt();
        
        // Write and close file
        fw.write(fruit + " " + price + "\n");
        fw.close();
    }
    
}
