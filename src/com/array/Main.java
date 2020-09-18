package com.array;

public class Main {

	static Long longArray[] = { 1l, 2l, 3l, 4l, 5l, 6l, 7l };

	public static void main(String[] args) {

		Array array = new Array();

		array.printArray(longArray);
		
//		Long arrayL[] = array.rotateArray(longArray, 3);
		
//		Long arrayL[] = array.reversalAlgo(longArray, 3);
		
//		Long arrayL[] = array.rotateCyclic(longArray, 1);
		
//		array.findElementInSortedRtatedArray(longArray, 3l);
		
		array.binarySearchSorted(longArray, 7l);

//		array.printArray(arrayL);
	}

}
