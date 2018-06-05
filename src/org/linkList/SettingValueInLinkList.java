package org.linkList;

public class SettingValueInLinkList {

	public static void main(String[] args) {
		
		LinkedList<String> stringList = new LinkedList<>();
		
		Node nodeA = new Node("Rituj");
		stringList.setHead(nodeA);
		
		Node nodeB = new Node("Kumar");
		nodeA.setNext(nodeB);
		
		Node nodeC = new Node("Singh");
		nodeB.setNext(nodeC);
		
		Node nodeD = new Node("Age - 25");
		nodeC.setNext(nodeD);
		
		Node nodeE = new Node(1919);
		nodeD.setNext(nodeE);
		
		
		stringList.print();
		
		stringList.delete(nodeC);
		
		stringList.print();
		
	}

}
