/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paycalculations;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class PayCalculations {


    public static void main(String[] args) {
        
        // Declare and initialize integer variables and lists.
        
        int sum = 0, 
            securityDeposit = 0, 
            gst = 0,
            grandTotal = 0;
        
//        Commented out after second SMS recieved.  
//        ArrayList underTwenty = new ArrayList();
//        ArrayList evenNumbers = new ArrayList();
        
        // Calculate
        try {
            Scanner scan = new Scanner(new File("payments.txt"));
            while(scan.hasNext()) {
                String curLine = scan.next();
                int curNumber = Integer.parseInt(curLine);            
            
                // Sum
                sum = sum + curNumber;

                // Security Deposit
                securityDeposit = sum * 5 / 100;
                
                // GST
                gst = sum * 6 / 100;
                
                
                // Grand Total
                grandTotal = sum - securityDeposit - gst;
                
                
                // Less Than 20
//                if(curNumber < 20) {
//                    underTwenty.add(curNumber);
//                }
                
                
                // Even Numbers
//                if(curNumber % 2 == 0) {
//                    evenNumbers.add(curNumber);
//                }
               
            }
            
            // Outputs
            System.out.println("Sum = " + sum);
            System.out.println("Security Deposit (5%) = " + securityDeposit);
            System.out.println("Goods and Services Tax (6%) = " + gst);
            System.out.println("Grand Total = " + grandTotal);
            
//            System.out.println("\n=====");
//            System.out.println("Items Under 20");
//            System.out.println("=====");
//            for(int i=0; i < underTwenty.size(); i++)
//            {
//                System.out.println(underTwenty.get(i));
//            }
//            
//            System.out.println("\n=====");
//            System.out.println("Even Numbers");
//            System.out.println("=====");
//            for(int j=0; j < evenNumbers.size(); j++)
//            {
//                System.out.println(evenNumbers.get(j));
//            }
            

            
        } catch (Exception ex) {
            
            // Error message
            System.out.println("An error has occured. Are you sure the payments.txt file exists?");
            
        } 
    }
    
}
