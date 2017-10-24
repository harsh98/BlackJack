package game;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Deck {
	private ArrayList<String> Suits = new ArrayList<String>();
	private ArrayList<String> Values = new ArrayList<String>();
	private ArrayList<String> Deck = new ArrayList<String>();
	
	public void SetSuits()
	{
		Suits.addAll(Arrays.asList("♥","♠","♦","♣"));
	}
	public void SetValues()
	{
		Values.addAll(Arrays.asList("A","2","3","4","5","6","7","8","9","10","J","Q","K"));
	}
	public void SetDeck()
	{
		SetSuits();
		SetValues();
		Deck.clear();
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 13; j++) {
				Deck.add(Values.get(j) + Suits.get(i));
			}
			
		}
	}
	public void ShuffleDeck()
	{
		SetDeck();
		Collections.shuffle(Deck);
	}
	public void StartGame() {
		ShuffleDeck();
	}
	public String GetCard()
	{
		String Card = "";
		Card = Deck.get(0);
		Deck.remove(0);
		return Card;
	}
}
