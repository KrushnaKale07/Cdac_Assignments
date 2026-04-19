package com.pgcp.ads.assignment3;

import java.util.Scanner;

class SinglyCircularList {
	static class Node {
		private int data;
		private Node next;

		Node() {
			data = 0;
			next = null;
		}

		Node(int val) {
			data = val;
			next = null;
		}

	}

	private Node head;

	public SinglyCircularList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void display() {
		System.out.println("List: ");
		if (isEmpty()) {
			return;
		}
		Node trav = head;
		do {
			System.out.println(trav.data);
			trav = trav.next;
		} while (trav != head);

	}
	public void addLast(int val) {
		Node newNode = new Node(val);

		if (isEmpty()) {
			head = newNode;
			newNode.next = head;
		} else {
			Node trav = head;
			while (trav.next != head) {
				trav = trav.next;
			}
			newNode.next = head;
			trav.next = newNode;
		}
	}
	public void addFirst(int val) {
		Node newNode = new Node(val);
		if (isEmpty()) {
			head = newNode;
			newNode.next = head;
		} else {
			Node trav = head;
			while (trav.next != head) {
				trav = trav.next;
			}
			newNode.next = head;
			trav.next = newNode;
			head = newNode;
		}
	}
}

public class SinglyCircularListMain {
	public static void main(String[] args) {
		int choice, val, pos;
		SinglyCircularList list = new SinglyCircularList();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(
					"\n0. Exit\n1. Display\n2. Add First\n3.  Add Last\n4. Add At Pos\n5. Del First\n6.  Del Last\n7. Del At Pos\n8. Del All\nEnter choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1: // Display
				list.display();
				break;
			case 2: // Add First
				System.out.print("Enter new element: ");
				val = sc.nextInt();
				list.addFirst(val);
				break;
			case 3: // Add Last
				System.out.print("Enter new element: ");
				val = sc.nextInt();
				list.addLast(val);
				break;
			case 4: // Add At Pos
//				System.out.print("Enter new element: ");
//				val = sc.nextInt();
//				System.out.print("Enter element position: ");
//				pos = sc.nextInt();
//				list.addAtPos(val, pos);
				break;
			case 5: // Del First
//				try {
//					list.delFirst();
//				} catch (Exception e) {
//					System.out.println(e.getMessage());
//				}
				break;
			case 6: // Del Last
//				try {
//					list.delLast();
//				} catch (Exception e) {
//					System.out.println(e.getMessage());
//				}
				break;
			case 7: // Del At Pos
//				System.out.print("Enter element position: ");
//				pos = sc.nextInt();
//				try {
//					list.delAtPos(pos);
//				} catch (Exception e) {
//					System.out.println(e.getMessage());
//				}
				break;
			case 8: // Del All
				// list.delAll();
				break;
			}
		} while (choice != 0);
		sc.close();
	}

}
