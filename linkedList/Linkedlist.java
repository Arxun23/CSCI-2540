package linkedList;
/**
 * @author Luis Sanjuan-Cruz
 */

public class Linkedlist {
	private Node head;
	private int count;
	
	/*
	 * sets up node
	 */
	class Node {
		int data;
		Node next;	
	}
	
	/*
	 * sets up the beginning of the list
	 */
	public Linkedlist()
	{
		head = new Node();
		head.next= null;
		count = 0;
	}
	
	/*
	 * Displays the list
	 */
	public void display()
	{
		Node current = head.next;
		
		System.out.println("The linked list: ");
		
		while(current != null)
		{
			System.out.print(current.data + " ");
			current = current.next;
		}
		
		System.out.println(" ");
	}
	
	/**
	 * adds a digit at the end of the list
	 * @param a
	 */
	public void append(int a)
	{
		Node add = new Node();
		add.data = a;
		add.next = null;
		
		Node current = head;
		
		while(current.next != null)
		{
			current = current.next;
		}
		
		current.next = add;
		
		count++;
	}
	
	/**
	 * Adds a digit at the beginning of the list
	 * @param a
	 */
	public void prepend(int a)
	{
		Node add = new Node();
		add.data = a;
		
		
		add.next = head.next;
		head.next = add;
		
		count++;
		
		
	}
	
	/**
	 * removes a number if found
	 * @param a
	 * @return
	 */
	public boolean remove(int a)
	{
		Node current = head.next;
		Node prev = head;
		
		while(current.next != null)
		{
			if(current.data == a)
			{
				prev.next = current.next;
				
				System.out.println("Target has neutralized");
				count--;
				return true;
			}
			
			else
			{
				prev = current;
				current = current.next;
			}
			
		}
		
		return false;
	}
	
	/**
	 * says if a number is present in a list
	 * @param a
	 * @return
	 */
	public boolean contain(int a)
	{
		Node current = head;
		
		while(current != null)
		{
			if(current.data == a)
			{
				System.out.println("Number found!!");
				
				return true;
			}
			current = current.next;
		}
		
		System.out.println("Not found");
		return false;
	}
	
	/**
	 * Inserts a number after the a number in the list
	 * @param a
	 * @param list
	 * @return
	 */
	public boolean insertAfter(int a, int list)
	{
		Node current = head;
		
		while(current != null)
		{
			if(current.data == list)
			{
				Node insert = new Node();
				insert.data = a;
				
				insert.next = current.next;
				current.next = insert;
				count++;
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	/**
	 * checks if the list is empty
	 * @return
	 */
	public boolean isEmpty()
	{
		Node current = head;
		if(current != null)
		{
			System.out.println("List is empty");
			return true;
		}
		else
		{
			System.out.println("List is not empty");
			return false;
		}
		
	}
	
	/**
	 * clears the list
	 */
	public void clear()
	{
		Node current = head;
		current.next = null;
		count = 0;
		
	}
	
	/**
	 * gets the length of the list
	 */
	public void getLength()
	{
		System.out.println("The linked list has " + count + " items");
	}

	/**
	 * tests out all the functions
	 * @param args
	 */
    public static void main(String[] args) 
    {
    	Linkedlist list = new Linkedlist();
    	list.append(10);
    	list.append(20);
    	list.append(30);
    	list.prepend(60);
    	list.remove(20);
    	list.display();
    	list.contain(30);
    	list.insertAfter(40,10);
    	list.getLength();
    	list.clear();
    	list.isEmpty();
    	
    }
}
