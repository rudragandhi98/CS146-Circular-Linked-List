package CircularGame; 
import javax.xml.soap.Node;

/**
 * This is the Prisoner class that holds the getter methods that are carried out in the PrisonerList class. 
 * @author Rudra Gandhi
 *
 */
public class Prisoner 
{
	private int data; //The place of the prisoner 
	private Prisoner next = null;
	
	/**
	 * This is the constructor for Prisoner
	 * @param data An integer that is initialized and gives a parameter for the data 
	 */
	public Prisoner (int data)
	{
		this.data = data;
	}
	
	/**
	 * This function sets the node to the next one according to the head and tail
	 * @param p This holds p as a prisoner that passes through the function
	 */
	public void setNext(Prisoner p)
	{
		this.next = p;
	}
	
	/**
	 * This is a getter method for data
	 * @return Returns the data 
	 */
	public int getData()
	{
		return data; 
	}
	
	/**
	 * This is a getter method for next
	 * @return Returns the next prisoner
	 */
	public Prisoner getNext()
	{
		return next;
	}
	
}
