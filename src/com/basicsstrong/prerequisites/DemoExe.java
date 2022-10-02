package com.basicsstrong.prerequisites;

class Demo{
	
	private int a;
	
	//non-parameterized
	public Demo() {
		a = 10;
	}
	
	//Parameterized
	public Demo(int a){
		this.a = a;
	}
	
	public void get() {
		System.out.println("value is: "+a);
	}
	
	}

public class DemoExe {
	
	public static void main(String[] args) {
		//Demo d = new Demo();
		Demo ob = new Demo(15);
		ob.get();
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}