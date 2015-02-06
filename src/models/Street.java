package models;

public class Street {
	private String name;
	private Long streetId;
	private Long trafficId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getStreetId() {
		return streetId;
	}
	public void setStreetId(Long streetId) {
		this.streetId = streetId;
	}
	public Long getTrafficId() {
		return trafficId;
	}
	public void setTrafficId(Long trafficId) {
		this.trafficId = trafficId;
	}

}
