package org.doublyLinkList;

public class SettingValueInDoublyLinkList {

	public static void main(String[] args) {
		
		DoublyLinkList<String> doublyLinkList = new DoublyLinkList<>();
		
		Node<String> nodeA = new Node<>("Er.");
		Node<String> nodeB = new Node<>("Richa");
		Node<String> nodeC = new Node<>("Ritesh");
		Node<String> nodeD = new Node<>("Saurabh");
		Node<String> nodeE = new Node<>("Neha");
		Node<String> nodeF = new Node<>("Vivek");
		Node<String> nodeH = new Node<>("Singh");
		
		doublyLinkList.insertLast(nodeA);
		doublyLinkList.insertLast(nodeB);
		doublyLinkList.insertLast(nodeC);
		doublyLinkList.insertLast(nodeD);
		doublyLinkList.insertLast(nodeE);
		doublyLinkList.insertLast(nodeH);
		
		doublyLinkList.print();
		
		doublyLinkList.insertAtGivenNode(nodeC, nodeF);
		doublyLinkList.print();
		
		System.out.println(doublyLinkList.getHead().getData());
		System.out.println(doublyLinkList.getTail().getData());
		
		doublyLinkList.deleteFromBegining();
		doublyLinkList.print();
		
		System.out.println(doublyLinkList.getHead().getData());
		System.out.println(doublyLinkList.getTail().getData());
		
		doublyLinkList.deleteFromEnd();
		doublyLinkList.print();
		
		System.out.println(doublyLinkList.getHead().getData());
		System.out.println(doublyLinkList.getTail().getData());
		doublyLinkList.print();
		
		doublyLinkList.deleteFromGivenNode(nodeC);
		doublyLinkList.print();
		
		System.out.println(doublyLinkList.getHead().getData());
		System.out.println(doublyLinkList.getTail().getData());
		
		System.out.println(Integer.MIN_VALUE);
	}

}
