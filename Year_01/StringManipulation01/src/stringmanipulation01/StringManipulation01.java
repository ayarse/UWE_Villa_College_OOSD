package stringmanipulation01;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class StringManipulation01 {

    public static void main(String[] args) {
        try {
            Scanner fScan = new Scanner(new File("letters.txt"));
            int lnNo = 1;
            
            ArrayList<String> moreThanEightChars = new ArrayList<>();
            ArrayList<String> endsWithE = new ArrayList<>();
            ArrayList<String> upperCase = new ArrayList<>();
            
            while(fScan.hasNext()) {
                String word = fScan.next();
                
                // Size and line number of each word in the file
                System.out.printf("Line %d - %s - %d characters\n", lnNo, word, word.length());
                
                // List of words more than eight characters
                if(word.length() >= 8) {
                    moreThanEightChars.add(word);
                }
                
                // List of words ending with letter ‘E’
                if(word.endsWith("e")) {
                    endsWithE.add(word);
                }
               
                // List each word in upper case
                upperCase.add(word.toUpperCase());
                
                lnNo++;
            }
            
            System.out.println("\n=== Words with EIGHT or more Letters === ");
            for(String s : moreThanEightChars) {
                System.out.println(s);
            }
            
            System.out.println("\n=== Words that end in E === ");
            for(String s : endsWithE) {
                System.out.println(s);
            }

            
            System.out.println("\n=== Uppercase === ");
            for(String s : upperCase) {
                System.out.println(s);
            }               
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
       
    }
    
}
