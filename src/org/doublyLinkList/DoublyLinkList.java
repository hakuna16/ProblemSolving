package org.doublyLinkList;

import org.doublyLinkList.Node;

public class DoublyLinkList<T> {
	
	private Node<T> head;
	
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

}
