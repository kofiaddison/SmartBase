package models;

public class Passenger {
	private Group group;
	private Location location;
	private PhoneNumber mobileNumber;
	private Transactions transactions;
	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public PhoneNumber getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(PhoneNumber mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Transactions getTransactions() {
		return transactions;
	}
	public void setTransactions(Transactions transactions) {
		this.transactions = transactions;
	}

}
