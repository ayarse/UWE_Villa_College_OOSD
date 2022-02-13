package test5a;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class Test5A {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        Hospital igmh;
        ArrayList<Doctor> igmhDoctors = new ArrayList<>();
        
        igmhDoctors.add(new Doctor(101, "Aishath Mohamed", "Cardiology"));
        igmhDoctors.add(new Doctor(102, "Ali Rameez", "Dentistry"));
        igmhDoctors.add(new Doctor(103, "Raj Kumar", "Neurology"));
        igmhDoctors.add(new Doctor(104, "Mariyam Ibrahim", "ENT"));
        igmhDoctors.add(new Doctor(105, "Ahmed Moosa", "Dermatology"));
        
        igmh = new Hospital("Indira Gandhi Memorial Hospital", "Boduthakurufaanu Magu, Male", igmhDoctors);
        
        System.out.println("Welcome to Indira Gandhi Memorial Hospital \n");
        
        System.out.println("Doctors Duty");
        System.out.println("==================================================");
        System.out.printf("%5s | %20s | %10s \n", "ID", "Name", "Speciality");
        System.out.println("==================================================");
        for(Doctor doc: igmh.doctors) {
            System.out.printf("%5d | %20s | %10s \n", doc.id, doc.getName(), doc.speciality);
        }
        
        System.out.println("\nEnter speciality for an appointment: ");
        String query = scan.next();
        
        if(igmh.checkSpeciality(0, query)) {
            System.out.println("We have that specialist today! We have booked you an appointment!");
        } else {
            System.out.println("Unfortunately we don't have that specialist on duty today.");
        }
        
    }

}
