 package com.WhithoutUsingJavaMethod;

public class Linkedlist {
      
	Node head;
	public void insert(int data)
	{
	
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node nNode=head;
			while(nNode.next!=null)
			{
				nNode=nNode.next;
			}
			nNode.next=node;
		}
	}
	public void insertAtStart(int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		
		node.next=head;
		head=node;
	}
	public void insertAt(int index,int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		
		Node nNode=head;
		for(int i=0;i<index-1;i++)
		{
			nNode=nNode.next;
		}
		node.next=nNode.next;
		nNode.next=node;
	}
	
	
	
	public void delete(int index)
	{
		if(index==0)
		{
			head=head.next;
		}
		
		else
		{
			Node nNode=head;
			Node n1=null;
			for(int i=0;i<index-1;i++)
			{
				nNode=nNode.next;
			}
			n1=nNode.next;
			nNode.next=n1.next;
		}
	}
	
	
	public void show()
	{
		Node node=head;
		while(node.next!=null)
		{
			System.out.println(node.data);
			node=node.next;
		}
		 System.out.println(node.data);
	}
}
