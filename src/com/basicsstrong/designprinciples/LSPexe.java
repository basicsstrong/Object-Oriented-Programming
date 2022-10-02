package com.basicsstrong.designprinciples;

class Bird{
	
	// base functionality related to Bird
	public void info() {
		System.out.println("I am a bird!");
	}
	
}

class FlyingBird extends Bird{
	public void fly() {
		System.out.println("I am a flying Bird!");
	}
}

class Sparrow extends FlyingBird{
	
}

class Ostrich extends Bird{
	
}
public class LSPexe {

	public static void main(String[] args) {
		Ostrich bird = new Ostrich();
		bird.info();

	}

}
