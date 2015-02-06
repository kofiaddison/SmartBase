package models;

public class Address {
	private String state;
	private Long addressId;
	private String city;
	private Long locId;
	private String country;
	private Street street;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Long getLocId() {
		return locId;
	}
	public void setLocId(Long locId) {
		this.locId = locId;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Street getStreet() {
		return street;
	}
	public void setStreet(Street street) {
		this.street = street;
	}

}
