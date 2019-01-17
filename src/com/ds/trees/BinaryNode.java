package com.ds.trees;

public class BinaryNode<T> {
	T data;
	BinaryNode left;
	BinaryNode right;
	
	public T getData() {
		return data;
	}

	public BinaryNode(T data, BinaryNode left, BinaryNode right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public void setData(T data) {
		this.data = data;
	}

	public BinaryNode getLeft() {
		return left;
	}

	public void setLeft(BinaryNode left) {
		this.left = left;
	}

	public BinaryNode getRight() {
		return right;
	}

	public void setRight(BinaryNode right) {
		this.right = right;
	}

}
