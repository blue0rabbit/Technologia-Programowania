package Cards;

public class Card 
{
	String sign;
	String suit;
	
		public Card (String sign, String suit)
		{
			this.sign = sign;
			this.suit = suit;
		}
		
		public String showSign()
		{
			return sign;
		}
		public String showSuit()
		{
			return suit;
		}
}
