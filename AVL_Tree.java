package data_Structure;

import java.util.ArrayList;
import java.util.List;

class Tree {
	int data;
	Tree left;
	Tree right;
}

public class AVL_Tree {
	public static int count = 0;
	public static List<Integer> l1 = new ArrayList<Integer>();
	// finding the correct position for the insert in binary tree
	public static Tree correct_pos(Tree head, int data) {
		if(head==null)
			return null;
		int data1 = head.data;
		Tree next = head;
		if (data < data1 && next != null) {
			Tree add = correct_pos(head.left, data);
			if(add == null)
				add = next;
			return add;
		} else if (data > data1 && next != null) {
			Tree add1 = correct_pos(head.right, data);
			if(add1 == null)
				add1=next;
			return add1;
		}
		else
		    return next;
	}

	// insert in the tree 
	public static Tree insert(Tree head, int data) {

		Tree newnode = new Tree();
		newnode.data = data;
		newnode.left = null;
		newnode.right = null;
        
		Tree pos = correct_pos(head,data);
		int data1 = pos.data;
		
		if (data < data1) {
		    pos.left = newnode;
		} else if (data > data1) {
			pos.right = newnode;
		}  
		
		return head;
	}
	
	//function for returning a right most element of the binary tree
	public static Tree depth(Tree head) {
		Tree next = head;
		Tree prev = null;
		while(next.right!=null) {
			prev = next;
			next = next.right;
		}
		return prev;
	}
	
	//for arranging the nodes
/*	public static List<Integer> arrange(Tree head,int data1){
		Tree pos = Bin_Tree.correct_pos(head, data1);
		int data = pos.data;
		if(data1 < data) {
		      arrange(pos.left,data);
		}
		else if(data1 > data) {
			  arrange(pos.right,data);
		}
	}*/
	
	// for displaying the values of a tree
	public static Tree display(Tree h1) {
		if (h1 != null) {
			count++;
			System.out.println(h1.data + "," + count);
			display(h1.left);
			count--;
			display(h1.right);
		}
		return null;
	}

	public static void main(String[] args) {
		Tree head = new Tree();
		head.data = 23;
		head.left = null;
		head.right = null;
		head = AVL_Tree.insert(head, 56);
		head = AVL_Tree.insert(head, 20);
		head = AVL_Tree.insert(head, 18);
		head = AVL_Tree.insert(head, 21);
		head = AVL_Tree.insert(head, 50);
		head = AVL_Tree.insert(head, 19);
		display(head);
//		System.out.println("Displaying elements after deleting a node");
//		head = Bin_Tree.delete(head, 20);
//		display(head);
		Tree t1 = depth(head);
		System.out.println(t1.data);
	}
}
