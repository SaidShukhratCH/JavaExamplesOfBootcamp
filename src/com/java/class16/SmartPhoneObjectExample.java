package com.java.class16;

public class SmartPhoneObjectExample {
	public static void main(String[] args) {
		SmartPhone iPhone8 = new SmartPhone(); 
		SmartPhone samsungM31 = new SmartPhone(); 
		
		iPhone8.color = "black";
		iPhone8.model = "Apple Iphone 8 64GB";
		
		samsungM31.color = "Silver";
		samsungM31.sizeOfRam = 8; 
		
		System.out.println(iPhone8.color);
		
		iPhone8.call();
		
	}
}
