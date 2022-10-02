package com.basicsstrong.business;

public class Person extends Company {

	public static void main(String[] args) {

		Company com = new Company();
		com.enrollEmployee("john");
		Person p = new Person();
		//p.enrollEmployee(name);
		Company c = new Person();
		//c.enrollEmployee(name);
	}

}
