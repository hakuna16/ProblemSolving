package org.linkList;

public class LinkedList<T> {

	private Node<T> head;

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

	public void delete(final Node<T> node) {
		node.setData(node.getNext().getData());
		node.setNext(node.getNext().getNext());
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
