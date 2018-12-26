/*Modify your incredibly stupid number-guessing game to actually pick a random 
 * number from 1 to 10 and have the user try to guess that. Tell them if they get
 *  it right or wrong, and if they get it wrong, show them what the random number was.
 */
import java.util.Scanner;
import java.util.Random;
public class ANumberGuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int guess,ans;
		Random r = new Random();
		ans = 1+r.nextInt(10); //mistake: lupa nak letak nombor dlm bracket
Scanner input = new Scanner(System.in);
System.out.print("Im thinking of a number from 1 to 10.\nYour guess: ");
guess = input.nextInt();
if (guess==ans) {
	System.out.print("That's right my secret was " + ans);
} else {
	System.out.print("Sorry but i really was thinking of "+ans);
}
	}

}
