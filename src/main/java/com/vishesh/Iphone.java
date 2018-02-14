package com.vishesh;

import org.springframework.stereotype.Component;

@Component
public class Iphone implements Device {

	public String getOS() {
		return "I run on the most secured mobile OS";
	}
}
