package test5c;
/**
 *
 * @author Ayas Nasih - S1600655
 */
public class Computer {

    public Computer(int jobSheetNumber, String model, ServiceType serviceType) {
        this.jobSheetNumber = jobSheetNumber;
        this.model = model;
        this.serviceType = serviceType;
    }
    
    public enum ServiceType {
        OSInstallation,
        VirusScanning,
        RAMUpgrade,
        MotherboardIssue,
        HardwareReplace,
        Other
      }
    
    int jobSheetNumber;
    String model;
    ServiceType serviceType;
    
}
