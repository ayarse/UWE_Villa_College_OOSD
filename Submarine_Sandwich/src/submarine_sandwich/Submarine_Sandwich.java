package submarine_sandwich;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class Submarine_Sandwich {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            
            //Initialize Scanners and some variables
            Scanner fileScanner = new Scanner(new BufferedReader(new FileReader("submarine.txt"))),
                    consoleScanner = new Scanner(System.in);
            double total = 0, 
                   gst = 0, 
                   deliveryCharge = 10.00;
                       
            // Create a HashMap to store the values read from the file and console.
            // The Key is the Item name from the file
            // The Value is another HashMap which holds Price and Qty as a Map
            HashMap<String, HashMap<String, Number>> orderList = new HashMap<>();

            // Loop for prompting user for quantities.
            while(fileScanner.hasNext()) {
                String item = fileScanner.next().replace("_", " ");    // Remove underscore from menu items and store them in variable.
                double price = fileScanner.nextDouble();               // Holds price read from file.
                System.out.print("- Enter QTY ( " + item + " ) : ");
                int qty = consoleScanner.nextInt();
                
                // Store the collected values in our HashMap
                // Key is the item name, Value is another HashMap {price, qty}
                orderList.put(item, new HashMap() {{ 
                    put("price", price); put("qty", qty); 
                }});
            }
            
            // Output Sales Receipt
            System.out.println("---------------------------------------------------------");
            System.out.println("Sales Receipt");
            System.out.println("---------------------------------------------------------");
            System.out.format("%20s | %8s | %4s | %5s", "Item", "Price", "Qty", "SubTotal"); // Using System.out.format to make the bill look better.
            System.out.println("\n---------------------------------------------------------");
            
            // Loop through HashMap and retrieve the original values read from file and print
            for(Entry<String, HashMap<String,Number>> obj : orderList.entrySet()) {
                String item = obj.getKey();
                double price = obj.getValue().get("price").doubleValue();
                int qty = obj.getValue().get("qty").intValue();
                double subTotal = price * qty;
                System.out.format("%20s | %8.2f | %4d | %.2f \n", item, price, qty, subTotal); // Again use System.out.format for better formatting
                total += subTotal;
            }
            
            // Final Calculations
            total += deliveryCharge; // Apply Delivery Charge to Total
            gst = total * 6 / 100;
            total += gst;            // Apply GST to Total
            
            System.out.println("\n");
            System.out.printf("Delivery Charge               %.2f\n", deliveryCharge);  // Using printf to easily show only 2 decimal points in output
            System.out.printf("Goods & Services Tax (6%%)    %.2f\n", gst);
            System.out.printf("Total                         %.2f\n", total);
            
            // Give coupon if purchase value is higher than 100
            if(total >= 100.00) { 
                System.out.println("** Congratulations, an electronic coupon will be sent to your phone shortly! **");
            }
            System.out.println("** Have a nice day! **");

        } catch(FileNotFoundException e) {
            System.out.println("An error has occured. Are you sure the input file exists?");
        }
    }
    
}
