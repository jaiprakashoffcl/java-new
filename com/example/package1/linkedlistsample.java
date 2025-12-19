package com.example.package1;

import java.util.*;

public class linkedlistsample {
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data; //store value
			this.next = null; //next initial empty
		}
	}
	Node head; //node fixed to be at head
	
//	1. insert at beginning
	void insertbeg(int data) {
		Node newNode = new Node(data); // create new node
		newNode.next = head;
		head = newNode;
	}
	
	//2. insert at end
	void insertend(int data) {
		Node newNode = new Node(data); // create new node
		// if list empty -> head = newnode
		if(head == null) {
			head = newNode;
			return;
		}
		// else traverse to last node(where next = null)
		// attach newnode at end
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	
	//3.delete a node
	
	// case 1: delete head node
	//if head contains key, head = head.next
	
	//case 2: delete middle or last
	// keep two pointers: temp -> current node, prev -> previous node
	
	//when key found: prev.next = temp.next
	
	void delete(int key) {
		Node temp = head,prev = null;
		if(temp!=null && temp.data == key) {
			head = temp.next;
			return;
		}
		while(temp!= null && temp.data!=key) {
			prev = temp;
			temp = temp.next;
		}
		if(temp == null) {
			System.out.println("element not found");
			return;
		}
		prev.next = temp.next;
	}
	
	//4.search an element
	// start from head
	// traverse node by node
	// if match found -> true
	// if traversed entire list and not found -> return false	
	
	boolean search(int key) {
		Node temp = head;
		while(temp != null) {
			if(temp.data==key) {
				return true;
			}
		}
		return false;
	}
	
	//5.length of list
	int length() {
		int count =0;
		Node temp = head;
		while(temp!=null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	//6.display the list
	void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.data+ " -> "); // -> means reference operator
			temp = temp.next;
			}
		System.out.println("null");
	}
	
	//7.reverse list
	void reverse() {
		Node prev = null,curr=head,next;
		while(curr!=null) {
			next = curr.next; //save next
			curr.next = prev; //reverse pointer
			prev = curr;   //move prev foward
			curr = next;
		}  //move curr forward
		head = prev;
	}
	
	public static void main(String[] args) {
		linkedlistsample list = new linkedlistsample();
		list.insertbeg(10);
		list.insertbeg(20);
		list.insertend(30);
		list.display();
		
		System.out.println("length "+list.length());
		list.delete(20);
		list.display();
		
		System.out.println("length "+list.search(10));
		list.reverse();
		
	}

}
