package Cards;

import org.junit.After;
import org.junit.Before;
import org.junit.*;

public class DeckTestJunit4 
{
	Deck deck;
	
	@Before
	
	public void runOnceBeforeEverything()
	{
		deck = new Deck("Y");
		deck = new Deck("N");
	}
	
	@Test(timeout=1000)
	public void TimeoutTest() throws Exception
	{
		Deck deck2 = new Deck("N");
		deck.DeckGenerate();
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void ExceptionChecking()
	{
		System.out.println(deck.DeckRandomize().get(122).showSign());
	}
	
	@Ignore
	
	public void IgnoreTest()
	{
		System.out.println("Staph igoring me!");
	}
	
	
}
