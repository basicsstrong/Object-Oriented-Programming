package com.basicsstrong.designprinciples;

public class Month {

	public static void main(String[] args) {
		String month = getMonth(12);
		System.out.println("Month is : " + month);
		}

	private static String getMonth(int month) {
		switch (month) {
		case 1:
			return "January";
		case 2:
			return "Februray";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
			default:
				throw new IllegalArgumentException("month must be in range 1 to 12");
		}
	}
	
	 private static String getMonthName(int month) {
		if ((month < 1) || (month > 12))
			throw new IllegalArgumentException("month must be in range 1 to 12");
		else {
			String[] months = {"January", "Februray", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
			return months[month - 1];
		}
		
		}
	}
				
	
	
	
	
	
	
	
	
	
	
	
	
