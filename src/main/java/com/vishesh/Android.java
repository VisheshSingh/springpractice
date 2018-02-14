package com.vishesh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Android implements Device {

	@Autowired
	private BatteryLife batLife;

	public BatteryLife getBatLife() {
		return batLife;
	}

	public void setBatLife(BatteryLife batLife) {
		this.batLife = batLife;
	}

	public String getOS() {
		return "I run the most customizable OS which makes things easier...";
	}

	@Override
	public String toString() {
		return "Android [batLife=" + batLife + "]";
	}

}
