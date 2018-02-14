package com.vishesh;

import org.springframework.stereotype.Component;

@Component
public class BatteryLife {
	private String battery;

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "Battery is working...";
	}

}
