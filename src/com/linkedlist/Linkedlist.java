package com.linkedlist;

import java.util.HashSet;
import java.util.Set;

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

	public void printList(Linkedlist linkedlist) {
		Node currentNode = linkedlist.head;

		System.out.println("Linkedlist : ");

		while (currentNode != null) {
			System.out.println(currentNode.data + " ");

			currentNode = currentNode.nextNode;
		}
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

	public void getNthNodeFromEnd(Linkedlist linkedlist, int index) {

		int length = findLengthOflinkedlistRecursive(linkedlist.head);

		index = length - index;

		getKeyByIndex(linkedlist, index);

	}

	public Node findMiddleNode(Linkedlist linkedlist) {
		Node fastPointer = linkedlist.head;
		Node slowPointer = linkedlist.head;
		Node prevOfSlowPointer = linkedlist.head;

		while (fastPointer != null && fastPointer.nextNode != null) {
			fastPointer = fastPointer.nextNode.nextNode;
			prevOfSlowPointer = slowPointer;
			slowPointer = slowPointer.nextNode;
		}
		System.out.println("The middle element is " + slowPointer.data);
		return prevOfSlowPointer;
	}

	public void getOccurenceCount(Linkedlist linkedlist, Long key) {
		int freq = 0;

		System.out.println("count of " + key + " is " + getOccCount(linkedlist.head, key, freq));

	}

	public int getOccCount(Node node, Long key, int freq) {
		if (node == null) {
			return freq;
		}
		if (node.data.equals(key)) {
			freq++;
		}
		return getOccCount(node.nextNode, key, freq);
	}

	public void detectLoop(Linkedlist linkedlist) {
		Node currNode = linkedlist.head;

		if (currNode == null) {
			System.out.println("Empty list");
		}

		HashSet<Node> hashSet = new HashSet<>();

		while (currNode != null) {
			if (hashSet.contains(currNode)) {
				System.out.println("Loop found");
				break;
			} else {
				hashSet.add(currNode);
			}
			currNode = currNode.nextNode;
		}

	}

	public void detectLoopFloydsCycleFindingAlgorithm(Linkedlist linkedlist, String methodName) {
		Node fastPointer = linkedlist.head;
		Node slowPointer = linkedlist.head;

		while (fastPointer != null && fastPointer.nextNode != null) {
			fastPointer = fastPointer.nextNode.nextNode;
			slowPointer = slowPointer.nextNode;

			if (slowPointer == fastPointer) {
				System.out.println("Loop found");
				break;
			}
		}
		if (methodName.equals("removeLoop")) {
			removeLoop(slowPointer, fastPointer, linkedlist.head);
		}
	}

	public void lengthOfLoop(Linkedlist linkedlist) {
		Node fastPointer = linkedlist.head;
		Node slowPointer = linkedlist.head;

		while (fastPointer != null && fastPointer.nextNode != null) {
			fastPointer = fastPointer.nextNode.nextNode;
			slowPointer = slowPointer.nextNode;

			if (slowPointer == fastPointer) {
				System.out.println("Length of loop :" + countLoop(slowPointer));
				break;
			}
		}
	}

	public int countLoop(Node slowPointer) {

		int count = 1;

		Node tempPointer = slowPointer;

		while (tempPointer.nextNode != slowPointer) {
			count++;
			tempPointer = tempPointer.nextNode;
		}
		return count;
	}

	public void detectAndremoveLoop(Linkedlist linkedlist) {
		detectLoopFloydsCycleFindingAlgorithm(linkedlist, "removeLoop");
	}

	public void removeLoop(Node slowPointer, Node fastNode, Node head) {

		if (slowPointer == fastNode) {
			slowPointer = head;

			while (slowPointer.nextNode != fastNode.nextNode) {
				slowPointer = slowPointer.nextNode;
				fastNode = fastNode.nextNode;
			}
			fastNode.nextNode = null;
		}
	}

	public Node reverseList(Node head) {
		Node previousNode = null;
		Node currNode = head;
		Node nextNode = null;

		while (currNode != null) {
			nextNode = currNode.nextNode;
			currNode.nextNode = previousNode;
			previousNode = currNode;
			currNode = nextNode;
		}
		currNode = previousNode;
		return currNode;
	}

	public boolean compareList(Node head1, Node head2) {

		while (head1 != null && head2 != null) {
			if (head1.data.equals(head2.data)) {
				head1 = head1.nextNode;
				head2 = head2.nextNode;
			} else {
				return false;
			}
		}
		if (head1 == null && head2 == null) {
			return true;
		}
		return false;
	}

	public void checkPalindrome(Linkedlist linkedlist) {
		Node fastPointer = linkedlist.head;
		Node slowPointer = linkedlist.head;
		Node prevOfSlowPointer = linkedlist.head;

		while (fastPointer != null && fastPointer.nextNode != null) {
			fastPointer = fastPointer.nextNode.nextNode;
			prevOfSlowPointer = slowPointer;
			slowPointer = slowPointer.nextNode;
		}

		Node midNode = null;

		// to check for odd/even nodes, odd nodes will not null fastnode while even will
		// give null node
		if (fastPointer != null) {
			midNode = slowPointer;
			slowPointer = slowPointer.nextNode;
		}
		Node secondHalf = slowPointer;
		prevOfSlowPointer.nextNode = null;

		Node revNode = reverseList(secondHalf);

		if (compareList(linkedlist.head, revNode)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
		revNode = reverseList(revNode);

		if (midNode != null) {
			prevOfSlowPointer.nextNode = midNode;
			midNode.nextNode = revNode;
		} else {
			prevOfSlowPointer.nextNode = secondHalf;
		}
	}

	public void removeDuplicateFromSortedList(Linkedlist linkedlist) {

		Node currNode = linkedlist.head;

		while (currNode != null) {
			Node tempNode = currNode;

			while (tempNode != null && tempNode.data.equals(currNode.data)) {
				tempNode = tempNode.nextNode;
			}
			currNode.nextNode = tempNode;
			currNode = currNode.nextNode;
		}
	}

	public void removeDuplicateRecu(Node head) {
		if (head != null && head.nextNode != null) {
			if (head.data.equals(head.nextNode.data)) {
				head.nextNode = head.nextNode.nextNode;
				removeDuplicateRecu(head);
			} else {
				removeDuplicateRecu(head.nextNode);
			}
		}
	}

	public void removeDuplicateFromUnsortedList(Linkedlist linkedlist) {
		// complexity O(n)

		Node currNode = linkedlist.head;
		Set<Long> longSet = new HashSet<>();
		Node noDuplicateNode = null;

		while (currNode != null) {
			if (longSet.contains(currNode.data)) {
				noDuplicateNode.nextNode = currNode.nextNode;
			} else {
				longSet.add(currNode.data);
				noDuplicateNode = currNode;
			}
			currNode = currNode.nextNode;
		}
	}

	public void removeDuplicateFromUnsortedListUsingLoop(Linkedlist linkedlist) {
		// complexity O(n^2)

		Node currNode = linkedlist.head;
		Node newLoopNode = linkedlist.head;
		Node noDuplicateNode = null;

		while (currNode != null && currNode.nextNode != null) {
			while (newLoopNode != null && newLoopNode.nextNode != null) {
				if (currNode.data.equals(newLoopNode.nextNode.data)) {
					noDuplicateNode = newLoopNode.nextNode;
					newLoopNode.nextNode = newLoopNode.nextNode.nextNode;
				}
				newLoopNode = newLoopNode.nextNode;

			}
			currNode = currNode.nextNode;
		}
	}

	public void swapTwoNodesData(Linkedlist linkedlist, Long x, Long y) {
		Node currNode = linkedlist.head;
		Node nodeX = null;
		Node nodeY = null;

		while (currNode.nextNode != null) {
			if (x.equals(currNode.nextNode.data)) {
				nodeX = currNode;
			}
			if (y.equals(currNode.nextNode.data)) {
				nodeY = currNode;
			}
			currNode = currNode.nextNode;
		}

		if (nodeX != null && nodeY != null) {
			Node temp = nodeX.nextNode;
			nodeX.nextNode = nodeY.nextNode;
			nodeY.nextNode = temp;

			temp = nodeX.nextNode.nextNode;
			nodeX.nextNode.nextNode = nodeY.nextNode.nextNode;
			nodeY.nextNode.nextNode = temp;
		}
	}

	public void pairSwap(Linkedlist linkedlist) {
		Node currNode = linkedlist.head;
		while (currNode != null && currNode.nextNode != null) {
			Long data = currNode.data;
			currNode.data = currNode.nextNode.data;
			currNode.nextNode.data = data;

			currNode = currNode.nextNode.nextNode;
		}
	}

	public void lastToFirst(Linkedlist linkedlist) {
		Node currNode = linkedlist.head;

		Node onePrevNode = null;

		while (currNode != null && currNode.nextNode != null) {
			onePrevNode = currNode;
			currNode = currNode.nextNode;
		}

		if (currNode != null) {
			Node lastNode = currNode;

			onePrevNode.nextNode = null;
			// currNode = null;
			lastNode.nextNode = linkedlist.head;
			linkedlist.head = lastNode;
		}
	}

	public Linkedlist intersectionOfTwoLists(Linkedlist linkedlist1, Linkedlist linkedlist2) {
		Linkedlist linkedlist = new Linkedlist();

		Node headA = linkedlist1.head;

		while (headA != null) {
			Node headB = linkedlist2.head;

			while (headB != null) {

				if (headA.data == headB.data) {
					linkedlist = insert(linkedlist, headA.data);
				}
				headB = headB.nextNode;

			}
			headA = headA.nextNode;
		}
		return linkedlist;
	}

	public void intersectionPoint(Linkedlist linkedlist1, Linkedlist linkedlist2) {
		Node headA = linkedlist1.head;

		while (headA != null && headA.nextNode != null) {
			Node headB = linkedlist2.head;

			while (headB != null && headB.nextNode != null) {
				if (headA.nextNode.data == headB.nextNode.data) {
					System.out.println("Intersection point : " + headA.nextNode.data);
				}
				headB = headB.nextNode;
			}
			headA = headA.nextNode;

		}
	}

	public void seperateEvenOdd(Linkedlist linkedlist) {
		Node currNode = linkedlist.head;

		Node evenStart = null;
		Node evenEnd = null;
		Node oddStart = null;
		Node oddEnd = null;

		while (currNode != null) {
			if ((currNode.data % 2) == 0) {
				if (evenStart == null) {
					evenStart = currNode;
					evenEnd = evenStart;
				} else {
					evenEnd.nextNode = currNode;
					evenEnd = evenEnd.nextNode;
				}
			} else {

				if (oddStart == null) {
					oddStart = currNode;
					oddEnd = oddStart;
				} else {
					oddEnd.nextNode = currNode;
					oddEnd = oddEnd.nextNode;
				}
			}
			// Move head pointer one step in forward direction
			currNode = currNode.nextNode;
		}

		evenEnd.nextNode = oddStart;
		oddEnd.nextNode = null;
		head = evenStart;
	}
}
