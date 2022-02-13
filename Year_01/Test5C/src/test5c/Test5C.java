package test5c;

import java.util.ArrayList;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class Test5C {

    public static void main(String[] args) {
        
        ComputerServiceCenter formax = new ComputerServiceCenter("Formax Service Center");
        
        formax.queueItem(new Computer(1, "Dell XPS", Computer.ServiceType.OSInstallation));
        formax.queueItem(new Computer(2, "Dell Latitude", Computer.ServiceType.Other));
        formax.queueItem(new Computer(3, "Asus Zenbook", Computer.ServiceType.VirusScanning));
        formax.queueItem(new Computer(4, "HP Envy", Computer.ServiceType.VirusScanning));
        formax.queueItem(new Computer(5, "Huawei Matebook", Computer.ServiceType.RAMUpgrade));
        
        ArrayList<Computer> virusInfections = formax.computerForScan();
        
        System.out.println("We have " + virusInfections.size() + " infected computers. They are : \n");
        for(Computer c : virusInfections)
        {
            System.out.println(c.model + " | JobSheet#: " + c.jobSheetNumber);
        }
        
    }

}
