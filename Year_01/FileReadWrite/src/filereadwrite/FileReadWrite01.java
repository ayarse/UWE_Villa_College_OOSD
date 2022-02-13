package filereadwrite;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class FileReadWrite01 {

    public static void main(String[] args) throws IOException {
        
        String names[] = new String[5]; // Declare an array to store the name of students.
        FileWriter fw = new FileWriter("Students.txt"); // Declare and initialize FileWriter
        
        System.out.println("Enter the name of any 5 students in your class:"); // Output instructions for user.
        
        // Begin collecting names into array.
        for(int i=0; i < 5; i++) {
            Scanner scan = new Scanner(System.in);
            names[i] = scan.next();
        }
        
        //Loop through array to write to file
        for(int j=0; j < names.length; j++) {
            fw.write( names[j] + "\n" );
        }
        
        // Finally close file and output feedback
        fw.close();
        System.out.println("File has been written!");

        
    }
    
}
