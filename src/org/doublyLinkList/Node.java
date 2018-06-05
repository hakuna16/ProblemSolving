package org.doublyLinkList;

public class Node<T> {
	
	private Node<T> previous;
	private T data;
	private Node<T> next;
	
	public Node(final T data) {
		this(null,data,null);
	}
	
	public Node(final Node<T>  previous, final T data2, final Node<T>  next) {
		super();
		this.previous = previous;
		this.data = data2;
		this.next = next;
	}
	
	public Node<T> getPrevious() {
		return previous;
	}

	public void setPrevious(Node<T> previous) {
		this.previous = previous;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [previous=" + previous + ", data=" + data + ", next=" + next + "]";
	}
}
