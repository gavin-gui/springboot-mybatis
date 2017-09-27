package com.example.demo.model;

public class FlightDto {
	private String registration;
	private String aircraftType;
	private String flightDate;
	private String removeDate;
	private String replayDate;
	private String replayTime;
	private String toTime;
	private String ldTime;
	private String toAirport;
	private String ldAirport;
	private String toRunway;
	private String ldRunway;
	private String toWeight;
	private String ldWeight;
	private String vref;
	private String vr;
	private String v2;
	private String flightNo;
	private String FltID;
	private String ModifyFlag;

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	public String getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}

	public String getRemoveDate() {
		return removeDate;
	}

	public void setRemoveDate(String removeDate) {
		this.removeDate = removeDate;
	}

	public String getReplayDate() {
		return replayDate;
	}

	public void setReplayDate(String replayDate) {
		this.replayDate = replayDate;
	}

	public String getReplayTime() {
		return replayTime;
	}

	public void setReplayTime(String replayTime) {
		this.replayTime = replayTime;
	}

	public String getToTime() {
		return toTime;
	}

	public void setToTime(String toTime) {
		this.toTime = toTime;
	}

	public String getLdTime() {
		return ldTime;
	}

	public void setLdTime(String ldTime) {
		this.ldTime = ldTime;
	}

	public String getToAirport() {
		return toAirport;
	}

	public void setToAirport(String toAirport) {
		this.toAirport = toAirport;
	}

	public String getLdAirport() {
		return ldAirport;
	}

	public void setLdAirport(String ldAirport) {
		this.ldAirport = ldAirport;
	}

	public String getToRunway() {
		return toRunway;
	}

	public void setToRunway(String toRunway) {
		this.toRunway = toRunway;
	}

	public String getLdRunway() {
		return ldRunway;
	}

	public void setLdRunway(String ldRunway) {
		this.ldRunway = ldRunway;
	}

	public String getToWeight() {
		return toWeight;
	}

	public void setToWeight(String toWeight) {
		this.toWeight = toWeight;
	}

	public String getLdWeight() {
		return ldWeight;
	}

	public void setLdWeight(String ldWeight) {
		this.ldWeight = ldWeight;
	}

	public String getVref() {
		return vref;
	}

	public void setVref(String vref) {
		this.vref = vref;
	}

	public String getVr() {
		return vr;
	}

	public void setVr(String vr) {
		this.vr = vr;
	}

	public String getV2() {
		return v2;
	}

	public void setV2(String v2) {
		this.v2 = v2;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getFltID() {
		return FltID;
	}

	public void setFltID(String fltID) {
		FltID = fltID;
	}

	public String getModifyFlag() {
		return ModifyFlag;
	}

	public void setModifyFlag(String modifyFlag) {
		ModifyFlag = modifyFlag;
	}

	@Override
	public String toString() {
		return "FlightDto{" +
				"registration='" + registration + '\'' +
				", aircraftType='" + aircraftType + '\'' +
				", flightDate='" + flightDate + '\'' +
				", removeDate='" + removeDate + '\'' +
				", replayDate='" + replayDate + '\'' +
				", replayTime='" + replayTime + '\'' +
				", toTime='" + toTime + '\'' +
				", ldTime='" + ldTime + '\'' +
				", toAirport='" + toAirport + '\'' +
				", ldAirport='" + ldAirport + '\'' +
				", toRunway='" + toRunway + '\'' +
				", ldRunway='" + ldRunway + '\'' +
				", toWeight='" + toWeight + '\'' +
				", ldWeight='" + ldWeight + '\'' +
				", vref='" + vref + '\'' +
				", vr='" + vr + '\'' +
				", v2='" + v2 + '\'' +
				", flightNo='" + flightNo + '\'' +
				", FltID='" + FltID + '\'' +
				", ModifyFlag='" + ModifyFlag + '\'' +
				'}';
	}
}
