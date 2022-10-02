package com.basicsstrong.oop;

import java.util.ArrayList;

interface Mobile{
	   
	   public void calling (String number);
	   
	   public void sendMessage(String message);
	   
   }
   
   class Apple implements Mobile{
	   
	   private ArrayList<String> contacts = new ArrayList<String>();
	   
	   public void addContacts(String number) 
	   {
		   contacts.add(number);
	   }
	   

	@Override
	public void calling(String number) {
   System.out.println("Calling...."+number);		
	}

	@Override
	public void sendMessage(String message) {
    System.out.println("Sending message...."+message);		
	}}

public class AbstractionDemo {

	public static void main(String[] args) {
		
		Apple myPhone = new Apple();
		myPhone.calling("8758775835858");
		myPhone.sendMessage("Hello, howz you?");
		myPhone.addContacts("68746587346");
		

Samsung myNewPhone = new Samsung();
myNewPhone.addContact("7667676796");
myNewPhone.addContact("7667676796");
myNewPhone.sendMessage("7667676796");



	}
	
}


abstract class Mobilee{
	
	ArrayList<String> list = new ArrayList<String>();
	
	
	abstract void calling(String number);
	
	abstract void sendMessage(String message);
	
	public void addContact(String contact) {
		list.add(contact);
		
	}
	
} 
class Samsung extends Mobilee{

	@Override
	void calling(String number) {
System.out.println("Calling...."+number);		
	}

	@Override
	void sendMessage(String message) {
System.out.println("Sending message...."+message);		
	}
	
}