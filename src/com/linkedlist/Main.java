package com.linkedlist;

public class Main {

	public static void main(String[] args) {

		Linkedlist linkedlist = new Linkedlist();
		linkedlist = linkedlist.insert(linkedlist, 1l);
		linkedlist = linkedlist.insert(linkedlist, 2l);
		linkedlist = linkedlist.insert(linkedlist, 3l);
		linkedlist = linkedlist.insert(linkedlist, 4l);
		linkedlist = linkedlist.insert(linkedlist, 5l);
		linkedlist = linkedlist.insert(linkedlist, 6l);
		
		Linkedlist linkedlist2 = new Linkedlist();
		linkedlist2 = linkedlist2.insert(linkedlist2, 1l);
		linkedlist2 = linkedlist2.insert(linkedlist2, 1l);
		linkedlist2 = linkedlist2.insert(linkedlist2, 3l);

//		linkedlist.head.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode = linkedlist.head.nextNode.nextNode;
//		linkedlist.printList(linkedlist);

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
		
//		linkedlist.removeDuplicateRecu(linkedlist.head);
		
//		linkedlist.removeDuplicateFromUnsortedList(linkedlist);
		
//		linkedlist.removeDuplicateFromUnsortedListUsingLoop(linkedlist);
		
//		linkedlist.swapTwoNodesData(linkedlist, 2l, 5l);
		
//		linkedlist.pairSwap(linkedlist);
		
//		linkedlist.lastToFirst(linkedlist);
		
//		linkedlist = linkedlist.intersectionOfTwoLists(linkedlist, linkedlist2);
		
		linkedlist.printList(linkedlist);
		
		


	}

}
