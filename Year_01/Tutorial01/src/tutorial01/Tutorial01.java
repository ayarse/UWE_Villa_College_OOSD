package tutorial01;

import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author Ayas Nasih - S1600655
 */
public class Tutorial01 {

    public static void main(String[] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Enter another number"));
        
        b = scan.nextInt();
        
        int biggerNumber = (a > b) ? a : b;
        
        System.out.println("The bigger number is " + biggerNumber);
        
    }
    
}

