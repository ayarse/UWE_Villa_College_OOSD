package stringexercise02;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class StringExercise02 {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(new File("fingermachine.txt"));
            System.out.printf("%18s | %8s | %8s | %10s | %12s | %10s\n", "Name", "Staff ID", "Check-In", "Check-Out", "Location", "Att. Status");
            System.out.println("------------------------------------------------------------------------------------");
           while(scan.hasNextLine()) {
               
               String[] line = scan.nextLine().split(",");
               
               String name = line[0];
               String staffId = line[1];
               String checkIn = line[2];
               String checkOut = line[3];
               
               String location = "N/A";
               if(line[4].equals("1")) {
                   location = "1st Floor";
               } else if(line[4].equals("2")) {
                   location = "2nd Floor";
               }
               
               String attStatus = (Integer.parseInt(checkIn) > Integer.parseInt("0800")) ? "Late" : "On Time";
               
               System.out.printf("%18s | %8s | %8s | %10s | %12s | %10s \n", name, staffId, checkIn, checkOut, location, attStatus);
               
           }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
}
