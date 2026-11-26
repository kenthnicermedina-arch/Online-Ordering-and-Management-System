public class FoodItem {
    private int foodId;
    private String foodName;
    private String foodDescription;
    private double foodPrice;
    private int stockQuantity;

    public FoodItem(int foodId, String foodName, String foodDescription, double foodPrice, int stockQuantity) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.foodDescription = foodDescription;
        this.foodPrice = foodPrice;
        this.stockQuantity = stockQuantity;
    }

    public int getFoodId() {
        return foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}
