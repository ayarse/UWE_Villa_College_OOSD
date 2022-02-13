package arraytutorialtask2;

import java.util.Scanner;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class ArrayTutorialTask2 {

    public static void main(String[] args) {
       
       Scanner scan = new Scanner(System.in); // Init Scanner
       int reward = 1000000; // Set an initial reward amount.
       
       // Store questions as strings in an array.
       // Questions are already formatted with newlines (\n) for better displaying.
       // Correct answer is added to the end of the string separated by a semicolon (;)
       String[] questions = {
        "How many blue stripes are there on the U.S. flag? \n a) 6 \n b) 7 \n c) 13 \n d) 0 \n ;d",
        "What language is the most spoken worldwide?\na) Chinese\nb) Spanish\nc) Arabic\nd) English\n;a",
        "What is the color of Donald Duck’s bowtie?\na) Red\nb) Yellow\nc) Blue\nd) White\n;a",
        "How many hearts does an octopus have?\na) 1\nb) 2\nc) 3\nd) 4\n;c",
        "Which animal does not appear in the Chinese zodiac?\na) Dragon\nb) Rabbit\nc) Dog\nd) Hummingbird\n;d",
        "Which planet in our solar system is the largest?\na) Jupiter\nb) Saturn\nc) Neptune\nd) Earth\n;a",
        "Which ocean is the largest?\na) Indian\nb) Pacific\nc) Atlantic\nd) Arctic\n;b",
        "Fe is the chemical symbol for…\na) Zinc\nb) Hydrogen\nc) Fluorine\nd) Iron\n;d",
        "How many bones are there in the human body?\na) 206\nb) 205\nc) 201\nd) 209\n;a",
        "Who painted the Mona Lisa?\na) Van Gogh\nb) da Vinci\nc) Picasso\nd) Monet\n;b"
       };
       
       // Loop through the question strings array
       for(int i = 0; i < questions.length; i++) {
           String[] processed = questions[i].split(";");      // Separate question and correct answer from string with split()
           String question = processed[0];                    // Store the separated question
           String correctAnswer = processed[1];               // Store the separated correct anser
           System.out.println( ( i + 1 ) + ") " + question);  // Display question
           
           System.out.print("Answer: ");                      // Prompt user for answer
           String userAnswer = scan.next();                   
           
           // Check if entered answer is equal to the correct answer we got from the array.
           // Reduce 100,000 from reward if an incorrect answer is entered.
           if(correctAnswer.equals(userAnswer.toLowerCase())) { 
               System.out.println("\n ** Correct! Your current reward remains at " + reward + " ** \n");
           } else {
               reward -= 100000;
               System.out.println("\n ** Oops! Wrong answer! Your reward is reduced to " + reward + " ** \n");
           }
           
       }
       
       // Different final output messages for different reward amounts.
       if(reward == 0) {
           System.out.println("* Sorry, you got all the questions wrong. Better luck next time!* ");
       } else if (reward == 1000000) {
           System.out.println("*** Congratulations! You are now a millionaire! ***");
       } else {
           System.out.println("* Congratulations! You won " + reward + " Dollars! *");
       }

    }
    
}
