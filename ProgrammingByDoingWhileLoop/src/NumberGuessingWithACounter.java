import java.util.Scanner;
import java.util.Random;
public class NumberGuessingWithACounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myGuess=0, userGuess=0,tries=0;
Scanner input = new Scanner(System.in);
Random r = new Random();
myGuess = 1+r.nextInt(10);
while(myGuess>0&&userGuess!=myGuess) {
System.out.println("Guess number 1-10");
userGuess = input.nextInt();
if(userGuess>10) 
	 System.out.print("invalid");
 while(userGuess!=myGuess) {
	 tries++;
	 System.out.println("Try again");
	 userGuess = input.nextInt();
	 if(userGuess>10) 
		 System.out.print("invalid");
 }}
 if(userGuess==myGuess) 
 
 tries++;
 System.out.println("Correct. took u tries:"+tries);
	
	}}

