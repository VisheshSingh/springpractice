package com.vishesh;

public class BatteryLife {
	private String battery;

	public BatteryLife(String battery) {
		this.battery = battery;
	}

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "BatteryLife [battery=" + battery + "]";
	}

}
