import java.util.Scanner;
import java.util.Random;
public class KeepGuessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myGuess,userGuess;
		
Scanner input=new Scanner(System.in);
Random r = new Random();
myGuess = 1+r.nextInt(10);
System.out.println("I have chosen a number between 1 to 10. Guess it. Your guess: ");
userGuess = input.nextInt();
while(userGuess!=myGuess) {
	System.out.println("Incorrect. Try again.");
	userGuess = input.nextInt();
}
System.out.println("Correct");
	}

}
