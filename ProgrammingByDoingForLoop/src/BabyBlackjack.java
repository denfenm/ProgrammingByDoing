/*Write a program that allows a human user to play a single hand of "blackjack" against a dealer.

Pick two values from 1-10 for the player. These are the player's "cards".
Pick two more values from 1-10 for the dealer.
Whoever has the highest total is the winner.
There is no betting, no busting, and no hitting. Save that for real blackjack.*/
import java.util.Random;

import java.util.Scanner;

public class BabyBlackjack {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		String bubu;
		
		do {
			
			int myHand1, myHand2, dHand1, dHand2, mySum, dSum;
		Random r = new Random();
		myHand1 = 1 + r.nextInt(10);
		myHand2 = 1 + r.nextInt(10);
		
		System.out.println("Your hand is "+myHand1+" "+myHand2);
		dHand1 = 1 + r.nextInt(10);
		dHand2 = 1 + r.nextInt(10);
		System.out.println("Dealer's hand is "+dHand1+" "+dHand2);
		mySum = myHand1 + myHand2;
		dSum = dHand1 + dHand2;
		
		if(mySum > dSum) 
		{
			System.out.println("your hand: "+mySum +" dealer: "+dSum+" YOU WIN, y to try again ");
			
		} else if (dSum > mySum) {
			
			System.out.println("your hand: "+mySum+" dealer: " +dSum + " YOU LOSE, y to try again");
		} else {
			
			System.out.println("Type y to try again");
		}
		
		bubu = input.next();
		
	} while (bubu.equals("y"));
		
		
	}

}
