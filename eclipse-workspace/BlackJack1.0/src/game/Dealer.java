package game;

import java.util.ArrayList;

public class Dealer {

	static ArrayList<String> dealerhand = new ArrayList<String>();
	Deck deck = new Deck();
	static User user = new User();
	public ArrayList<String> GetHand()
	{
		dealerhand.clear();
		dealerhand.add(deck.GetCard());
		dealerhand.add(deck.GetCard());
		return(dealerhand);
	}
	public void PrintInitialHand()
	{
		System.out.println("|" + GetHand().get(0) + "|" + "|  |");
	}
	public String GetFirstCard()
	{
		String Card;
		Card = GetHand().get(0);
		return Card;
	}
	public void DealersTurn()
	{
		System.out.println("Dealer's turn:");
		PrintHand();
		while (GetValue() < 17)
		{
			PrintCard();
		}
		if (GetValue() >= 17)
		{
			if (user.GetValue() > GetValue() && user.GetValue() <= 21 &&  GetValue() <= 21)
			{
				System.out.println("You Won!");
			}
			if (GetValue() > user.GetValue() && user.GetValue() <= 21 && GetValue() <= 21)
			{
				System.out.println("You Lose!");
			}
			if (GetValue() == user.GetValue())
			{
				System.out.println("You Pushed");
			}
			if (GetValue() > 21)
			{
				System.out.println("You Win");
			}
			if (user.GetValue() > 21)
			{
				System.out.println("You Lose!");
			}
		}
	}
	public int CheckResult()
	{
		int result = 0;
		if (GetValue() > 21)
		{
			System.out.println("You Win");
			result = 1;
		}
		else
		{
			if (GetValue() >= 17)
			{
				if (GetValue() < user.GetValue())
				{
					System.out.println("You Win");
					result = 1;
				}
				if (GetValue() > user.GetValue())
				{
					System.out.println("You Lose");
					result = 2;
				}
				if (GetValue() == user.GetValue())
				{
					System.out.println("Push");
					result = 3;
				}
			}
		}
		return(result);
	}
	public int GetValue()
	{
		int value = 0;
		int aces = 0;
		for (int i = 0; i < dealerhand.size(); i++)
		{
			if (dealerhand.get(i).contains("J") || dealerhand.get(i).contains("Q") || dealerhand.get(i).contains("K"))
			{
				value += 10;
			}
			else
			{
				if (dealerhand.get(i).contains("A"))
				{
					aces++;
					value += 11;
				}
				else
				{
				value += Integer.parseInt(dealerhand.get(i).substring(0,dealerhand.get(i).length()-1));
				}
			}
			while (aces > 0 && value > 21)
			{
				value -= 10;
				aces -= 1;
			}
		}
		return(value);
	}
	public void PrintCard()
	{
		dealerhand.add(deck.GetCard());
		for (int i = 0; i < dealerhand.size(); i++)
		{
			System.out.print("|" + dealerhand.get(i) + "|");
		}
		System.out.print(" = " + GetValue());
		System.out.print("\n");
	}
	public void PrintHand()
	{
		for (int i = 0; i < dealerhand.size(); i++)
		{
			System.out.print("|" + dealerhand.get(i) + "|");
		}
		System.out.print(" = " + GetValue());
		System.out.print("\n");
	}
}
