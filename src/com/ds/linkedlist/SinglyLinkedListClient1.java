package com.ds.linkedlist;

public class SinglyLinkedListClient1 {
	static ListNode head;
public static void main(String[] args) {
	SinglyLinkedListClient1 client1=new SinglyLinkedListClient1();
	/*ListNode head=new ListNode(10);
	ListNode first=new ListNode(1);
	ListNode second=new ListNode(8);
	ListNode third=new ListNode(11);
	head.setNext(first);
	first.setNext(second);
	second.setNext(third);
	
	client1.display(head);
	System.out.println("Length : "+client1.getLength(head));*/
	client1.insertAtFirst(1);
	client1.insertAtFirst(2);
	client1.insertAtEnd(33);
	client1.display(head);
}
public void display(ListNode head) {
	ListNode current=head;
	while(current!=null) {
		System.out.print(current.getData()+"->");
		current=current.getNext();
	}
	System.out.println("null");
}

public int getLength(ListNode head) {
	if(head==null) {
		return 0;
	}
	int count=0;
	ListNode current=head;
	while(current!=null) {
		count++;
		current=current.getNext();
	}
	return count;
}

public void insertAtFirst(int value) {
	ListNode newNode=new ListNode(value);
	newNode.next=head;
	head=newNode;
}

public void insertAtEnd(int value) {
	ListNode newNode=new ListNode(value);
	if(head==null) {
		head=newNode;
		return;
	}
	ListNode current=head;
	while(current.next!=null) {
		current=current.next;
	}
	current.next=newNode;
}
}
