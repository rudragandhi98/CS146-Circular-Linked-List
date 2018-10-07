package CircularGame;
import org.junit.*;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
/**
 * This is a JUnit tester for the PrisonerList class. 
 * @author Rudra Gandhi
 * @copyright 09/24/2018
 *
 */
class PrisonerListTest 
{
	@Test
	void test() 
	{
		PrisonerList prisoners=new PrisonerList();
		assertTrue(prisoners.isEmpty()); //before inserting, list is empty
		assertEquals(0, prisoners.getSize()); // Size is 0
		prisoners.insert(5);
		assertFalse(prisoners.isEmpty()); // after inserting element, list is not empty		
		int winner = prisoners.winner(1);
		assertEquals(1,prisoners.getSize()); //size is 1
		assertEquals(3, winner);
		
		PrisonerList pl = new PrisonerList();
		assertTrue(pl.isEmpty()); //before inserting, list is empty
		assertEquals(0, pl.getSize()); // Size is 0
		pl.insert(1);
		assertFalse(pl.isEmpty()); // after inserting element, list is not empty		
		int winner2 = pl.winner(9);
		assertEquals(1,pl.getSize()); //size is 1
		assertEquals(1, winner2);
		
		PrisonerList pl2 = new PrisonerList();
		assertTrue(pl2.isEmpty()); //before inserting, list is empty
		assertEquals(0, pl2.getSize()); // Size is 0
		pl2.insert(7);
		assertFalse(pl2.isEmpty()); // after inserting element, list is not empty		
		int winner3 = pl2.winner(7);
		assertEquals(1,pl2.getSize()); //size is 1
		assertEquals(4, winner3);
		
		PrisonerList pl3 = new PrisonerList();
		assertTrue(pl3.isEmpty()); //before inserting, list is empty
		assertEquals(0, pl3.getSize()); // Size is 0
		pl3.insert(12);
		assertFalse(pl3.isEmpty()); // after inserting element, list is not empty		
		int winner4 = pl3.winner(8);
		assertEquals(1,pl3.getSize()); //size is 1
		assertEquals(2, winner4);
		
		PrisonerList pl4 = new PrisonerList();
		assertTrue(pl4.isEmpty()); //before inserting, list is empty
		assertEquals(0, pl4.getSize()); // Size is 0
		pl4.insert(5);
		assertFalse(pl4.isEmpty()); // after inserting element, list is not empty		
		int winner5 = pl4.winner(1);
		assertEquals(1,pl4.getSize()); //size is 1
		assertEquals(3, winner5);
	}
}
