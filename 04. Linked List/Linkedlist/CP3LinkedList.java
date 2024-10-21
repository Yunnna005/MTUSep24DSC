package Linkedlist;

import java.util.NoSuchElementException;
//singly linked list with first reference only 

/**
A linked list is a sequence of links with efficient
element insertion and removal. This class 
contains a subset of the methods of the standard
java.util.LinkedList class.
*/

public class CP3LinkedList<E> {
     private class Node {
		public E data;
		public Node next;
	}
	private Node first;
		
	/** 
    	Constructs an empty linked list.
	*/
	public CP3LinkedList()
	{  
		first = null;
	}
 
	/**
 	Adds an element to the front of the linked list.
 	@param element the element to add
	 */
	public void addFirst(E element)
	{  
		Node newLink = new Node();
		newLink.data = element;
		newLink.next = first;
		first = newLink;
	}

	public E getFirst() {
		if (first == null)
			throw new NoSuchElementException();
		return first.data;
	}

	public E removeFirst() {
		if (first == null)
			throw new NoSuchElementException();
		E element = first.data;
		first = first.next;
		return element;
	}

	public void print(){
		printSub(first);
	}

	// Added code by Anna
	public int size() {
		return size(first);
	}
	private int size(Node node) {
		if (node == null) {
			return 0;
		} else {
			return 1 + size(node.next);
		}
	}

	private void printSub(Node head) {
		if (head == null) {
			return;
		}
		System.out.println(head.data);
		printSub(head.next);
	}
}
