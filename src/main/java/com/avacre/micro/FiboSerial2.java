package com.avacre.micro;



public class FiboSerial2 {
	public static void main(String[] args) {
		Integer astrmN = new Integer("12");
		greatesNumber(astrmN);
	
		
	}

	static void greatesNumber(Integer number) {
		int ant = 0;
		int act = 0;
		int sig = 0;
		for (int i = 0; i <= number; i++) {
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
