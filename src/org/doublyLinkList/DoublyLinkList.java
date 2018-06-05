package org.doublyLinkList;

import org.doublyLinkList.Node;

public class DoublyLinkList<T> {
	
	private Node<T> head;
	private Node<T> tail;
	
	public Node<T> getTail() {
		return tail;
	}

	public void setTail(Node<T> tail) {
		this.tail = tail;
	}

	public DoublyLinkList() {
	}

	public DoublyLinkList(final Node<T> head) {
		this.head = head;
	}
	
	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> nodeA) {
		this.head = nodeA;
	}
	
	public void print(){
		System.out.println();
		Node<T> node = head;
		while (node != null) {
			System.out.print(node.getData() + "<---->");
			node = node.getNext();
		}
		System.out.print(" null");
	}
	
	public void printHeadAndTail(){
		Node<T> nodeHead = head;
		Node<T> nodeTail = tail;
		System.out.println();
		System.out.println(nodeHead.getData() + "........." + nodeTail.getData());
	}
}
