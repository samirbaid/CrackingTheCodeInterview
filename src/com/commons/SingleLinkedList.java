package com.commons;

class Node<T> {
	private T data;
	private Node<T> nextNode;
	
	public Node() {
		nextNode=null;
	}
	
	public Node(T data, Node<T> nextNode) {
		this.data = data;
		this.nextNode = nextNode;
	}
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node<T> getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}
}

public class SingleLinkedList<T> {
	private Node<T> firstNode;
	
	public SingleLinkedList() {
		this.firstNode = null;
	}

	public void add(T data) {
		Node<T> node = new Node<T>();
		node.setData(data);
		node.setNextNode(null);

		if(this.firstNode==null) {
			this.firstNode = node;
		} else {
			Node<T> nodePtr = this.firstNode;
			
			while(nodePtr.getNextNode()!=null) {
				nodePtr = nodePtr.getNextNode();
			}
			nodePtr.setNextNode(node);
		}
	}
	
	public void display() {
		Node<T> node = this.firstNode;
		while(node != null) {
			System.out.print(node.getData()+"-->");
			node = node.getNextNode();
		}
	}

	public Node<T> getFirstNode() {
		return firstNode;
	}
	
	
	

}
