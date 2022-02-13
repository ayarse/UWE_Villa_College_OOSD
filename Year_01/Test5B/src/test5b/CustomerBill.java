package test5b;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author Ayas Nasih - S1600655
 */

public class CustomerBill {
        
    int bill_no;
    String date;
    ArrayList<Item> items;

    public CustomerBill(int bill_no) {
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate today = LocalDate.now();
        
        this.bill_no = bill_no;
        this.date = dtf.format(today);
        this.items = new ArrayList<Item>();
        
    }
    
    public double totalBill() {
        
        double total = 0.00;
        
        for(Item i : items)
        {
           total += i.price * i.quantity;
        }
        
        return total;
    }    
    
    public void addItem(Item item) {
        this.items.add(item);
    }
    
    public void printBill() {
        System.out.println("============================================================");
        System.out.println("Bill# " + this.bill_no + " | " + this.date);
        System.out.println("============================================================");
        for(Item i : items)
        {
            System.out.printf("%25s | %8.2f | %3d\n", i.name, i.price, i.quantity);
        }
    }
}
