package employeeobjlist;

import java.util.ArrayList;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class EmployeeObjList {

    public static void main(String[] args) {
        
       ArrayList<Employee> employees = new ArrayList<>();
       
       employees.add(new Employee(1, "Ahmed", "IT", "IT Executive"));
       employees.add(new Employee(2, "Mary", "Marketing", "Marketing Executive"));
       employees.add(new Employee(3, "Aisha", "IT", "Web Developer"));
       employees.add(new Employee(4, "Mohamed", "IT", "IT Consultant"));
       employees.add(new Employee(5, "Abdulla", "Finance", "Accounts Executive"));
              
       employees.forEach((employee) -> {
           if(employee.department == "IT")
           System.out.println(employee.name + ", " + employee.title);
       });
       
    }
    
}
