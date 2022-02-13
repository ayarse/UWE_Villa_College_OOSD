package test5b;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class Test5B {

    public static void main(String[] args) {
        
        CustomerBill bill = new CustomerBill(101);
        
        System.out.println("Welcome to SeaHouse Brasserie");
        
        bill.addItem(new Item("Spaghetti Aglio Olio", 2, 75.0));
        bill.addItem(new Item("Chicken Kohthu", 3, 45.0));
        bill.addItem(new Item("Valhomas Pasta", 1, 65.0));
        bill.addItem(new Item("Coca Cola", 6, 12.0));
        
        bill.printBill();
        
        System.out.println("\n** Total = " + bill.totalBill());
        
        System.out.println("\n-------- Thank You --------");
        
    }

}
