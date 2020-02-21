package com.commons;

public class MainClass {

	public static void main(String args[]) {
		SingleLinkedList<Long> list = new SingleLinkedList<Long>();
		
		list.add(10L);
		list.add(9L);
		list.add(100L);
		list.add(1000L);
		list.add(1L);
		
		list.display();
	}
}
