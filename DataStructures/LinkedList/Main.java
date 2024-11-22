package Linked_List;

public class Main {
     public static void main(String args[])
     {
    	 Node head=new Node(10);
    	 Node node1=new Node(20);
    	 Node node2=new Node(30);
    	 Node node3=new Node(40);
    	 Node tail=new Node(50);
    	 
    	 head.next=node1;
    	 node1.next=node2;
    	 node2.next=node3;
    	 node3.next=tail;
    	 
    	 // printing the Linked List
    	 Node node=head;
    	 while(node.next != null)
    	 {
    		 System.out.print(node.data+"->");
    		 node=node.next;
    	 }
    	 System.out.print("null");
    	 
     }
}

class Node
{
	int data;
	Node next;
	Node()
	{
		
	}
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
