package test5c;

import java.util.ArrayList;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class ComputerServiceCenter {

    String name;
    ArrayList<Computer> serviceQueue;
    
    public ComputerServiceCenter(String name) {
        this.name = name;
        this.serviceQueue = new ArrayList<Computer>();
    }
    
    public void queueItem(Computer c)
    {
        this.serviceQueue.add(c);
    }
    
    ArrayList computerForScan() {
        
        ArrayList computersForScan = new ArrayList();
        
        for(Computer c : serviceQueue) {
            if(c.serviceType == Computer.ServiceType.VirusScanning)
                computersForScan.add(c);
        }
        
        return computersForScan;
    }
    
}
