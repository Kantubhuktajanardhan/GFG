package Linked_List;
import java.util.*;

public class Automated_LinkedList {
	
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter how many Nodes required:");
	   int n=sc.nextInt();
	   Node head=new Node();
	   Node tail=new Node();
	   Node node=head;
	   for(int i=0;i<n;i++)
	   {
		   System.out.print("Enter the node data:");
		   int input=sc.nextInt();
		   if(i==0)
		   {
			   head.data=input;
			   continue;
		   }
		   if(i==n-1)
		   {
			   tail.data=input;
			   head.next=tail;
			   break;
		   }
		   head.next=new Node(input);
		   head=(head.next);  	   
	   }
	   
	   //printing the LinkedList
	   
	   while(node != null)
	   {
		   System.out.print(node.data+"->");
		   node=node.next;
	   }
	   System.out.print("null");
	   sc.close();
   }
   
}
