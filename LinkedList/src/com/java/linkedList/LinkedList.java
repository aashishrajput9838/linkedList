package com.java.linkedList;

class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data= data;
		this.next= null;
		
	}
}

public class LinkedList {

	public static void main(String[] args) {
		LinkedList list= new LinkedList();
		
		list.insertAtEnd(10);
		list.insertAtEnd(10);
		list.insertAtEnd(10);
		
		System.out.println("LINKED LIST");
		list.display();
		
		System.out.println("DELETING AN ELEMENT FROM THE BEGENING");
		list.display();

	}

	public void display() {
		Object head;
		if(head== null) {
			System.out.println("THE LINKED LIST IS EMPTY");
			return;
		}
		Node temp= head;
		while(temp!= null) {
			System.out.println(temp.data + "->");
			temp= temp.next;
		}
		System.out.println("null");
	}
	public void insertAtEnd(int data) {
		Node newNode= new Node(data);
		Object head = null;
		if(head== null) {
			head= newNode;
			return;
		}
		
		Node temp= (Node)head;
		while(temp.next != null) {
			temp= temp.next;
		}
		temp= temp.next;
	}
	

}
