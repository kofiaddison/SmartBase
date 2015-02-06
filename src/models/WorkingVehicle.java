package models;

public class WorkingVehicle {
	private Long driverId;
	private String engineRPM;
	private String state;
	private String location;
	private String connecitonState;
	private String fuelConsumption;
	private String occupied;
	private String speed;
	public String getConnecitonState() {
		return connecitonState;
	}
	public void setConnecitonState(String connecitonState) {
		this.connecitonState = connecitonState;
	}
	public String getFuelConsumption() {
		return fuelConsumption;
	}
	public void setFuelConsumption(String fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}
	public String getOccupied() {
		return occupied;
	}
	public void setOccupied(String occupied) {
		this.occupied = occupied;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public Long getDriverId() {
		return driverId;
	}
	public void setDriverId(Long driverId) {
		this.driverId = driverId;
	}
	public String getEngineRPM() {
		return engineRPM;
	}
	public void setEngineRPM(String engineRPM) {
		this.engineRPM = engineRPM;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
