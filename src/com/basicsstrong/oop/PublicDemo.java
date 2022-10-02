package com.basicsstrong.oop;

public  class PublicDemo {
	
	
	//private : inside that class only
	
	//protected :same package and within the subclass
	
	// a class or an outer class can not be private or protected
	
	//no concept like package inheritance in java
	
	//inner classes can be private and protected
	
	static int a = 0;    //gets memory at the time of class loading!
	
	int c = 0;
	
	static void displayValue() {
		System.out.println("This value for stativ variable a is : "+a);

	}
	protected void method() {
		
		int b = 0;
		System.out.println("Public method");
		}

}
