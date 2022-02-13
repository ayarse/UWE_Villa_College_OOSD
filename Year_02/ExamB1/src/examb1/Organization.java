package examb1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class Organization {
    
    private String name;
    List<Employee> employeeList = new ArrayList<>();
    final double HOURLY_RATE = 25.0;
    final double DAYS_OF_MONTH = 31.0;
    public static enum PayGrades {
        JuniorOfficer,
        Officer,
        SeniorOfficer,
        Manager,
        Director
    }
    
    public Organization(String name) {
        this.name = name;
    }
    
    public void addEmployees(List<Employee> list) {
        this.employeeList = list;
    }
    
    // Go through all employees and print out their slips
    public void overAllPayReport() {
        System.out.println("***************************");
        System.out.println("*** COMPANY SALARY LIST ***");
        System.out.println("***************************");
        
        for(Employee employee : employeeList) {
            System.out.println(employee.generatePaySlip());
        }
    }
    
}
