package spending;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class Spending {

    public static void main(String[] args) {
        try {
            
            Scanner scan = new Scanner(new File("Spending.txt"));   // Create scanner to read file
            HashMap<String, Integer> spenders = new HashMap<>();    // Create a HashMap to store the names of people and their spending
            
            
            // Loop through the input file
            while(scan.hasNext()) {
                
                // Get the name and expense from file
                String name = scan.next();
                int expense = scan.nextInt();
                
                // If we have already record of this person, add current expense to previously recorded amount
                // If not, create a new person record inside the HashMap
                if(spenders.containsKey(name)) {
                    int currentAmount = spenders.get(name);
                    spenders.put(name, (expense+currentAmount));
                } else {
                    spenders.put(name, expense);
                }
                
            } // End loop
            
            // Now that we have finished reading the text file, 
            // loops through the HashMap to produce output
            for (String i : spenders.keySet()) {
                System.out.println("Name: " + i + "\t Total Expenditure: " + spenders.get(i));
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Are you sure that the input file exists?");
        }
    }
    
}
