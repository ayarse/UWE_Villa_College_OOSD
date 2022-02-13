
package employee;

/**
 *
 * @author Ayas Nasih - S1600655
 */

public class Employee {
    private long employeeID;
    private String name;
    private double salary;
    private String position;
    private String contactNo;

    public long getEmployeeID() { 
        return employeeID; 
    }
    public void setEmployeeID(long value) { 
        this.employeeID = value; 
    }

    public String getName() { 
        return name; 
    }
    public void setName(String value) { 
        this.name = value; 
    }

    public double getSalary() { 
        return salary; 
    }
    public void setSalary(double value) { 
        this.salary = value; 
    }

    public String getPosition() { 
        return position; 
    }
    public void setPosition(String value) { 
        this.position = value; 
    }

    public String getContactNo() { 
        return contactNo; 
    }
    public void setContactNo(String value) { 
        this.contactNo = value; 
    }
}
