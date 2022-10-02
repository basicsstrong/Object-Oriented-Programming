package com.basicsstrong.prerequisites;

class Addition {
	
	public static int var = 1;
	
	public int findsum(int a, int b) {
		//findsum(int, int)
		int sum = 0;
		 sum = a + b ;
		 return sum;
	}
	
	public static int get() {
		return var++;
	}

		 }


public class AdditionalExe {

	public static void main(String[] args) {
		Addition ob = new Addition();
		int result = ob.findsum(10, 20);
		System.out.println(result);
		System.out.println(Addition.get());
		System.out.println(ob.get());
		
		
		}
}
