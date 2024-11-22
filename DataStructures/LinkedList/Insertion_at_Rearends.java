package Linked_List;

public class Insertfirst {
	
	public static void main(String args[])
	{
   Node head=new Node(10);
   Node n1=new Node(20);
   Node n2=new Node(30);
   Node n3=new Node(40);
   Node tail=new Node(50);
   
   // Linking the nodes
   head.next=n1;
   n1.next=n2;
   n2.next=n3;
   n3.next=tail;
   
   // inserting the node at the beginning
   Node newNode=new Node(5);
   newNode.next=head;
   
   // inserting the node at the end
   Node newNode1=new Node(100);
   tail.next=newNode1;
   
// printing the Linked List
	 Node node=newNode;
	 while(node != null)  // important point
	 {
		 System.out.print(node.data+"->");
		 node=node.next;
	 }
	 System.out.println("null");
   
   System.out.print("File executing");
   }
   
}

