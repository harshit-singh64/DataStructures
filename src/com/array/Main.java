package com.array;

public class Main {

	public static void main(String[] args) {

		// Long longArray[] = { 3l, 4l, 5l, 1l, 2l };
		Long longArray[] = new Long[5];
		longArray[0] = 1l;
		longArray[1] = 2l;
		longArray[2] = 3l;
		longArray[3] = 4l;
		longArray[4] = 5l;

		Array array = new Array();
		array.printArray(longArray);
		System.out.println("");

		// Long arrayL[] = array.rotateArray(longArray, 3);

		array.reversalAlgo(longArray, 3);

		// Long arrayL[] = array.rotateCyclic(longArray, 1);

		// array.findElementInSortedRtatedArray(longArray, 3l);

		// array.binarySearchSorted(longArray, 7l);

		// array.findElementInSortedRtatedArray(longArray, 2l);

		// Long arrayL[] = array.selectionSort(longArray);

		// array.findSumPair(longArray, 6l);

		// array.maxPossibleSumByRotation(longArray);

		// array.fingNoOfRotations(longArray);

		// array.insertion(longArray, 6l, null);

//		array.bubbleSort(longArray);

		array.printArray(longArray);

	}

}
