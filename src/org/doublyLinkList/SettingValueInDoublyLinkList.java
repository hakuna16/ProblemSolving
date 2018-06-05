package org.doublyLinkList;

public class SettingValueInDoublyLinkList {

	public static void main(String[] args) {
		
		DoublyLinkList<String> doublyLinkList = new DoublyLinkList<>();
		
		Node nodes[] = {new Node("Er."), new Node("Richa"), new Node("Ritesh"),  new Node("Saurabh"), new Node("Neha"), new Node("Vivek")}; 

		for(Node node : nodes) {
			doublyLinkList.insertLast(node);
		}
		
		doublyLinkList.print();
		
		Node nodes1[] = {new Node("Er."), new Node("Richa"), new Node("Ritesh"),  new Node("Saurabh"), new Node("Neha"), new Node("Vivek")};
		
		doublyLinkList = new DoublyLinkList<>();
		for(Node node : nodes1) {
			doublyLinkList.insertFirst(node);
		}
		
		doublyLinkList.print();
	}

}
