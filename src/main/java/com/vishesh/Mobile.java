package com.vishesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {

		ApplicationContext cxt = new ClassPathXmlApplicationContext("springcfg.xml");

		// Device phone = (Device) cxt.getBean("android");
		// System.out.println(phone.getOS());

		BatteryLife bl = (BatteryLife) cxt.getBean("batterylife");
		System.out.println(bl);
	}

}
