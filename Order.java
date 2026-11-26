import java.util.ArrayList;

public class Order {
    private ArrayList<FoodItem> orderedItems;
    private ArrayList<Integer> orderedQuantities;

    public Order() {
        orderedItems = new ArrayList<>();
        orderedQuantities = new ArrayList<>();
    }

    public void addItem(FoodItem item, int quantity) {
        orderedItems.add(item);
        orderedQuantities.add(quantity);
    }

    public double calculateSubtotal() {
        double total = 0;
        for(int i = 0; i < orderedItems.size(); i++){
            total += orderedItems.get(i).getFoodPrice() * orderedQuantities.get(i);
        }
        return total;
    }
}
