package com.linkedlist;

public class Main {

	public static void main(String[] args) {

		Linkedlist linkedlist = new Linkedlist();
		linkedlist = linkedlist.insert(linkedlist, 1l);
		linkedlist = linkedlist.insert(linkedlist, 2l);
		linkedlist = linkedlist.insert(linkedlist, 2l);
		linkedlist = linkedlist.insert(linkedlist, 2l);
		linkedlist = linkedlist.insert(linkedlist, 3l);
		linkedlist = linkedlist.insert(linkedlist, 4l);

//		linkedlist.head.nextNode.nextNode.nextNode.nextNode.nextNode = linkedlist.head.nextNode;
		linkedlist.printList(linkedlist);

		// linkedlist.deleteByKey(linkedlist, 20l);

//		linkedlist.deleteByIndex(linkedlist, 10);

//		linkedlist.printList(linkedlist);
		
//		linkedlist.findLengthOflinkedlistIt(linkedlist);
		
//		linkedlist.getCount(linkedlist);
		
//		linkedlist.getKeyByIndex(linkedlist, 4);
		
//		linkedlist.getNthNodeFromEnd(linkedlist, 2);
		
//		linkedlist.findMiddleNode(linkedlist);
		
//		linkedlist.getOccurenceCount(linkedlist, 5l);
		
//		linkedlist.detectLoop(linkedlist);

//		linkedlist.detectLoopFloydsCycleFindingAlgorithm(linkedlist, " ");
		
//		linkedlist.lengthOfLoop(linkedlist);
				
//		linkedlist.detectAndremoveLoop(linkedlist);
		
//		linkedlist.reverseList(linkedlist);
		
//		linkedlist.checkPalindrome(linkedlist);

//		linkedlist.removeDuplicateFromSortedList(linkedlist);
		
		linkedlist.removeDuplicateRecu(linkedlist.head);
		
		linkedlist.printList(linkedlist);
		
		


	}

}
