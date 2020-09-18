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

	public Long[] reversalAlgo(Long arry[], int noOfElements) {

		arry = reverse(arry, 0, noOfElements - 1);
		arry = reverse(arry, noOfElements, arry.length - 1);
		arry = reverse(arry, 0, arry.length - 1);

		return arry;
	}

	public Long[] reverse(Long arr[], int start, int end) {
		while (start < end) {
			Long temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		return arr;
	}

	public Long[] rotateCyclic(Long array[], int number) {
		int j = 0;
		while (j < number) {
			Long temL = array[0];
			int i = 0;

			while (i < array.length - 1) {
				array[i] = array[i + 1];
				i++;
			}
			array[array.length - 1] = temL;

			j++;
		}
		return array;
	}

	public void printArray(Long arry[]) {

		for (int i = 0; i < arry.length; i++) {
			System.out.println(arry[i]);
		}
	}

	public void findElementInSortedRtatedArray(Long arry[], Long key) {
		int count = 0;
		while (count < arry.length) {
			if (key != null && key.equals(arry[count])) {
				System.out.println("index of key : " + key + " is : " + count);
				break;
			}
			count++;
		}
	}

	public void binarySearchSorted(Long arr[], Long key) {
		binarySearch(0, arr.length - 1, arr, key);
	}

	public void binarySearch(int lowIdx, int highIdx, Long arr[], Long key) {
		int midIdx = (lowIdx + highIdx) / 2;

		if (key.equals(arr[midIdx])) {
			System.out.println("key " + key + " found at index " + midIdx);
		} else {
			if (key < arr[midIdx]) {
				binarySearch(lowIdx, midIdx - 1, arr, key);
			} else {
				binarySearch(midIdx + 1, highIdx, arr, key);
			}
		}
	}
}
