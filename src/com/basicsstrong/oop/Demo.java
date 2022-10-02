package com.basicsstrong.oop;


class Fan {
	private boolean isOn;

 public void turnOn() {
	 	this.isOn = true;
		System.out.println("Fan is spinning");
		}

	public void turnOff() { 
		this.isOn = false;
		System.out.println("Fan is stop");
 }
}


public class Demo {

	public static void main(String[] args) {
		
		Fan myFan = new Fan();
		myFan.turnOn();
		myFan.turnOff();

	}

}
