package examb1;

import examb1.Organization.PayGrades;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class Employee implements IPay {

    public final String idNo;
    public final String name;
    public final String title;
    public final int leavesTaken;
    public final PayGrades payGrade;
    public final Organization employer;

    public Employee(String idNo, String name, String title, int leavesTaken, PayGrades payGrade, Organization employer) {
        this.idNo = idNo;
        this.name = name;
        this.title = title;
        this.leavesTaken = leavesTaken;
        this.payGrade = payGrade;
        this.employer = employer;
    }

    @Override
    public String generatePaySlip() {
        String slip = "ID: " + idNo
                + ", Name: " + name
                + ", Title: " + title
                + ", Salary: MVR " + ((payGrade.ordinal() + 1 * employer.HOURLY_RATE) * (employer.DAYS_OF_MONTH - leavesTaken));
        return slip;
    }
}
