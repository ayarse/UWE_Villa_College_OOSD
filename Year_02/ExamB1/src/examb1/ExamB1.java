package examb1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class ExamB1 {

    public static void main(String[] args) {
        
        List<Employee> employees = new ArrayList<>(); // List to hold employees
        Organization org = new Organization("Villa College"); // Create a new organization
        
        // Keeping reference for this employee to generate individual salary later
        Employee e1 = new Employee("A10101", "Aishath Ali", "Accounts Officer", 5, Organization.PayGrades.JuniorOfficer, org);
        employees.add(e1); 
        
        // Add other empolyees without reference since we dont ned it
        employees.add(new Employee("A10302", "Mohamed Ahmed", "Snr. Marketing Officer", 2, Organization.PayGrades.SeniorOfficer, org));
        employees.add(new Employee("A10406", "Gasim Ibrahim", "Managing Director", 0, Organization.PayGrades.Director, org));
        
        org.addEmployees(employees); // Add employees to organization
        
        // Individual salary
        System.out.println("** Salary Slip for Individual Employee **");
        System.out.println(e1.generatePaySlip());
        System.out.println("\n");
        
        // Overall Salary Report for entire Organization
        org.overAllPayReport();
    }
    
}
