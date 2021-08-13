package com.ds.linkedlist;

public class ListNode {
private int data;
ListNode next;

public ListNode(int data) {
	this.data=data;
	this.next=null;
}
public void setData(int data) {
	this.data = data;
}
public int getData() {
	return data;
}
public void setNext(ListNode next) {
	this.next = next;
}
public ListNode getNext() {
	return next;
}
@Override
public String toString() {
	return "ListNode [data=" + data + ", next=" + next + "]";
}

}
