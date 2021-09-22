package com.java.class22;

class SonyTV {
	void channel_1() {
		System.out.println("channel 1 from Sony");
	}

	void channel_2() {
		System.out.println("channel 2 from Sony");
	}
}

class LGTV extends SonyTV {
	void channel_1() {
		System.out.println("channel 1 from LG");
	}

	void channel_2() {
		System.out.println("channel 2 from LG");
	}

	void channel_3() {
		System.out.println("channel 3 from LG");
	}
}
