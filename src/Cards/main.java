package Cards;

import java.util.ArrayList;
import java.util.List;

class main  
{
	
	public static void main(String[] args)
	{
		Deck obj = new Deck("Y");
		obj.DeckGenerate();
		//obj.DeckRandomize();
		obj.PrintDeck();
		//ArrayList<Card> HelpfulDesk = new ArrayList<Card>();
		//obj.DeckRandomize(HelpfulDesk);
		//System.out.println(obj.DeckRandomize(HelpfulDesk).get(3).sign);
		//obj.ReturnFirstCard(HelpfulDesk);

	}
}