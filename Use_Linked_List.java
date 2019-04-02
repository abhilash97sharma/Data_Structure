package data_Structure;

public class Use_Linked_List {
	public static void main(String[] args) {
		Linked_List lst = new Linked_List();
		Linked_List.Node nd1 = new Linked_List().new Node();
		lst.head = nd1;
		nd1.data = 23;
		Linked_List.Node nd2 = new Linked_List().new Node();
		nd1.ptr = nd2;
		nd2.data = 30;
		Linked_List.Node nd3 = new Linked_List().new Node();
		nd2.ptr = nd3;
		nd3.data = 50;
		nd3.ptr = null;
		print(lst);
		System.out.println("After inserting an element in the linked list");
		Linked_List lst1 = insert(lst, 44, 2);
		print(lst1);
		System.out.println("Linked_List after deleting the element");
		Linked_List lst3 = delete(lst1,3);
		print(lst3);
		System.out.println("Reversing the linked list");
		Linked_List lst4 = reverse(lst3);
		print(lst4);
	}

	public static void print(Linked_List lst) {
		Linked_List.Node ptr1 = lst.head;
		while (ptr1 != null) {
			System.out.println(ptr1.data);
			ptr1 = ptr1.ptr;
		}
	}

	public static Linked_List insert(Linked_List lst, int data, int pos) {
		Linked_List.Node ptr1 = lst.head;
		Linked_List.Node ptr2 = null;
		int i = 1;
		while (i != pos - 1) {
			i++;
			ptr1 = ptr1.ptr;
		}
		ptr2 = ptr1.ptr;
		Linked_List.Node ptr3 = new Linked_List().new Node();
		ptr3.data = data;
		ptr3.ptr = ptr2;
		ptr1.ptr = ptr3;
		return lst;
	}
	
	public static Linked_List delete(Linked_List lst, int pos) {
		try {
		Linked_List.Node ptr1 = lst.head;
		Linked_List.Node ptr2 = null;
		Linked_List.Node ptr3 = ptr1;
		int i = 1;
		while(i != pos) {
			i++;
			ptr3 = ptr1;
			ptr1 = ptr1.ptr;
		}
		if(i == 1) {
		  lst.head = ptr1.ptr;	
		}
		else {
		ptr2 = ptr1.ptr;
		ptr3.ptr = ptr2;
		ptr1.ptr = null;
		}
		}catch(NullPointerException p1) {
			System.out.println("Element does not exist at this position");
		}
		return lst;
	}
	
	public static Linked_List reverse(Linked_List lst) {
	    Linked_List.Node ptr1 = lst.head;
	    Linked_List.Node ptr2 = null;
	    while(ptr1 != null) {
	        ptr2 = ptr1;
	    	ptr1 = ptr1.ptr;
	    	ptr1.ptr = ptr2;
	    }
	    lst.head = ptr2;
	    return lst;
	}
}
