package org.linkList;

public class LinkedList<T> {

	private Node<T> head;
	private Node<T> tail;

	public Node<T> getTail() {
		return tail;
	}

	public void setTail(Node<T> tail) {
		this.tail = tail;
	}

	public LinkedList() {
	}

	public LinkedList(final Node<T> head) {
		this.head = head;
	}

	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}

	public void insetAtBegining(final Node<T> node) {
		if (head == null) {
			head = node;
			tail = node;
			return;
		}
		node.setNext(head);
		head = node;
	}

	public void insetAtEnd(final Node<T> node) {
		if (head == null) {
			head = node;
			tail = node;
			return;
		}
		tail.setNext(node);
		tail = node;
		node.setNext(null);
	}

	public void insertAtGivenNode(final Node<T> giveNode, final Node<T> node) {
		if (head == null) {
			head = node;
			tail = node;
			return;
		}
		node.setNext(giveNode.getNext());
		giveNode.setNext(node);
	}

	public void deleteNode(final Node<T> node) {
		Node<T> oldNext = node.getNext();
		node.setData(oldNext.getData());
		node.setNext(oldNext.getNext());
		System.out.println();
		System.out.println("Deleting Node : ... " + oldNext);
		oldNext.setNext(null);
	}

	public void print() {
		System.out.println();
		Node<T> node = head;
		while (node != null) {
			System.out.print(node.getData() + "->");
			node = node.getNext();
		}
		System.out.print(" null");
	}
}
