package employeeobjlist;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class Employee {
    String name, department, title;
    int id;
    
    public Employee(int id, String name, String department, String title) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.title = title;
    }
    
    public void display() {
        System.out.println("id = " + id);
        System.out.println("name = " + name);
        System.out.println("department = " + department);
    }
}
