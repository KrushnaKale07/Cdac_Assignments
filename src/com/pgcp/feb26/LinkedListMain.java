package com.pgcp.feb26;

class SinglyLinkedList{
	
	static class Node{
		private int data;
		private Node next;
		public Node() {
			this.data = 0;
			this.next = null;
		}
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	private Node head;
	public SinglyLinkedList() {
		this.head = null;
	}
	
	public void insertAtEnd(int value) {
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
		}else {
			Node traverser = head;
			while(traverser.next != null)
				traverser = traverser.next;
			traverser.next = newNode;
		}
	}
	public void display() {
		System.out.print("List: ");
		Node traverser = head;
		while(traverser != null) {
			System.out.print(traverser.data + " ");
			traverser = traverser.next;
		}
		System.out.println("");
	}
	
	public void reverse() {
		Node oldHead = head;
		head = null;
		
		while(oldHead != null) {
			Node temp = oldHead;
			oldHead = oldHead.next;
			temp.next = head;
			head = temp;
		}
	}
}

public class LinkedListMain {
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.insertAtEnd(5);
		list.insertAtEnd(6);
		list.insertAtEnd(3);
		list.insertAtEnd(8);
		list.insertAtEnd(1);
		System.out.println("Before reversing the list");
		list.display();
		System.out.println("After reversing the list");
		list.reverse();
		list.display();
	}
}
