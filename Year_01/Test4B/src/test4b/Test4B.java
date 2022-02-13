package test4b;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class Test4B {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("usernmes.txt"));
        String line = scan.next();
        String[] usernames = line.split("-");
        
        ArrayList<String> acceptable = new ArrayList<>(),
                          unacceptable = new ArrayList<>();
        
        for(String s : usernames) {
            if( !s.matches("^[0-9].*") && s.matches(".*[A-Z].*") && s.length() >= 6) {
                acceptable.add(s);
            } else {
                unacceptable.add(s);
            }
        }
        
        System.out.println("\nAcceptable Usernames");
        System.out.println("----------");
        for(String s : acceptable) {
            System.out.println(s);
        }
        
        System.out.println("\nUnacceptable Usernames");
        System.out.println("----------");
        for(String s : unacceptable) {
            System.out.println(s);
        }
        
        
        System.out.println("\nAll Usernames");
        System.out.println("----------");
        int count = 0;
        for(String s : usernames) {
            count++;
            System.out.println("User "+ count + " = " + s);
        }
        
        
        
    }
    
}
