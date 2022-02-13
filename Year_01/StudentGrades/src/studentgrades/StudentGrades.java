package studentgrades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class StudentGrades {
    public static void main(String[] args) {

        try {
            Scanner scan = new Scanner(new BufferedReader(new FileReader("StudentGrade.txt")));
            System.out.println("Student Grades");
            System.out.println("=====================");
            System.out.println("Name\t | \tGrade");
            System.out.println("=====================");
            while(scan.hasNext()) {
                String name = scan.next();
                int grade = scan.nextInt();
                System.out.println(name + "\t | \t" + grade);
            }
        } catch (Exception e) {
            
        }
    }
    
}
