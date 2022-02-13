package test5d;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class Person {
    
    EntryCoupon coupon;
    String name;

    public Person(String name) {
        this.name = name;
        this.coupon = new EntryCoupon(50.0);
    }
    
    public boolean canParticipate(Activity activity) {
        if(activity.cost <= coupon.limit) {
            return true;
        }
        return false;
    }

}
