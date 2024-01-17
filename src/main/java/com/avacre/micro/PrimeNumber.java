package com.avacre.micro;

public class PrimeNumber {
	public static void main(String[] args) {
	Integer astrmN = new Integer("1634");
	String[] a = astrmN.toString().split("");
	int serial = a.length;
	int stramNum = 0;
	for(String s: a) {
		stramNum += value(s, serial);
	}
	System.out.println(stramNum);
}	
	static int value(String value, int serial) {
		Integer localVal = new Integer(value);
		int aux = localVal;
		for(int i = 1; i < serial; i++) {
			aux = aux * localVal;
		}		
		return (aux);
	}
	
}
