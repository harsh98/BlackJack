package game;
import game.Deck;
public class Main {
	static Deck deck = new Deck();
	static User user = new User();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deck.StartGame();
		System.out.println(user.GetHand());
	}

}
