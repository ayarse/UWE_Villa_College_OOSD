package stringmanipulation02;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class StringManipulation02 {

    public static void main(String[] args) {
        String[] words = new String[1];
        String rawInputString = "";
        try {
            Scanner fScan = new Scanner(new File("strings.txt"));
            while(fScan.hasNext()) {
                String rawInput = fScan.next();
                words = rawInput.split("-");
                rawInputString = rawInput;
            }
            
            System.out.println("Words with numbers:");
            System.out.println("--------------------");
            for(String word : words) {
                if(word.matches(".*\\d.*")) {
                    System.out.println(word);
                }
            }
            System.out.println("");
            System.out.println("Strings with empty space");
            System.out.println("--------------------");            
            System.out.println(rawInputString.replace("-", " "));
                        
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
}
