package org.linkList;

public class SettingValueInLinkList {

	public static void main(String[] args) {

		LinkedList<String> stringList = new LinkedList<>();

		Node<String> nodeA = new Node("Rituj");
		stringList.setHead(nodeA);

		Node<String> nodeB = new Node("Kumar");
		nodeA.setNext(nodeB);

		Node<String> nodeC = new Node("Singh");
		nodeB.setNext(nodeC);

		Node<String> nodeD = new Node("Age - 25");
		nodeC.setNext(nodeD);

		Node<String> nodeE = new Node("JHARKHAND");
		nodeD.setNext(nodeE);
		stringList.setTail(nodeE);
		System.out.print("before Inserting at beginning:...");
		stringList.print();

		Node<String> nodeK = new Node("Ankit");
		stringList.insetAtBegining(nodeK);
		System.out.println();
		System.out.print("Afters Inserting at beginning:...");
		stringList.print();

		System.out.println();
		System.out.println("Printing Head:..." + stringList.getHead().getData() + "Printing tail:..."
				+ stringList.getTail().getData());
		System.out.println();

		System.out.print("before Inserting at END:...");
		stringList.print();

		Node<String> nodeG = new Node("BASU");
		stringList.insetAtEnd(nodeG);
		System.out.println();
		System.out.print("Afters Inserting at END:...");
		stringList.print();

		System.out.println();
		System.out.println("Printing Head:..." + stringList.getHead().getData() + "Printing tail:..."
				+ stringList.getTail().getData());

		System.out.println();
		System.out.print("Inserting after given Node:..." + nodeC.getData());
		stringList.print();
		Node<String> nodeH = new Node("Shetty");
		stringList.insertAtGivenNode(nodeC, nodeH);
		stringList.print();

	}

}
