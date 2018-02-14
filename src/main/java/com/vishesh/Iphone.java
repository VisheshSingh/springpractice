package com.vishesh;

import org.springframework.stereotype.Component;

@Component
public class Iphone implements Device {
	private BatteryLife batLife;

	public BatteryLife getBatLife() {
		return batLife;
	}

	public void setBatLife(BatteryLife batLife) {
		this.batLife = batLife;
	}

	public String getOS() {
		return "I run on the most secured mobile OS" + batLife;
	}
}
