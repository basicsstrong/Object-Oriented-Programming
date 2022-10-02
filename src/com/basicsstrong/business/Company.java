package com.basicsstrong.business;

import java.util.Calendar;
import java.util.Date;

import javax.management.relation.Role;

/*public class company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Date date
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
	}
	
	
}
*/

public class Company {
	
	protected String empEmailID;
	
	public void enrollEmployee (String name) {
		System.out.println(name+"is enrolled.Welcome!");
		
	}
}