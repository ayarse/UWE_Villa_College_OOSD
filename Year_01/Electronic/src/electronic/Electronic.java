package electronic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class Electronic {

    public static void main(String[] args) {
        try {
            
            //Initialize Scanners
            Scanner scan = new Scanner(new BufferedReader(new FileReader("electronics.txt")));
            Scanner inputScanner = new Scanner(System.in);
            
            //Create variable to hold question number.
            int qNo = 1;
            
            // Create list to hold the quantities entered by user.
            ArrayList quantities = new ArrayList();

            // First loop - for prompting user for quantities.
            while(scan.hasNext()) {
                String item = scan.next();          // Variable that holds item name read from file.
                double price = scan.nextDouble();   // Holds price read from file.
                System.out.println(qNo + ") How many units of " + item + " was sold? Enter Qty.");
                int qty = inputScanner.nextInt();
                quantities.add(qty); //Add the read quantity to the ArrayList to use later.
                qNo++;               // Increment question number.
            }
            
            // Output Sales Receipt
            
            System.out.println("--------------------------------------------");
            System.out.println("Sales Output");
            System.out.println("--------------------------------------------");
            System.out.format("%10s | %8s | %5s | %5s", "Item", "Price", "Qty", "SubTotal"); // Using System.out.format to make table look better.
            System.out.println("\n--------------------------------------------");
            
            // Start reading file again
            scan = new Scanner(new BufferedReader(new FileReader("electronics.txt")));
            int qtyCounter = 0;
            double total = 0;
            
            // Second loop - for outputting sales receipt
            while(scan.hasNext()) {
                String item = scan.next();
                double price = scan.nextDouble();
                int qty = Integer.parseInt(quantities.get(qtyCounter).toString()); // Gets previously entered quantity from the ArrayList
                double subTotal = price * qty; // Calculate Subtotal
                System.out.format("%10s | %8.2f | %5d | %.2f \n", item, price, qty, subTotal); // Again use System.out.format for better output formatting
                total += subTotal;
                qtyCounter++;
            }
            double gst = total * 6 / 100;
            total += gst;
            System.out.println("\n");
            System.out.printf("Goods & Services Tax (6%%)  %.2f\n", gst); // Using printf to easily show only 2 decimal points
            System.out.printf("Total                      %.2f\n", total);

            
        } catch(FileNotFoundException e) {
            System.out.println("An error has occured. Are you sure the input file exists?");
        }
    }
    
}
