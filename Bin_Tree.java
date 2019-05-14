package data_Structure;

class Tree {
	int data;
	Tree left;
	Tree right;
}

public class Bin_Tree {
	public static int count = 0;

	public static Tree correct_pos(Tree head, int data) {
		if(head==null)
			return null;
		int data1 = head.data;
		Tree next = head;
		if (data < data1 && next != null) {
			correct_pos(head.left, data);
	//		next = next.left;
		} else if (data > data1 && next != null) {
			correct_pos(head.right, data);
	//		next = next.right;
		}
		return next;
	}

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

	public static Tree display(Tree h1) {
		if (h1 != null) {
			count++;
			System.out.println(h1.data + "," + count);
			display(h1.left);
			display(h1.right);
		}
		return null;
	}

	public static void main(String[] args) {
		Tree head = new Tree();
		head.data = 23;
		head.left = null;
		head.right = null;
		Tree out = Bin_Tree.insert(head, 56);
		Tree out1 = Bin_Tree.insert(out, 20);
		Tree out2 = Bin_Tree.insert(out1, 21);
		Tree out3 = Bin_Tree.insert(head, 50);
		display(head);
	}
}
