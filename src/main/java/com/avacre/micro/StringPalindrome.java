package com.avacre.micro;

public class StringPalindrome {
	public static void main(String[] args) {
	String sData = "abcdcba";

	boolean isprime  = value(sData);
	
	System.out.println("Is palindrome? "+isprime);
	
	
}	
	static boolean value(String value) {
		
		String[] data = value.split("");
		
		for(int i =0,k=data.length-1; i< data.length;i++,k--) {
			if(data[i].equals(data[k])) {
				System.out.println("number i "+i+" "+data[i] +" k "+k+" "+data[k]);		
			}else {
				System.out.println("> number i "+i+" "+data[i] +" k "+k+" "+data[k]);	
			}
		}
		
		for(int i =0,k=data.length; i< data.length;i++,k--) {
		
			String a = value.substring(i,i+1);
			String b = value.substring(k-1,k);
			
			if(a.equals(b)) {
				System.out.println(i+" "+a+" Y "+k+"  "+b);	
			}			
		}
		
		
		
		
		return (true);
	}
	
}
