package com.vishesh;

import org.springframework.stereotype.Component;

@Component
public class Android implements Device {

	public String getOS() {
		return "I run the most customizable OS which makes things easier...";
	}
}
