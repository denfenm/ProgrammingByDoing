/*Redo the Dice Doubles assignment (the dice program with a loop) 
 * so that it uses a do-while loop instead of a while loop. Otherwise it should behave exactly the same.

If you do this correctly, there should be less code in this version.*/

import java.util.Random;

public class ShorterDoubleDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int roll1,roll2,total;
		Random r = new Random();
		System.out.print("here comes the dice");
		do {
			roll1 = 1+r.nextInt(6);
			roll2 = 1+r.nextInt(6);
			System.out.println("Roll1: "+roll1+"\nRoll2: "+roll2+"\nThe total is "+(roll1+roll2));
			
		} while(roll1!=roll2);
	}

}
