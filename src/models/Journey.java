package models;

public class Journey {
	private Long journeyId;
	private String startTime;
	private Long startLocId;
	private Long driverId;
	private Long destLocId;
	private String endTime;
	private String distance;
	private Long passengerId;
	public Long getJourneyId() {
		return journeyId;
	}
	public void setJourneyId(Long journeyId) {
		this.journeyId = journeyId;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public Long getStartLocId() {
		return startLocId;
	}
	public void setStartLocId(Long startLocId) {
		this.startLocId = startLocId;
	}
	public Long getDriverId() {
		return driverId;
	}
	public void setDriverId(Long driverId) {
		this.driverId = driverId;
	}
	public Long getDestLocId() {
		return destLocId;
	}
	public void setDestLocId(Long destLocId) {
		this.destLocId = destLocId;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public Long getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(Long passengerId) {
		this.passengerId = passengerId;
	}
	

}
