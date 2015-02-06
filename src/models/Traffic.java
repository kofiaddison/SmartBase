package models;

public class Traffic {
	private Long trafficId;
	private String state;
	private String details;
	private String Threshold;
	public Long getTrafficId() {
		return trafficId;
	}
	public void setTrafficId(Long trafficId) {
		this.trafficId = trafficId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getThreshold() {
		return Threshold;
	}
	public void setThreshold(String threshold) {
		Threshold = threshold;
	}

}
