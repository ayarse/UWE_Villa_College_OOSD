package fisharray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class FishArray {
    public static void main(String[] args) {
        
        // Initialize variables and ArrayList
        boolean exit = false;
        Scanner scan = new Scanner(System.in);
        ArrayList<String> fishes = new ArrayList<>(Arrays.asList("oscar", "molly", "catfish", "guppy", "fighter"));
        
        System.out.println("========== Welcome to Nemo's Fish Tank ==========");
     
        // Create a loop that goes on forever until user chooses to exit
        while(!exit) {
            // Print menu and respond based on input
            System.out.println("--- Menu ---");
            System.out.println("1) Add Fish");
            System.out.println("2) Display All Fish");
            System.out.println("3) Search for a Fish");
            System.out.println("4) Remove a Fish");
            System.out.println("5) Exit");
            System.out.println("------------");
            System.out.print("\nEnter Option No: ");
            
            int choice = scan.nextInt();
            switch(choice) {
                case 1:
                    System.out.print("\nEnter the name of fish to add: ");
                    fishes.add(scan.next().toLowerCase()); // Store fish names as lowercase so search and remove functions work better
                    break;
                case 2:
                    if(!fishes.isEmpty()) {
                        System.out.println("\n--- Fishes in the Tank ---");
                        for(int i = 0; i < fishes.size(); i ++) {
                            String fish = fishes.get(i);
                            // Display stored lowercase fish name as Capitalized case
                            System.out.println( (i+1) + " - " + fish.substring(0,1).toUpperCase() + fish.substring(1));
                        }
                        System.out.println("\n\n");
                    } else {
                        System.out.println("\nThere are no fish in the tank right now! You should add one!\n");
                    }
                    break;
                case 3:
                    System.out.print("\nEnter fish to look for: ");
                    if(fishes.contains(scan.next().toLowerCase())) { // Convert input to lowercase and check if it exists in ArrayList
                        System.out.println("\nYes! We have that fish!");
                    } else {
                        System.out.println("\nUnfortunately, we don't have that fish.");
                    }
                    break;
                case 4:
                    System.out.print("Enter fish to remove from tank: ");
                    int indexToRemove;
                    // Convert input to lowercase and look for it in the ArrayList
                    if((indexToRemove = fishes.indexOf(scan.next().toLowerCase())) > -1 ) {
                        fishes.remove(indexToRemove);
                        System.out.println("\nRemoved fish from tank.\n");
                    } else {
                        System.out.println("\nHey, we don't have that fish.\n");
                    }
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("** ERROR: Invalid Option ** ");
            }
        }
        
    }
}
