package org.doublyLinkList;

import org.doublyLinkList.Node;

public class DoublyLinkList<T> {

	private Node<T> head;
	private Node<T> tail;

	public Node<T> getTail() {
		return tail;
	}

	public DoublyLinkList() {
	}

	public DoublyLinkList(final Node<T> head) {
		this.head = head;
	}

	public Node<T> getHead() {
		return head;
	}

	public void insertFirst(final Node<T> node) {
		if (head == null) {
			head = node;
			tail = node;
			return;
		}
		head.setPrevious(node);
		node.setNext(head);
		head = node;
	}

	public void insertLast(final Node<T> node) {
		if (head == null) {
			head = node;
			tail = node;
			return;
		}
		tail.setNext(node);
		node.setPrevious(tail);
		tail = node;
	}

	public void insertAtGivenNode(final Node<T> givenNode, final Node<T> node) {
		if (head == null) {
			head = node;
			tail = node;
			return;
		}
		node.setNext(givenNode.getNext());
		givenNode.setNext(node);
		node.setPrevious(node);
	}

	public void deleteFromBegining() {
		if(head == tail){
			System.out.println("Single Element in LinkList : Deleting...");
			head=tail=null;
			return;
		}
		head = head.getNext();
		
	}

	public void deleteFromEnd() {
		if(head == tail){
			System.out.println("Single Element in LinkList : Deleting...");
			head=tail=null;
			return;
		}
		tail = tail.getPrevious();
		tail.setNext(null);
	}

	public void deleteFromGivenNode(final Node<T> givenNode) {
		if(head == tail){
			System.out.println("Single Element in LinkList : Deleting...");
			head=tail=null;
			return;
		}
		givenNode.getPrevious().setNext(givenNode.getNext().getNext());
	}

	public void print() {
		System.out.println();
		Node<T> node = head;
		while (node != null) {
			System.out.print(node.getData() + "<---->");
			node = node.getNext();
		}
		System.out.println(" null");
	}
}
