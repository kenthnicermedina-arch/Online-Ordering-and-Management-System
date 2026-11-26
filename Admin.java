public class Admin extends User {
    private final String adminPassword = "Depende kung 3";

    public Admin(int userId, String userName) {
        super(userId, userName);
    }

    public boolean login(String inputPassword) {
        return adminPassword.equals(inputPassword);
    }

    @Override
    public void displayRole() {
        System.out.println("I am an Admin");
    }
}
