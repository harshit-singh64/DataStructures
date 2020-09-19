package com.array;

public class Main {

	static Long longArray[] = { 3l, 4l, 5l, 1l, 2l };
//	static Long longArray[] = { 15l, 18l, 2l, 3l, 6l, 12l};

	
	public static void main(String[] args) {

		Array array = new Array();

		array.printArray(longArray);

		// Long arrayL[] = array.rotateArray(longArray, 3);

		// Long arrayL[] = array.reversalAlgo(longArray, 1);

		// Long arrayL[] = array.rotateCyclic(longArray, 1);

		// array.findElementInSortedRtatedArray(longArray, 3l);

		// array.binarySearchSorted(longArray, 7l);

		// array.findElementInSortedRtatedArray(longArray, 2l);

		// Long arrayL[] = array.selectionSort(longArray);

		// array.findSumPair(longArray, 6l);

		// array.maxPossibleSumByRotation(longArray);

		array.fingNoOfRotations(longArray);
		// System.out.println("");
		// array.printArray(arrayL);
	}

}
