package arraytutorialtask3;

import java.util.ArrayList;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class ArrayTutorialTask3 {
    
    public static void main(String[] args) {
        
       // Declare ArrayList
       ArrayList<String> classMates = new ArrayList<String>();
       
       // Add some items to ArrayList
       classMates.add("Ali");
       classMates.add("Ahmed");
       classMates.add("Mohamed");
       classMates.add("Aisha");
       classMates.add("Mary");
       classMates.add("Rasheed");
       
       // Loop to produce output       
       for(int i = 0; i < classMates.size(); i++) {
           System.out.println(classMates.get(i));
       }
    }
    
}
