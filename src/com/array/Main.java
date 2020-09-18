package com.array;

public class Main {

	static Long longArray[] = { 3l, 42l, 15l, 1l, 0l };

	public static void main(String[] args) {

		Array array = new Array();

		array.printArray(longArray);

		// Long arrayL[] = array.rotateArray(longArray, 3);

		// Long arrayL[] = array.reversalAlgo(longArray, 3);

		// Long arrayL[] = array.rotateCyclic(longArray, 1);

		// array.findElementInSortedRtatedArray(longArray, 3l);

		// array.binarySearchSorted(longArray, 7l);

		// array.findElementInSortedRtatedArray(longArray, 2l);

		Long arrayL[] = array.selectionSort(longArray);

		System.out.println("");
		array.printArray(arrayL);
	}

}
