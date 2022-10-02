package com.basicsstrong.oop;

//Single inheritance
//parent
class A{
	
}
//child 
class B extends A{
	
}

//Multilevel
class C extends B{
	
}

//Multiple : More then 1 parent : Not possible

interface AA{
	
	default void method() {
		System.out.println("Method of AA");
	}
	
}
interface AAA{
	default void method() {
		System.out.println("Method of AAA ");
	}
	
}

class BB extends A implements AA, AAA{

	@Override
	public void method() {
		AAA.super.method();
	}
	
}

//Hierarchical A -> B , BB single parent, more then 1 children 

//Hybrid :Multiple Inheritance + Multilevel Inheritance

//Cyclic

public class InheritenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
