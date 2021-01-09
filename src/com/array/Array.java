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

	public void findElementInSortedrray(Long arry[], Long key) {
		int count = 0;
		while (count < arry.length) {
			if (key != null && key.equals(arry[count])) {
				System.out.println("index of key : " + key + " is : " + count);
				break;
			}
			count++;
		}
	}

	public void findElementInSortedRtatedArray(Long arry[], Long key) {
		int pivot = findPivot(0, arry.length - 1, arry);

		if (arry[pivot] == key) {
			System.out.println("key " + key + " found at index " + pivot);
		} else {
			if (arry[0] < key) {
				binarySearch(0, pivot - 1, arry, key);
			} else {
				binarySearch(pivot + 1, arry.length - 1, arry, key);
			}
		}
	}

	public int findPivot(int lowIdx, int highIdx, Long arr[]) {
		if (highIdx < lowIdx) {
			return 0;
		}

		if (highIdx == lowIdx) {
			return lowIdx;
		}

		int midIdx = (lowIdx + highIdx) / 2;

		if (midIdx < highIdx && arr[midIdx] > arr[midIdx + 1]) {
			return midIdx;
		} else if (midIdx > lowIdx && arr[midIdx] < arr[midIdx - 1]) {
			return (midIdx - 1);
		} else if (arr[lowIdx] >= arr[midIdx]) {
			return findPivot(lowIdx, midIdx - 1, arr);
		}
		return findPivot(midIdx + 1, highIdx, arr);
	}

	public void binarySearchSorted(Long arr[], Long key) {
		binarySearch(0, arr.length - 1, arr, key);
	}

	public void binarySearch(int lowIdx, int highIdx, Long arr[], Long key) {
		if (highIdx >= lowIdx) {

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

	public Long[] selectionSort(Long arr[]) {

		int len = arr.length;
		int i = 0;

		while (i < len - 1) {
			int minIdx = i;
			int j = i + 1;
			while (j < len) {
				if (arr[j] < arr[minIdx]) {
					minIdx = j;
				}
				j++;
			}

			Long temp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = temp;

			i++;
		}
		return arr;
	}

	public void findSumPair(Long arr[], Long sum) {
		int i = 0;
		while (i < (arr.length - 1)) {
			int j = i + 1;
			while (j < arr.length) {
				if (sum.equals(arr[i] + arr[j])) {
					System.out.println("pair with sum " + sum + " exists at index " + i + " and " + j);
				}
				j++;
			}
			i++;
		}
	}

	public void maxPossibleSumByRotation(Long arr[]) {
		int i = 0;
		Long maxSum = 0l;
		int element = 0;

		while (i < arr.length) {
			if (i != 0) {
				arr = reversalAlgo(arr, 1);
			}

			Long sum = 0l;
			for (int j = 0; j < arr.length; j++) {
				sum += j * arr[j];
			}
			if (sum > maxSum) {
				maxSum = sum;
				element = i;
			}
			i++;
		}
		System.out.println("max sum " + maxSum + " by rotating first " + element);
	}

	public void fingNoOfRotations(Long arr[]) {
		System.out.println("giving wrong value");
		Long min = arr[0];
		int min_index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
				min_index = i;
			}
		}
		System.out.println("number of rotations " + min_index);
	}

	public Long[] insertion(Long arr[], Long key, Integer position) {

		int len = arr.length;

		if (position != null && position > len) {
			System.out.println("can not be inserted.. array size is less");
		} else if (position != null) {

		} else {
			arr[len] = key;
		}
		return arr;
	}
	
	public Long[] bubbleSort(Long arr[]) {
		int len = arr.length;
		int i = 0;

		while (i < len) {
			int j = 0;
			while (j < len-1) {
				if (arr[j] > arr[j + 1]) {
					Long temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				j++;
			}
			i++;
		}
		return arr;
	}
}
