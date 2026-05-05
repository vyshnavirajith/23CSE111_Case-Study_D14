package BloodBankManagement;
public abstract class User {
	 private int userId;
	    private String username;
	    private String password;
	    private String role;
	    private boolean isLoggedIn = false;

	    public User(int userId, String username, String password, String role) {
	        this.userId = userId;
	        this.username = username;
	        this.password = password;
	        this.role = role;
	    }

	    public boolean login(String name, String password) {
	        if (this.username.equals(name) && this.password.equals(password)) {
	            isLoggedIn = true;
	            System.out.println("Login successful! Welcome " + username);
	            return true;
	        } else {
	            System.out.println("Invalid login!");
	            return false;
	        }
	    }
	    public void logout() {
	        isLoggedIn = false;
	        System.out.println("Logged out successfully.");
	    }

	    public abstract void displayRole();
	}


