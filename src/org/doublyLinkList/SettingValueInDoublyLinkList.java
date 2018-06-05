package org.doublyLinkList;

public class SettingValueInDoublyLinkList {

	public static void main(String[] args) {
		
		DoublyLinkList<String> doublyLinkList = new DoublyLinkList<>();
		
		Node nodeA = new Node("Er.");
		doublyLinkList.setHead(nodeA);
		
		Node nodeB = new Node("Richa");
		nodeA.setNext(nodeB);
		
		Node nodeC = new Node("Ritesh");
		nodeB.setNext(nodeC);
		
		
		Node nodeD = new Node("Saurabh");
		nodeC.setNext(nodeD);
		
		Node nodeE = new Node("Neha");
		nodeD.setNext(nodeE);
		
		Node nodeF = new Node("Vivek");
		nodeE.setNext(nodeF);
		
		doublyLinkList.print();
	}

}
