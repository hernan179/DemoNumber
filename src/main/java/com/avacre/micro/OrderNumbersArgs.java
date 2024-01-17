package com.avacre.micro;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class OrderNumbersArgs {
	public static void main(String[] args) {
		Integer[] astrmN = new Integer[10];
		astrmN[0] = 6;
		astrmN[1] = 4;
		astrmN[2] = 8;
		astrmN[3] = 5;
		astrmN[4] = 9;
		astrmN[5] = 2;
		astrmN[6] = 10;
		astrmN[7] = 3;
		astrmN[8] = 7;
		astrmN[9] = 1;

		// List<Integer> nums = Arrays.asList(getMinimal(astrmN));

		value(astrmN);

		// System.out.println(nums);
	}

	static void value(Integer[] serial) {
		for (Integer it : serial) {
			int j = 0;
			do {
				if (serial[j] < serial[j + 1]) {
					System.out.println("moved index here");
					int aux = serial[j];
					int next = serial[j + 1];
					serial[j] = next;
					serial[j + 1] = aux;
				}
				System.out.println(serial[j]);
				j++;
			} while (j < serial.length - 1);
			System.out.println("------------jjjj-----------" + j);
		}
		System.out.println(Arrays.asList(serial));
	}

	static Integer[] getMinimal(Integer[] unsortedArray) {
		for (Integer number : unsortedArray) {
			for (int j = 0; j < unsortedArray.length - 1; j++) {
				if (unsortedArray[j] < unsortedArray[j + 1]) {
					int aux = unsortedArray[j];
					int next = unsortedArray[j + 1];
					unsortedArray[j] = next;
					unsortedArray[j + 1] = aux;
				}
			}
		}
		return unsortedArray;
	}

}
