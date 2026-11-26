import java.util.ArrayList;

public class Customer extends User {
    private ArrayList<Order> customerOrders;

    public Customer(int userId, String userName) {
        super(userId, userName);
        customerOrders = new ArrayList<>();
    }

    public ArrayList<Order> getCustomerOrders() {
        return customerOrders;
    }

    public void addOrder(Order newOrder) {
        customerOrders.add(newOrder);
    }

    @Override
    public void displayRole() {
        System.out.println("I am a Customer");
    }
}
