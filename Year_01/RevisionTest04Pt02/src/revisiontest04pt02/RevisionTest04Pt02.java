package revisiontest04pt02;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class RevisionTest04Pt02 {
    
    public static void main(String[] args) {
       try {
           Scanner scan = new Scanner(new File("students.txt"));
           int lnNo = 1;
           while(scan.hasNext()) {
               
               String studentId = scan.next();
               
               String typeIdentifier = studentId.substring(0,1);
               String registrationYear = studentId.substring(1,3);
               String serialNo = studentId.substring(3);
               
               System.out.printf("\nLine %d - %s \n", lnNo, studentId);
               System.out.printf("%s = Student \n", typeIdentifier);
               System.out.printf("%s = Year of Registration (20%s) \n", registrationYear, registrationYear);
               System.out.printf("%s = Serial Number of Registration Form \n", serialNo);
               lnNo++;
               
           }
       } catch (Exception e) {
           System.out.println(e.toString());
       }
    }
    
}
