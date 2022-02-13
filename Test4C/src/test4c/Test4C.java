package test4c;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class Test4C {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("courses.txt"));
             
        while(scan.hasNextLine()) {
            
            String subjectCode = scan.nextLine();
            
            String level = subjectCode.substring(0,1);
            String faculty = subjectCode.substring(1,3);
            String semester = subjectCode.substring(3,4);
            String year = subjectCode.substring(4,8);
            String serial = subjectCode.substring(8,11);
            
            String levelLongForm = "";
            if(level.equals("M")) {
                levelLongForm = "Postgraduate";
            } else if(level.equals("U")) {
                levelLongForm = "Undergraduate";
            }
            
            String facultyLongForm = "";
            if(faculty.equals("IT")) {
                facultyLongForm = "Information Technology";
            } else if(faculty.equals("BM")) {
                facultyLongForm = "Business Management";
            }
            
            String semesterLongForm = "";
            if(semester.equals("1")) {
                semesterLongForm = "First";
            } else if(semester.equals("2")) {
                semesterLongForm = "Second";
            }
            
            System.out.println("" + subjectCode);
            System.out.println(level + " = " + levelLongForm);
            System.out.println(faculty + " = " + facultyLongForm);
            System.out.println(semester + " = " + semesterLongForm + " Semester");
            System.out.println(year + " = " + "Year");
            System.out.println(serial + " = " + "Subject Code");
            System.out.println("\n");
        }
    }
    
}
