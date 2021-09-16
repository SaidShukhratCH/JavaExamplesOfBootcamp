package com.java.class18;

class NokiaPhone {
	String color;
	int megaPixel;
	static boolean isTouchScreen;

	void showInfo() {
		System.out.println(color);
		System.out.println(megaPixel);
		System.out.println(isTouchScreen);
	}
}

public class StaticVariable {
	public static void main(String[] args) {
		NokiaPhone nokia5233 = new NokiaPhone();
		NokiaPhone nokia7210 = new NokiaPhone();

		NokiaPhone.isTouchScreen = true;
		
		nokia5233.color = "Black";
		nokia5233.megaPixel = 2;

		nokia7210.color = "White";
		nokia7210.megaPixel = 4;
		
		NokiaPhone.isTouchScreen = false;
		nokia5233.showInfo();

	}
}
