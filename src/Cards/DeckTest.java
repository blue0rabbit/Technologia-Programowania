package Cards;

import junit.framework.ComparisonFailure;
import junit.framework.TestCase;

public class DeckTest extends TestCase
{
	Deck eck = new Deck("Y");
	
	public void testDeckIfItsNotEmpty() throws Exception
	{
		Deck deck = new Deck("Y");
		assertNotNull("I m empty", deck);
	}
	
	public void testDeckGenerate() throws Exception
	{
		assertEquals("Fail, they aren't equal!", eck.DeckGenerate(), eck.DeckGenerate());
	}
	
	static public void fail()
	{
			Deck meck = new Deck("Y");
			System.out.println(meck.DeckGenerate().get(222).showSign());
			fail("Nie dam rady juz dzialac dluzej na tym swiecie :(");
	}
	
	public void testIfDeckSizeIsntTooBig() throws Exception
	{
		assertTrue("Too big list!", eck.DeckGenerate().size() < 55);
	}

	
	public void testIfJokerIsGenerated() throws Exception
	{
		Deck deck1 = new Deck("Y");
		Deck deck2 = new Deck("N");
		assertNotSame("Are not Equal", deck1, deck2);
	}
}

