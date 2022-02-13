package calculating;

import java.util.Scanner;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class Calculating {

    public static void main(String[] args) {


        int numberOfStudents = 20;               // Create Variable To Control Number Of Students
        int marks[] = new int[numberOfStudents]; // Create An Array to store marks as it is collected from scanner.
        int totalMarks = 80;                     // Controls Total Mark
        
        Scanner scan = new Scanner(System.in);   // Create a scanner to collect input.
        
        // Run a loop that collects marks
        for(int i=0; i<marks.length; i++)
        {
            System.out.println("Enter marks for student #" + (i+1)); // +1 is used to format output because array index starts at 0 but we count students starting from 1.
            marks[i] = scan.nextInt();                               // Stores the collected input in an array for later use.
                      
            // If the user enters a higher mark than total mark then report the error and prompt for marks again.
            if(marks[i] > totalMarks)
            {
                System.out.println("ERROR: Marks cannot be higher than " + totalMarks);
                i--;
            }
        }
        
        // Prints out a separator for the results.
        System.out.println("========================");
        System.out.println("Results");
        System.out.println("========================");
        
        // Create a variable to store the Top Achiever's marks.
        int topAchieverMark = 0; 
        
        // Create a variable to store the index from marks array. -1 is used initially 
        // as array will not have -1 index so we can check for validity later.
        int topAchieverId = -1;  
       
        // Loop through the marks array we built in the previous loop.
        for(int l=0; l<marks.length; l++)
        {
            String result = new String(); // Create a variable to store result which will be output later.
            
            // Checks if the current item from marks array has a value higher than the 
            // previous top achiever marks that is stored in the variable.
            if(marks[l] > topAchieverMark)
            {
                // If it is higher it is replaced.
                topAchieverMark = marks[l]; 
                
                // The index of the item from marks array is now stored as Top Acheiever. 
                // We use the index from the array basically as the student number.
                 topAchieverId = l+1;
            }
            
            // Marks the student as Fail or Pass depending whether the student got higher than half of the total marks and outputs.
            if(marks[l] >= (totalMarks / 2))
            {
                result = "Passed.";
            } else {
                result = "Failed.";
            }             
           System.out.println("Student #" + (l+1) + "    " + result); 
        }
        
        System.out.println("========================");  // Prints a separator for easier reading.
        
        // Check if the topAchieverId is not -1 because we know -1 is not a valid index and if this variable has a value
        // equal to or higher than 0 then it means a Top Achiever is found.
        if(topAchieverId > -1)
        {
            System.out.println("Top Achiever is Student# " + topAchieverId + " with marks " + topAchieverMark);
        }
        
    }
    
}
