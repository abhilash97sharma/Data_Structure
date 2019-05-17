package data_Structure;

public class Bin_Tree {
	// for deleting a node from a binary tree
	public static Tree insert(Tree head, int data1) {
		int count = 0;
		Tree newnode = new Tree();
		newnode.data = data1;
		newnode.left = null;
		newnode.right = null;
		Tree next = head;
		if (head == null)
			return null;
		while (true) {
			count++;
			if (head.left == null) {
				head.left = newnode;
				return next;
			} else if (head.right == null) {
				head.right = newnode;
				return next;
			}

			if (count % 2 == 0)
				head = head.right;
			else if (count % 2 != 0)
				head = head.left;
		}
	}

	/*
	 * public static Tree delete(Tree head, int data) { Tree node1 =
	 * correct_pos(head,data); Tree val1 = depth(head); node1.data = val1.data;
	 * val1.right = null; return head; }
	 */

	public static Tree display(Tree head) {
		Tree node1 = head;
		int count = 0;
		while (node1 != null) {
            count++;
            if(count == 1)
            	System.out.println(node1.data);
			if (node1.left != null)
				System.out.println(node1.left.data);
			if (node1.right != null)
				System.out.println(node1.right.data);
            
			if(count % 2 != 0)
				node1 = node1.left;
			else if(count % 2 == 0)
				node1 = node1.right;
		}
		return head;
	}

	public static void main(String[] args) {
		Tree head = new Tree();
		head.data = 34;
		head.left = null;
		head.right = null;
		head = Bin_Tree.insert(head, 43);
		head = Bin_Tree.insert(head, 78);
		head = Bin_Tree.insert(head, 21);
		head = Bin_Tree.insert(head, 99);
		Bin_Tree.display(head);
	}
}
