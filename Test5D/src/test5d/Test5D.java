package test5d;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class Test5D {

    public static void main(String[] args) {
        

        Scanner scan = new Scanner(System.in);
                
        
        ArrayList<Activity> activities = new ArrayList<>();
        
        activities.add(new Activity(1, "Bungee Jumping", 50.0));
        activities.add(new Activity(2, "GoKart", 60.0));
        activities.add(new Activity(3, "Frog Jump", 70.0));
        
        
        System.out.println("Welcome to Alimas Carnival!");
        System.out.println("==============================");
        
        System.out.println("What's your name?");
        String pName = scan.next();
        
        Person visitor = new Person(pName);
        
        
        System.out.println("\n ** Hi " + pName + "! Choose an activity! ** \n");
        

        
        for(Activity a : activities) {
            System.out.println(a.id + " - " + a.description + " | " + a.cost);
        }
        
        System.out.print("\nEnter Activity Number : ");
        
        int activityId = scan.nextInt();
        
        if(visitor.canParticipate(activities.get(activityId - 1))) {
            System.out.println("\n Let's Have Some Fun!");
        } else {
            System.out.println("Sorry you don't have enough balance. Buy another coupon.");
        }

    }

}
