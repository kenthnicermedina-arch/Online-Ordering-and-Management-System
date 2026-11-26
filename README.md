#Online Ordering and Management System
 
Description
 
Online Ordering and Management System is a console‑based Java application built for small food businesses. Customers can browse the digital food menu, pick food items, set their desired order quantity, and view their automatically computed total bill. The system also includes a secured admin panel exclusively for the business owner, who can manage the food menu and track the overall total earnings from every confirmed customer order. The whole project is constructed using the four core Object‑Oriented Programming principles to create clean, reusable, and easy to maintain program code.
 
Object‑Oriented Programming Concepts Applied
 
Encapsulation
 
All important class variables such as user identification numbers, admin passwords, food prices, and stock quantities are set to private. The program only allows controlled data access and modification through public getter and setter methods. This protects critical business data from accidental or unwanted changes while keeping every class data well organized.
 
Inheritance
 
We created a parent User class that stores shared user attributes including user ID and user name. The Customer class and Admin class both extend this User parent class. This lets Customer and Admin automatically inherit all common user characteristics and behaviors without rewriting the same code multiple times.
 
Abstraction
 
Complex mathematical processes such as subtotal computation and cumulative total earnings calculation are hidden from the end user. Customers and admins only get to view the final computed numerical results on screen. The complicated internal validation and calculation logic stays hidden inside our program classes.
 
Polymorphism
 
We override the displayRole() method inherited from our parent User class. When we call displayRole() from a Customer object, it prints the role name as Customer. When we call the exact same method name from an Admin object, it prints Admin instead. This shows different outputs from one shared method name depending on which user object we are currently using.
 
Program Structure
 
Main Class
 
- Starts the whole ordering application
​
- Creates the main menu handler
​
- Launches the customer ordering flow or the admin management flow
 
User Class (Parent Class)
 
ROLE: Base blueprint for every system user
RESPONSIBILITIES:
• Store shared user information
• Contain the displayRole() method ready to be overridden
 
Customer Class (Child of User)
 
ROLE: Handles all customer ordering functions
RESPONSIBILITIES:
• Store the customer’s selected food items
• Compute the customer’s complete order total
• Validate the customer’s chosen order quantity
• Save the fully confirmed customer order
 
Admin Class (Child of User)
 
ROLE: Manages menu editing and sales monitoring
RESPONSIBILITIES:
• Admin login authentication
• Add new food items to the menu
• Delete existing food items on the menu
• View the business’s total accumulated earnings
 
FoodItem Class
 
ROLE: Represents one single food product on the restaurant menu
RESPONSIBILITIES:
• Store food identification, food name, description, unit price, and stock quantity
• Return the item price for computation
• Update stock values after every successful customer order
 
Order Class
 
ROLE: Stores all the details of one fully confirmed customer order
RESPONSIBILITIES:
• Keep the list of ordered food items
• Calculate the subtotal amount for that specific order
 
How to Run the Program
 
PREREQUISITES
 
1. Install Java JDK 17 or later on your personal computer
​
2. Download the complete project ZIP file from the GitHub repository
​
3. Extract the ZIP file into your preferred local computer folder
 
COMPILE AND RUN THE PROGRAM
 
1. Open Visual Studio Code or any Java compatible code editor
​
2. Open the extracted project folder
​
3. Locate and open Main.java
​
4. Click the run button or open your terminal and run  java Main 
 
How to Navigate the Program
 
1. Main Menu Selection
 
Choose whether you want to enter Customer Mode or Admin Mode.
 
2. Customer Mode
 
• View the complete digital food menu
• Select your preferred food items
• Input your desired order quantity
• Check your automatically computed total bill
• Confirm your final order to save your transaction
 
3. Admin Mode
 
• Enter the correct admin password to unlock the admin panel
• Add new food items into the menu
• Remove unwanted food items from the menu
• View the business’s total earnings from all finished customer orders
 
Sample Output
 
1. Main menu selection screen
​
2. Full digital food menu display
​
3. Customer food selection and quantity input screen
​
4. Computed customer order total summary
​
5. Admin login authentication prompt
​
6. Admin menu management menu
​
7. Total business earnings display
​
8. Order confirmation success message
