package com.java.class22;

public class DynamicPolyExample {
	public static void main(String[] args) {
		SonyTV ss = new SonyTV();
		LGTV lg = new LGTV();

		SonyTV sl = new LGTV();
		LGTV ls = new SonyTV();

		sl.channel_1();
		sl.channel_2();

	}
}
