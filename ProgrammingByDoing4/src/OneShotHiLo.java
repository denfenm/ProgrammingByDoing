/*Write a program that picks a random number from 1-100.
 *  Give the user a chance to guess it.
 *  If they get it right, tell them so. If their guess is 
 *  higher than the number, say "Too high." 
 * If their guess is lower than the number, say "Too low." Then quit. (They don't get any more guesses for now.)*/

import java.util.Scanner;
import java.util.Random;
public class OneShotHiLo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myNum,userNum;
		
Scanner input=new Scanner(System.in);
System.out.print("Guess number 1-100");

userNum = input.nextInt();
Random r = new Random();
myNum = 1+r.nextInt(100);

if(userNum==myNum) {
	System.out.println("You guessed it");
} else if(userNum>myNum) {
	System.out.println("Too high");
}else if(userNum<myNum) {
	System.out.println("Too low");
}

	}

}
