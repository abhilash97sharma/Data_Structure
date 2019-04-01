package dataStructure_codes;

public class Use_Linked_List {
  public static void main(String[]args) {
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
	  Linked_List lst1 = insert(lst,44,4);
	  print(lst1);
  }
  public static void print(Linked_List lst) {
	  Linked_List.Node ptr1 = lst.head;
	  while(ptr1!=null) {
		  System.out.println(ptr1.data);
		  ptr1 = ptr1.ptr;
	  }
  }
  public static Linked_List insert(Linked_List lst, int data, int pos) {
	  Linked_List.Node ptr1 = lst.head;
	  Linked_List.Node ptr2 = null;
	  int i =1;
	  while(i != pos-1) {
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
}
