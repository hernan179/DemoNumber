package com.avacre.micro;

public class StringNumbers {
	public static void main(String[] args) {
	Integer astrmN = new Integer("12");

	boolean isprime  = value(astrmN);
	
	System.out.println("Is prime? "+isprime);
}	
	static boolean value(Integer value) {
		int aux = 0;
		
		for(int i = 1; i <= value; i++) {
		   	System.out.println("number  "+value +" "+i +" % "+i+""+(value % i));	
			if(value % i == 0) {
		   			aux++;
		   		}
		   		if(aux > 2) {
		   			return false;
		   		}
		}		
		return (true);
	}
	
}
