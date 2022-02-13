package test5a;

import java.util.ArrayList;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class Hospital {

    public Hospital(String name, String address, ArrayList<Doctor> doctors) {
        this.name = name;
        this.address = address;
        this.doctors = doctors;
    }
    
    String name;
    String address;
    ArrayList<Doctor> doctors;
    
    public boolean checkSpeciality(int doctor_id, String speciality) {
        for(Doctor doctor: doctors) {
            if(doctor.id == doctor_id || doctor.speciality.equalsIgnoreCase(speciality)) {
                return true;
            }
        }
        return false;
    }
        
}
