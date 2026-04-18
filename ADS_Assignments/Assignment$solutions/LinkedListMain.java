package com.pgcp.ads.assignment3;

import java.util.Scanner;

class SingleLinkedList {

	static class Node {
		private int data;
		private Node next;

		Node() {
			data = 0;
			next = null;
		}

		Node(int val) {
			data = val;
		}
	}

	private Node head;

	SingleLinkedList() {
		head = null;
	}

	public void display() {
		System.out.println("List ");
		Node trav = head;
		while (trav != null) {
			System.out.println(trav.data);
			trav = trav.next;
		}
		//System.out.println("end");
	}

	void addEnd(int val) {

		// create new node
		Node newNode = new Node(val);

		// special case one
		if (head == null) {
			head = newNode;
		}
		// genral : add the node at the end
		else {
			// traverse till last node
			Node trav = head;
			while (trav.next != null) {
				trav = trav.next;
			}
			// add ne node after the trav
			trav.next = newNode;
		}
	}
}

public class LinkedListMain {
	static int choice;

	public static void main(String[] args) {

		SingleLinkedList list = new SingleLinkedList();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of linked list.");
		int limit = scanner.nextInt();

		System.out.println("Enter values .");
		for (int i = 0; i < limit; i++) {
			list.addEnd(scanner.nextInt());
		}

		list.display();

		/*
		 * do { System.out.println(
		 * "\n\n0. Exit\n1. Display\n2. Add Beginning\n3. Add end\n4. Add at position\n5. Delete First\n6. Delete Last\n7. Delete by Value\n8. Search by value\n9. Count of nodes \n10. Reverse a LinkedList"
		 * );
		 * 
		 * System.out.println("Enter a choice."); scanner.nextInt();
		 * 
		 * 
		 * switch (choice) { case 1: // Dispay list.display(); break; case 2: // Add
		 * Beginning // list.addEnd(new Node(20)); break; case 3: // Add end break; case
		 * 4:// Add at position break; case 5: // Delete First break; case 6: // Delete
		 * Last break; case 7: // Delete by Value break; case 8: // Search by value
		 * break; case 9: // Count of nodes break; case 10: // Reverse a LinkedList
		 * break; default: throw new IllegalArgumentException("Unexpected value: " +
		 * choice); }
		 * 
		 * } while (choice > 0);
		 */
	}

}
