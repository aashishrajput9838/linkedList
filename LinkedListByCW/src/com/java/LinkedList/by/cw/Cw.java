package com.java.LinkedList.by.cw;

public class Cw {
	public static void display(Node head) {
		Node rVOH= head;
		/*
		 * for(int i=1; i<=5; i++) { System.out.print(rVOT.data+ " "); rVOT= rVOT.next;
		 * }
		 */
		
		/*
		 * while (rVOH!= null) { System.out.print(rVOH.data+ " "); rVOH= rVOH.next; }
		 */
		if(head== null) {
			return;
		}
		System.out.print(head.data+ " ");
		display(head.next);
	}
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data= data;
		}
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
		
		display(n1);
		
		
		
		

	}

}
