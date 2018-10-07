package CircularGame;

/**
 * This class is a circular linked list that creates prisoners and deletes them until only a winner is left. 
 * @author Rudra Gandhi
 * @copyright 09/24/2018
 */
public class PrisonerList 
{
	Prisoner head; //head of the linked list
	Prisoner tail; //tail of the linked list 

	/**
	 * This is the constructor of PrisonerList that sets head equal to null
	 */
	public PrisonerList()
	{
		head = null;
	}

	/**
	 * This function inserts the new prisoner at the head of the linked list
	 * @param new_prisoner This param is to create a new node
	 */
	public void insertAtHead(int new_prisoner)
	{
		Prisoner p = new Prisoner(new_prisoner);
		if(head == null && tail == null) //This checks if the list is empty
		{
			head = p;
			tail = p;
			tail.setNext(head);
		}
		else 
		{
			//Insert at head
			p.setNext(head);
			head = p;
			tail.setNext(head);
		}
	}

	/**
	 * This function inserts the number of Prisoners in the size of the list
	 * @param numberOfPrisoners This parameter is used to set the number of Prisoners
	 */
	public void insert(int numberOfPrisoners)
	{
		while (numberOfPrisoners > 0)
		{
			insertAtHead(numberOfPrisoners);
			numberOfPrisoners --;
		}
	}

	/**
	 * This function is to check whether or not the linked list is empty
	 * @return Returns true if it is empty or Returns false if it is not empty
	 */
	public boolean isEmpty()
	{
		if(head == null && tail == null)
		{
			return true;
		}
		else
		{
			return false;
		}	
	}

	/**
	 * This function gets the size of the list and returns 0 or counter for each case
	 * @return Returns 0 if the size is empty or returns counter for the tails next
	 */
	public int getSize()
	{
		Prisoner p = head;
		if(isEmpty() == true )
		{
			return 0;
		}
		else
		{
			int counter = 1;
			while(p != tail)
			{
				counter++;
				p = p.getNext();
			}
			return counter;
		}
	}

	/**
	 * This function chooses the winner, when everything is deleted but only 1 node is left
	 * @param k This is the parameter of the list on how many prisoners are alive
	 * @return Returns the winner 
	 */
	public int winner(int k)
	{
		Prisoner p = head;
		while(getSize() != 1) //When size = 1, winner is found
		{
			for(int j=1;j<k;j++)
			{
				p = p.getNext();
			}
			if(p.getNext() == tail) //Tail 
			{
				p.setNext(head);
				tail = p;
			}
			else if(p.getNext() == head) //Head
			{
				p.setNext(head.getNext());
				head = p.getNext();
			}
			else
			{
				p.setNext(p.getNext().getNext());
			}
			p = p.getNext();
		}
		return p.getData();
	}
	

	/**
	 * This is the main function of the class 
	 * @param args This is passed through a String 
	 */
	public static void main(String[] args)
	{
		PrisonerList p = new PrisonerList();
		p.insert(7);
		System.out.println(p.getSize());
		System.out.println(p.winner(7));
		System.out.println(p.getSize());
	}
}


