package Cards;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck 
{
	public List<Card> DeckOfCards = new ArrayList<Card>();
	public List<Card> DeckGenerate ()
	{
		List<String> PackedCard = new ArrayList<String>();
		PackedCard.add("2");
		PackedCard.add("3");
		PackedCard.add("4");
		PackedCard.add("5");
		PackedCard.add("6");
		PackedCard.add("7");
		PackedCard.add("8");
		PackedCard.add("9");
		PackedCard.add("10");
		PackedCard.add("Jack");
		PackedCard.add("Queen");
		PackedCard.add("King");
		PackedCard.add("Ace");
		for (String s: PackedCard)
		{
			DeckOfCards.add(new Card(s, " Clubs"));
			DeckOfCards.add(new Card(s, " Diamonds"));
			DeckOfCards.add(new Card(s, " Hearts"));
			DeckOfCards.add(new Card(s, " Spades"));			
		}
		return DeckOfCards;
	}
	public List<Card> DeckRandomize ()
	{
		//List<Card> HelpfullDeck = new ArrayList<Card>();
		//HelpfullDeck = DeckGenerate();
		Collections.shuffle(DeckOfCards);	
		//HelpfullDeck.get(1).showSign();
		return DeckOfCards;
	}
	public void PrintDeck ()
	{
		System.out.println((DeckOfCards.get(0)).showSign());
		System.out.println((DeckOfCards.get(0)).showSuit());

	}
	//public GetFirstElement
}

