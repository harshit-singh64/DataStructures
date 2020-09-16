package com.array;

public class Array {

	public Long[] rotateArray(Long arry[], int noOfElements) {

		int count = 0;
		Long arr1[] = new Long[noOfElements];
		Long arr2[] = new Long[(arry.length - noOfElements)];

		while (count < noOfElements) {
			arr1[count] = arry[count];
			count++;
		}

		int count2 = 0;
		while (count < arry.length) {
			arr2[count2] = arry[count];
			count2++;
			count++;

		}

		for (int i = 0; i < arr2.length; i++) {
			arry[i] = arr2[i];
		}

		for (int i = 0; i < arr1.length; i++) {
			arry[i + arr2.length] = arr1[i];
		}
		return arry;
	}

	public void printArray(Long arry[]) {

		for (int i = 0; i < arry.length; i++) {
			System.out.println(arry[i]);
		}
	}
}
