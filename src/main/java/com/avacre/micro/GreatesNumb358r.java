package com.avacre.micro;

//@FunctionalInterface
interface Operation{
	int sume(int a, int b);
}


public class GreatesNumb358r {
	public static void main(String[] args) {
		Integer astrmN = new Integer("12");
		value(astrmN); 
		
		Operation ope = (a,b) -> a + b;
		
		System.out.println(ope.sume(4, 7));
		
		
	}

	static void value(Integer serial) {
		int ant = 0;
		int act = 0;
		int sig = 0;
		for (int i = 0; i <= serial; i++) {
			if (i == 0) {
				act = 1;
				sig = ant + act;
			} else {
                ant = act;
				act = sig;			
				sig = ant + act;
			}
			 System.out.println("Serie: " + i + ", ant " + ant +" act "+act+" sig "+sig );
		}
	}

}
