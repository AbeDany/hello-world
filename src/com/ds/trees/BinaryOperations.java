package com.ds.trees;

public class BinaryOperations {
	public static BinaryNode createBinaryTree(){
		BinaryNode nodeA= new BinaryNode('a', null, null);
		BinaryNode nodeB= new BinaryNode('b', null, null);
		BinaryNode nodeC= new BinaryNode('c', null, null);
		BinaryNode nodeD= new BinaryNode('d', null, null);
		BinaryNode nodeE= new BinaryNode('e', null, null);
		BinaryNode nodeF= new BinaryNode('f', null, null);
		BinaryNode nodeG= new BinaryNode('g', null, null);
		BinaryNode nodeH= new BinaryNode('h', null, null);
		BinaryNode nodeI= new BinaryNode('i', null, null);
		BinaryNode nodeJ= new BinaryNode('j', null, null);
		BinaryNode nodeK= new BinaryNode('k', null, null);
		nodeA.setLeft(nodeB);
		nodeA.setRight(nodeC);
		nodeB.setLeft(nodeD);
		nodeB.setRight(nodeE);
		nodeC.setLeft(nodeF);
		nodeC.setRight(nodeG);
		nodeD.setLeft(nodeH);
		nodeD.setRight(nodeI);
		nodeF.setLeft(nodeJ);
		nodeG.setRight(nodeK);
		
		//root=nodeA;
		return nodeA;
	}
	
	public static void preOrderTraversalR(BinaryNode root){
		
		if(root != null){
			System.out.println(root.getData());
			preOrderTraversalR(root.getLeft());
			preOrderTraversalR(root.getRight());
		}
	}
	
	
	public static void main(String[] args) {
	 BinaryNode root=null;
	 root = createBinaryTree();
	 preOrderTraversalR(root);
	}
}
