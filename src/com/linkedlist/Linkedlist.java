package com.linkedlist;

public class Linkedlist {

	Node head;

	public Linkedlist insert(Linkedlist linkedlist, Long data) {
		Node newNode = new Node(data);
		newNode.nextNode = null;

		if (linkedlist.head == null) {
			linkedlist.head = newNode;
		} else {
			Node lastNode = linkedlist.head;
			while (lastNode.nextNode != null) {
				lastNode = lastNode.nextNode;
			}
			lastNode.nextNode = newNode;
		}
		return linkedlist;
	}

	public Linkedlist deleteByKey(Linkedlist linkedlist, Long key) {

		Node currentNode = linkedlist.head;
		Node previousNode = null;

		if (currentNode != null && currentNode.data == key) {
			linkedlist.head = currentNode.nextNode;
			System.out.println(key + " found and deleted");

			return linkedlist;
		}

		while (currentNode != null && !currentNode.data.equals(key)) {
			previousNode = currentNode;
			currentNode = currentNode.nextNode;
		}

		if (currentNode != null) {
			previousNode.nextNode = currentNode.nextNode;
			System.out.println(key + " found and deleted");
		}

		return linkedlist;
	}

	public Linkedlist deleteByIndex(Linkedlist linkedlist, int index) {

		Node currentNode = linkedlist.head;
		Node previousNode = null;

		if (currentNode != null && index == 0) {
			linkedlist.head = currentNode.nextNode;
			System.out.println(index + " found and deleted");
			return linkedlist;
		}

		int counter = 0;

		while (currentNode != null) {
			if (counter == index) {
				previousNode.nextNode = currentNode.nextNode;
				System.out.println(index + " found and deleted");

				break;
			} else {
				previousNode = currentNode;
				currentNode = currentNode.nextNode;
				counter++;
			}
		}

		return linkedlist;
	}

	public void getKeyByIndex(Linkedlist linkedlist, int index) {

		Node currentNode = linkedlist.head;

		// if (currentNode != null && index == 0) {
		// System.out.println("Key at index " + index + " is " + currentNode.data);
		// }

		int counter = 0;

		while (currentNode != null) {
			if (counter == index) {
				System.out.println("Key at index " + index + " is " + currentNode.data);

				break;
			} else {
				currentNode = currentNode.nextNode;
				counter++;
			}
		}
	}

	public void findLengthOflinkedlistIt(Linkedlist linkedlist) {
		System.out.println("Iterative_____");
		Node curNode = linkedlist.head;
		int counter = 0;

		while (curNode != null) {
			counter++;

			curNode = curNode.nextNode;
		}
		System.out.println("Length is : " + counter);
	}

	public void getCount(Linkedlist linkedlist) {
		System.out.println("Recursive_____");
		System.out.println("Length is : " + findLengthOflinkedlistRecursive(linkedlist.head));
	}

	public int findLengthOflinkedlistRecursive(Node node) {
		if (node == null) {
			return 0;
		} else {
			return 1 + findLengthOflinkedlistRecursive(node.nextNode);
		}
	}

	public void printList(Linkedlist linkedlist) {
		Node currentNode = linkedlist.head;

		System.out.println("Linkedlist : ");

		while (currentNode != null) {
			System.out.println(currentNode.data + " ");

			currentNode = currentNode.nextNode;
		}
	}

	public void getNthNodeFromEnd(Linkedlist linkedlist, int index) {

		int length = findLengthOflinkedlistRecursive(linkedlist.head);

		index = length - index;

		getKeyByIndex(linkedlist, index);

	}

	public void findMiddleNode(Linkedlist linkedlist) {
		Node fastPointer = linkedlist.head;
		Node slowPointer = linkedlist.head;

		while (fastPointer != null && fastPointer.nextNode != null) {
			fastPointer = fastPointer.nextNode.nextNode;
			slowPointer = slowPointer.nextNode;
		}
		System.out.println("The middle element is " + slowPointer.data);

	}

	public void getOccurenceCount(Linkedlist linkedlist, Long key) {
		int freq = 0;

		System.out.println("count of " + key + " is " + getOccCount(linkedlist.head, key, freq));

	}

	public int getOccCount(Node node, Long key,int freq) {
		if (node == null) {
			return freq;
		}
		if (node.data.equals(key)) {
			freq++;
		}
		return getOccCount(node.nextNode, key, freq);
	}
}
