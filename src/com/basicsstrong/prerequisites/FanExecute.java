package com.basicsstrong.prerequisites;

class Fan {

	public boolean isOn;
	public static int staticVar;

	void get() {
		staticVar++;

	}

	public void turnOn() {
		int var = 0;
		isOn = true;
	}

	public void turnOff() {
		isOn = false;
	}

	public void checkFanStatus() {
		if (isOn)
			System.out.println("Fan is On!");
		else
			System.out.println("Fan is Off!");
	}
}

public class FanExecute {

	public static void main(String[] args) {
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();

		fan1.turnOn();
		fan1.checkFanStatus();
		fan2.turnOff();
		fan2.checkFanStatus();
		System.out.println(fan1.isOn);
		// System.out.println(Fan.staticVar);
		fan1.get();
		System.out.println(fan2.staticVar);

	}
}
