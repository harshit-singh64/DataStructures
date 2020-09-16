package com.array;

public class Main {

	static Long longArray[] = { 1l, 2l, 3l, 4l, 5l, 6l, 7l };

	public static void main(String[] args) {

		Array array = new Array();

		Long arrayL[] = array.rotateArray(longArray, 3);

		array.printArray(arrayL);
	}

}
