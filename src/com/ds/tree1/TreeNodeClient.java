package com.ds.tree1;

public class TreeNodeClient {
public static void main(String[] args) {
	
	TreeNode root=null;
	TreeNode first=new TreeNode(1);
	TreeNode second=new TreeNode(2);
	TreeNode third=new TreeNode(3);
	TreeNode fourth=new TreeNode(4);
	TreeNode fifth=new TreeNode(5);
	
	root=first;
	first.left=second;
	first.right=third;
	second.left=fourth;
	second.right=fifth;
	System.out.println();
	preOrder(root);
	System.out.println();
	inOrder(root);
	System.out.println();
	postOrder(root);
}

public static void preOrder(TreeNode root) {
	if(root==null) {
		return;
	}
	System.out.print(root.data+ " ");
	preOrder(root.left);
	preOrder(root.right);
}
public static void inOrder(TreeNode root) {
	if(root==null) {
		return;
	}
	inOrder(root.left);
	System.out.print(root.data+ " ");
	inOrder(root.right);
}
public static void postOrder(TreeNode root) {
	if(root==null) {
		return;
	}
	postOrder(root.left);
	postOrder(root.right);
	System.out.print(root.data+ " ");
}
}
