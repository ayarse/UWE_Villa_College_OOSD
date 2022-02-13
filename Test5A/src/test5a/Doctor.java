package test5a;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class Doctor extends Employee {

    String speciality;
        
    public Doctor(int id, String name, String speciality) {
        
        super(
          id, name
        );

        this.speciality = speciality;       
    }
    
    public String getName() {
        return "Dr. " + this.name; 
    }
}
