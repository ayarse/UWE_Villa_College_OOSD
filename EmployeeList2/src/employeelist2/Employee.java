package employeelist2;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class Employee {
    String name, department;
    int id;
    
    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
    
    public void display() {
        System.out.println("id = " + id);
        System.out.println("name = " + name);
        System.out.println("department = " + department);
    }
}
