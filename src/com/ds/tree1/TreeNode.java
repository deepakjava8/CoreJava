package com.ds.tree1;

public class TreeNode {
	 int data;
	 TreeNode left;
	 TreeNode right;
	
	public TreeNode(int data) {
		this.data=data;
	}

	@Override
	public String toString() {
		return "TreeNode [data=" + data + ", left=" + left + ", right=" + right + "]";
	}
	
}
