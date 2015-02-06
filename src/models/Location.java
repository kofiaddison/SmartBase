package models;

public class Location {
	private Long locId;
	private String longitude;
	private String latitude;
	private String maxRadius;
	public Long getLocId() {
		return locId;
	}
	public void setLocId(Long locId) {
		this.locId = locId;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getMaxRadius() {
		return maxRadius;
	}
	public void setMaxRadius(String maxRadius) {
		this.maxRadius = maxRadius;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	private String details;

}
