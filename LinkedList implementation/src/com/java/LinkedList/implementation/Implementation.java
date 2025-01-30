package com.java.LinkedList.implementation;

public class Implementation {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;
        int size= 0;

        void insertAtEnd(int element) {
            Node temp = new Node(element);
            if (head == null) {
                head = temp;
                tail = temp; // Initialize tail when the list is empty
            } else {
                tail.next = temp;
                tail = temp; // Move tail to the new last node
            }
        }

        void insertAtBeg(int element) {
            Node temp = new Node(element);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void insertAtIndex(int index, int element) {
            if (index < 0 || index > size()) {
                System.out.println("WRONG INDEX");
                return;
            }
            if (index == size()) {
                insertAtEnd(element);
                return;
            }
            if (index == 0) {
                insertAtBeg(element);
                return;
            }

            Node t = new Node(element);
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }

        int getAtIndex(int index) {
            if (index < 0 || index >= size()) {
                System.out.println("Index out of bounds");
                return -1; // Return an invalid value or throw an exception
            }
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        void display() {
            Node temp = head; // Use a temporary variable to traverse
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next; // Move to the next node
            }
            System.out.println(); // Print a new line after displaying the list
        }

        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtBeg(5);
        ll.insertAtIndex(1, 7);
        System.out.println(ll.getAtIndex(1)); // Output: 7
        ll.display(); // Output: 5 7 10 20
        System.out.println("SIZE: " + ll.size()); // Output: SIZE: 4
    }
}