package bai2_bankAccount;

public class Account {
	private String id, customerID, soTK;
	private int pin, soDuTK;
	public Account(String id, String customerID, String soTK, int pin, int soDuTK) {
		this.id = id;
		this.customerID = customerID;
		this.soTK = soTK;
		this.pin = pin;
		this.soDuTK = soDuTK;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getSoTK() {
		return soTK;
	}
	public void setSoTK(String soTK) {
		this.soTK = soTK;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public int getSoDuTK() {
		return soDuTK;
	}
	public void setSoDuTK(int soDuTK) {
		this.soDuTK = soDuTK;
	}
	public void napTien(int tien) {
		this.soDuTK += tien;
	}
	public void rutTien(int tien) {
		this.soDuTK -= tien;
	}
	
	
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", customerID=" + customerID + ", soTK=" + soTK + ", pin=" + pin + ", soDuTK="
				+ soDuTK + "]";
	}
	
	
}
