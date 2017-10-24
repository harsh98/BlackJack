package game;
import java.util.ArrayList;
public class User {
	ArrayList<String> userhand = new ArrayList<String>();
	Deck deck = new Deck();
	public ArrayList<String> GetHand()
	{
		userhand.clear();
		userhand.add(deck.GetCard());
		userhand.add(deck.GetCard());
		return(userhand);
	}

}
