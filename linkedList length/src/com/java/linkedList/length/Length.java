package com.java.linkedList.length;

public class Length {

	public static void display(Node head) {
		if(head== null) {
			return;
		}
		System.out.print(head.data+ " ");
		display(head.next);
	}
	
	public static int length(Node head) {
		int count= 0;
		while (head != null) {
			count++;
			head=head.next;
		} return count;
		
	}
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data= data;
		}
	

	public static void main(String[] args) {
		Node n1= new Node(10);
		Node n2= new Node(20);
		Node n3= new Node(30);
		Node n4= new Node(40);
		Node n5= new Node(50);
		Node n6= new Node(60);
		
		n1.next= n2;
		n2.next= n3;
		n3.next= n4;
		n4.next= n5;
		n5.next= n6;;
		n6.next= null;
		
		int length=  length(n1);
		
		System.out.println(length);
		
	
		
	}
	}
	}
		

	
	