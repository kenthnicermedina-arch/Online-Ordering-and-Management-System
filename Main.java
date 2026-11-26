import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<FoodItem> menu = new ArrayList<>();
    static double totalBusinessEarnings = 0;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        initializeMenu();
        mainMenu();
    }

    static void initializeMenu(){
        // CHICKEN MEALS
        menu.add(new FoodItem(1,"Crispy Fried Chicken","Crispy golden fried chicken",149,40));
        menu.add(new FoodItem(2,"Spicy Fried Chicken","Spicy crispy fried chicken",159,35));
        menu.add(new FoodItem(3,"Garlic Butter Chicken","Chicken tossed in rich garlic butter sauce",169,30));
        // RAMEN
        menu.add(new FoodItem(4,"Tonkotsu Ramen","Creamy pork bone ramen",220,25));
        menu.add(new FoodItem(5,"Spicy Miso Ramen","Spicy miso flavored ramen",230,20));
        // DRINKS
        menu.add(new FoodItem(6,"Classic Milk Tea","Sweet classic milk tea",85,60));
        menu.add(new FoodItem(7,"Brown Sugar Milk Tea","Brown sugar flavored milk tea",95,55));
        menu.add(new FoodItem(8,"Hot Coffee","Warm brewed coffee",65,70));
        menu.add(new FoodItem(9,"Cold Coffee","Iced sweet coffee",75,65));
        menu.add(new FoodItem(10,"Fresh Orange Juice","Cold fresh orange juice",70,50));
        menu.add(new FoodItem(11,"Mango Juice","Sweet cold mango juice",70,50));
    }

    static void mainMenu(){
        while(true){
            System.out.println("\n===== RESTAURANT ONLINE ORDERING AND MANAGEMENT SYSTEM =====");
            System.out.println("[1] CUSTOMER MODE");
            System.out.println("[2] ADMIN MODE");
            System.out.println("[3] EXIT");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();

            if(choice == 1){
                customerMode();
            }else if(choice == 2){
                adminLogin();
            }else if(choice ==3){
                System.out.println("Thank you for using the system!");
                break;
            }else{
                System.out.println("Invalid choice!");
            }
        }
    }

    static void customerMode(){
        System.out.print("\nEnter Customer Name: ");
        scan.nextLine();
        String name = scan.nextLine();
        Customer customer = new Customer(1, name);
        Order newOrder = new Order();

        while(true){
            System.out.println("\n===== FULL RESTAURANT MENU =====");
            for(FoodItem f : menu){
                System.out.println(f.getFoodId() + ". " + f.getFoodName() + " - PHP " + f.getFoodPrice());
            }
            System.out.println("[0] CONFIRM ORDER");
            System.out.print("Select food id to order: ");
            int foodChoice = scan.nextInt();
            if(foodChoice == 0) break;

            FoodItem selectedFood = null;
            for(FoodItem f : menu){
                if(f.getFoodId() == foodChoice){
                    selectedFood = f;
                    break;
                }
            }
            if(selectedFood == null){
                System.out.println("Food item not found!");
                continue;
            }
            System.out.print("Enter quantity: ");
            int qty = scan.nextInt();
            if(qty <=0 || qty > selectedFood.getStockQuantity()){
                System.out.println("Invalid quantity!");
                continue;
            }
            newOrder.addItem(selectedFood, qty);
        }
        double orderTotal = newOrder.calculateSubtotal();
        totalBusinessEarnings += orderTotal;
        System.out.println("\n===== ORDER SUMMARY =====");
        System.out.println("Total Bill: PHP " + orderTotal);
        System.out.println("Order Confirmed! Thank you " + customer.getUserName());
    }

    static void adminLogin(){
        Admin admin = new Admin(99,"Restaurant Owner");
        System.out.print("\nEnter Admin Password: ");
        scan.nextLine();
        String pass = scan.nextLine();
        if(admin.login(pass)){
            adminMenu();
        }else{
            System.out.println("Wrong Password!");
        }
    }

    static void adminMenu(){
        while(true){
            System.out.println("\n===== ADMIN PANEL =====");
            System.out.println("[1] ADD NEW MENU ITEM");
            System.out.println("[2] DELETE MENU ITEM");
            System.out.println("[3] VIEW TOTAL RESTAURANT EARNINGS");
            System.out.println("[4] BACK TO MAIN MENU");
            System.out.print("Enter choice: ");
            int opt = scan.nextInt();
            if(opt == 4) break;

            if(opt ==1){
                System.out.print("Food ID: ");
                int id = scan.nextInt();
                scan.nextLine();
                System.out.print("Food Name: ");
                String fname = scan.nextLine();
                System.out.print("Description: ");
                String desc = scan.nextLine();
                System.out.print("Price: ");
                double price = scan.nextDouble();
                System.out.print("Stock: ");
                int stock = scan.nextInt();
                menu.add(new FoodItem(id,fname,desc,price,stock));
                System.out.println("New menu item successfully added!");
            }else if(opt ==2){
                System.out.print("Enter Food ID to delete: ");
                int delId = scan.nextInt();
                menu.removeIf(f -> f.getFoodId() == delId);
                System.out.println("Item deleted if it existed on the menu!");
            }else if(opt ==3){
                System.out.println("TOTAL RESTAURANT EARNINGS: PHP " + totalBusinessEarnings);
            }
        }
    }
}
