package doublelist;

public class Doublelinkedlist {
	private Node head;
	private Node tail;
	private int count;
	
	class Node
	{
		int data;
		Node prev;
		Node next;
	}
	
	public Doublelinkedlist()
	{
		head = new Node();
		tail = new Node();
		
		head.prev = null;
		head.next = tail;
		
		tail.prev = null;
		tail.prev = head;
		
		count = 0;
	}
	
	public void append(int a)
	{
		Node add = new Node();
		
		add.data = a;
		
		Node previous = tail.prev;
		previous.next = add;
		add.next = tail;
		
		tail.prev = add;
		add.prev= previous;
		count++;
	}
	
	public void remove(int a)
	{
		Node curr = head.next;
		while(curr != tail)
		{
			if(curr.data == a)
			{
				curr.prev.next = curr.next;
				curr.next.prev = curr.prev;
				count--;
				
				return;
			}
			curr = curr.next;
		}
		
	}
	
	public void insetAfter(int a, int b)
	{
		Node add = new Node();
		add.data = a;
		
		Node curr = head.next;
		while(curr != tail)
		{
			if(curr.data == b)
			{
				curr.next.prev = add;
				add.next = curr.next;
				curr.next = add;
				add.prev = curr;
				
				count++;
				return;
			}
			curr = curr.next;
		}
	}
	public static void main(String[] args)
	{
		
	}
}
