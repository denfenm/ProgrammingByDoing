/*Using if statements with compound conditions (like &&), 
 * make a guessing game of two questions similar to the Twenty Questions assignment.

However, this time you must accomplish it using if statements with 
compound conditions and you must not use else if or else or nested ifs.

Question 1: Does it belong inside or outside or both?
Question 2: Is it alive?
Again, here are some sample responses, for the non-creative among you.

inside	outside	both
alive	houseplant	bison	dog
not alive	shower curtain	billboard	cell phone
*/
import java.util.Scanner;

public class TwoMoreQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String q1,q2;
		
		Scanner input = new Scanner(System.in);
System.out.print("TWO MORE QUESTIONS, BABY!\nThink of something and I'll try to guess it!");

System.out.println("Does it stay inside or outside or both?");
q1 = input.next();

System.out.println("Is it a living thing?");
q2 = input.next();

if(q1.equalsIgnoreCase("inside")&& q2.equalsIgnoreCase("yes")) {
	System.out.println("u r thinking of a houseplant");
}
if(q1.equalsIgnoreCase("inside")&& q2.equalsIgnoreCase("no")) {
	System.out.println("u r thinking of a shower curtain");
}
if(q1.equalsIgnoreCase("outside")&& q2.equalsIgnoreCase("yes")) {
	System.out.println("u r thinking of a bison");
}
if(q1.equalsIgnoreCase("outside")&& q2.equalsIgnoreCase("no")) {
	System.out.println("u r thinking of a billboard");
}
if(q1.equalsIgnoreCase("both")&& q2.equalsIgnoreCase("yes")) {
	System.out.println("u r thinking of a dog");
}
if(q1.equalsIgnoreCase("both")&& q2.equalsIgnoreCase("no")) {
	System.out.println("u r thinking of a cell phone");
}

	}

}
