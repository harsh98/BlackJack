package game;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import game.Deck;

public class Main {
	static User user = new User();
	static Dealer dealer = new Dealer();
	static Deck deck = new Deck();
	static int win = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deck.StartGame();
		dealer.PrintInitialHand();
		user.PrintInitialHand();
		user.UserTurn();
	}
}
