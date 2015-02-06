package models;

public class Person {
	private String phoneNumbers;
	private String middleNames;
	private String state;
	private Long personId;
	private String email;
	private String firstName;
	private String created;
	private String title;
	private String lastName;
	private String defaultPhone;
	private Address address;
	public String getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(String phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public String getMiddleNames() {
		return middleNames;
	}
	public void setMiddleNames(String middleNames) {
		this.middleNames = middleNames;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Long getPersonId() {
		return personId;
	}
	public void setPersonId(Long personId) {
		this.personId = personId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDefaultPhone() {
		return defaultPhone;
	}
	public void setDefaultPhone(String defaultPhone) {
		this.defaultPhone = defaultPhone;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
