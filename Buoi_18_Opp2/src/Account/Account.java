package Account;

public class Account {
	private String id, customerID, username, password;

	public Account(String id, String customerID, String username, String password) {
		this.id = id;
		this.customerID = customerID;
		this.username = username;
		this.password = password;
	}
	public boolean checkLogin(String username, String password) {
		if (this.username.equals(username) && this.password.equals(password)) {
			return true;
		}
		else return false;
	}
	
}