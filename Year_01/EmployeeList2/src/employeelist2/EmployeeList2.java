package employeelist2;

import java.util.ArrayList;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class EmployeeList2 {

    public static void main(String[] args) {
        
       ArrayList<Employee> employees = new ArrayList<>();
       
       Employee e1 = new Employee(1, "Ahmed", "IT");
       employees.add(e1);
       
       Employee e2 = new Employee(2, "Mary", "Marketing");
       employees.add(e2);
       
       Employee e3 = new Employee(3, "Aisha", "IT");
       employees.add(e3);
       
       Employee e4 = new Employee(4, "Mohamed", "IT");
       employees.add(e4);
       
       Employee e5 = new Employee(5, "Abdulla", "Finance");
       employees.add(e5);
              
       for(Employee e : employees) {
           if(e.department == "IT") {
               System.out.println(e.name);
           }
       }
       
    }
    
}
