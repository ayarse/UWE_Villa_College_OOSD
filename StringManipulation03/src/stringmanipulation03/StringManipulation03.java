package stringmanipulation03;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class StringManipulation03 {

    public static void main(String[] args) {
        try {
           Scanner fScan = new Scanner(new File("passwords.txt"));
           
           ArrayList<String> weakPasswords = new ArrayList<>(),
                             strongPasswords = new ArrayList<>(),
                             obscuredPasswords = new ArrayList<>();
           while(fScan.hasNext()) {
               String password = fScan.nextLine();
               Pattern p = Pattern.compile("^(?=.*[a-zA-Z])(?=.*[0-9])");
               Matcher m = p.matcher(password);
               if(password.length() >= 8 && m.find()) {
                   strongPasswords.add(password);
               } else { // Weak Passwords
                   weakPasswords.add(password);
               }

               // Obscure Passwords
               String firstTwoChars = password.substring(0,2);
               String lastChars = password.substring(2).replaceAll(".", "*");
               obscuredPasswords.add(firstTwoChars + lastChars);
           }
           
            System.out.println("Strong Passwords");
            System.out.println("----------------");
            for(String s : strongPasswords) {
                System.out.println(s);
            }
           
            System.out.println("\nWeak Passwords");
            System.out.println("----------------");
            for(String s : weakPasswords) {
                System.out.println(s);
            }            
           
            System.out.println("\nPasswords");
            System.out.println("----------------");
            for(String s : obscuredPasswords) {
                System.out.println(s);
            }            
                      
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
}
