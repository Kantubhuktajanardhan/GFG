import java.lang.*;
import java.util.*;
class Main
    {
        public static void main(String args[])
        {
            // 10 20 30 40 50 60
            Node head=new Node(10);
            head.next=new Node(20);
            head.next.next=new Node(30);
            head.next.next.next=new Node(40);
            head.next.next.next.next=new Node(50);
            head.next.next.next.next.next=new Node(60);
            //
            int count=0;
            Node node=head;
            Node point=head;
            while(node != null)
                {
                    System.out.print(node.data+" ");
                    node=node.next;
                    count++;
                } 
            System.out.println();
            // length of the LL
            System.out.println("The length of the LinkedList : "+count);
            // adding the node at middle of the linkedlist
            int middle=count/2;
            Node present=head;
            int current=1;
            while(current != middle)
                {
                    present=present.next;
                    current++;
                }
        Node newNode = new Node(100);
        newNode.next = present.next; // Link newNode to the next of middle node
        present.next = newNode; // Link current node to newNode
            while(point != null)
                {
                    System.out.print(point.data+" ");
                    point=point.next;
                } 
                    
                         
        }
    }
class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
