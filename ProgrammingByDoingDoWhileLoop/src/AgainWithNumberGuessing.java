/*Redo the Number-Guessing with a Counter assignment using a do-while
 *loop instead of a while loop. Otherwise it should do exactly the same things (including the counter).

Make sure that it doesn't mess up if you guess it on the first try.*/
import java.util.Random;
import java.util.Scanner;
public class AgainWithNumberGuessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random r = new Random();
Scanner input = new Scanner(System.in);
int num,guess,tries=0;
System.out.println("I have chosen a number between 1 and 10. Try to guess it");
num = 1+r.nextInt(10);
do {
	System.out.println("Your guess");
	guess = input.nextInt();
	if(guess!=num) System.out.print("wrong. try again");
	tries++;
	
	 }while(guess!=num);
System.out.println("correct. tries: "+tries);
	
	
}

	}


