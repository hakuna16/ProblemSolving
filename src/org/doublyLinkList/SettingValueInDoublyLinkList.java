package org.doublyLinkList;

public class SettingValueInDoublyLinkList {

	public static void main(String[] args) {
		
		DoublyLinkList<String> doublyLinkList = new DoublyLinkList<>();
		
		Node nodeA = new Node("Er.");
		Node nodeB = new Node("Richa");
		Node nodeC = new Node("Ritesh");
		Node nodeD = new Node("Saurabh");
		Node nodeE = new Node("Neha");
		Node nodeF = new Node("Vivek");
		
		doublyLinkList.insertLast(nodeA);
		doublyLinkList.insertLast(nodeB);
		doublyLinkList.insertLast(nodeC);
		doublyLinkList.insertLast(nodeD);
		
		doublyLinkList.insertAtGivenNode(nodeC, nodeF);
		
		doublyLinkList.print();
		
		System.out.println(doublyLinkList.getHead().getData());
		System.out.println(doublyLinkList.getTail().getData());
		
	}

}
