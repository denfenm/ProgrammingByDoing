/*Nim is a strategy game between two players.

Start by placing counters (coins or toothpicks or something) into 3 piles.
Player #1 picks a pile, then removes one or more counters from that pile. (It's okay to take the whole pile.)
Player #2 picks a pile, then removes one or more counters from that pile.
Player #1 plays again. (It's okay to choose a different pile this time.)
Whichever player is forced to take the last counter is the LOSER.
Write a program that allows two human players to play Nim against each other. The program should detect when the last counter has been taken and declare a winner.

At first, don't worry about detecting cheating. That is one of the bonus options.*/

import java.util.*;

public class Nim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3,b=4,c=5,remove=0,turn=0;
		String player1="",player2="",choose="";
		
Scanner input = new Scanner(System.in);
System.out.println("Player 1, enter your name: ");
player1 = input.nextLine();
System.out.println("Player 2, enter your name: ");
player2 = input.nextLine();

//System.out.println("A: 3\tB: 4\tC:5");

while(a>0||b>0||c>0) {
	System.out.print("\nA: "+a+"\tB: "+b+"\tC: "+c+"\n"+player1+", choose a pile: ");
	choose = input.next();
	//while ((choose.equals("A") && a <=0)||(choose.equals("B") && b <=0)||(choose.equals("C") && c <=0))
	if (choose.equalsIgnoreCase("a")) {
		if(a!=0) {System.out.print("\nA: "+a+"\tB: "+b+"\tC: "+c+"\nHow many to remove from pile A: ");
		remove = input.nextInt();
		turn++;
		} else if(a<=0) {
			System.out.println("You cant cheat "+player1);
			turn--;
			choose = input.next();
		}
		a-=remove;
		
	}else if(choose.equalsIgnoreCase("b")) {
		if (b!=0) {System.out.print("\nA: "+a+"\tB: "+b+"\tC: "+c+"\nHow many to remove from pile B: ");
		remove = input.nextInt();
		turn++;
		} else if(b<=0) {
			System.out.println("You cant cheat "+player1);
			turn--;
			choose = input.next();
		}
		b= b-remove;
		
	}else if(choose.equalsIgnoreCase("c")) {
		if(c!=0) {System.out.print("\nA: "+a+"\tB: "+b+"\tC: "+c+"\nHow many to remove from pile C: ");
		remove = input.nextInt();
		turn++;
		}
	}else if (c<=0) {
		System.out.println("You cant cheat "+player1);
		turn--;
		choose = input.next();}
	c= c-remove;
	System.out.println("\nA: "+a+"\tB: "+b+"\tC: "+c+"\n"+player2+", choose a pile: ");
	choose = input.next();
	
	if (choose.equalsIgnoreCase("a")) {
		if(a!=0) {System.out.print("\nA: "+a+"\tB: "+b+"\tC: "+c+"\nHow many to remove from pile A: ");
		remove = input.nextInt(); 
		turn++;
		} else if(a<=0) {
			System.out.println("You cant cheat "+player2);
			turn--;
			choose = input.next();
		}
		a-=remove; //need to initialise
	}else if(choose.equalsIgnoreCase("b")) {
		if (b!=0) {System.out.print("\nA: "+a+"\tB: "+b+"\tC: "+c+"\nHow many to remove from pile B: ");
		remove = input.nextInt();
		turn++;
	} else if(b<=0) {
		System.out.println("You cant cheat "+player2);
		turn--;
		choose = input.next();
	}
		b= b-remove;
	}else if(choose.equalsIgnoreCase("c")) {
		if(c!=0) {System.out.print("\nA: "+a+"\tB: "+b+"\tC: "+c+"\nHow many to remove from pile C: ");
		remove = input.nextInt();
		turn++;
		}else if (c<=0) {
		System.out.println("You cant cheat "+player2);
		turn--;
		choose = input.next();}
		c=c-remove;
		
	}}
if (turn%2==0) 
System.out.println(player2+"Wins");
else System.out.println(player1+"Wins");
	
	
}
	}


