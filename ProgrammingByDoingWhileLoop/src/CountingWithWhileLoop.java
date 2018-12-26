/*1-What does n++ do? Remove it and see what happens. (Then put it back.)
2-Change the code so that the loop repeats ten times instead of five.
3-See if you can change the code so that the message still prints ten times, 
but the numbers in front count by tens, like so:*/

import java.util.Scanner;

public class CountingWithWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Type in a message, and ill display it five times.");
System.out.println("Message: ");
String message;
int times;
message = input.nextLine();
System.out.println("How many times?");

times = input.nextInt();
int n=0;
while(n<times) {
	System.out.println((n+1)+"0. "+message);
	n++;
}
	}

}

/*Normally, while loops are best for repeating as long as something is true:

Keep going as long as they haven't guessed it.
Keep going as long as you haven't got doubles.
Keep going as long as they keep typing in a negative number.
Keep going as long as they haven't typed in a zero.
But sometimes, we know in advance how many times we want to do something.

Do this ten times.
Do this five times.
Pick a random number, and do it that many times.
Take this list of items, and do it one time for each item in the list.
We can do that sort of thing with a while loop, 
but we have to use a counter. A counter is a number variable (int or double) 
that starts with a value of 0, and then we add 1 to it whenever something happens. 
So, here, we're going to be adding 1 to the counter everytime we repeat the loop. 
And when the counter reaches a predetermined value, we'll stop looping.
*/