/*Did you know that using a loop, you can examine a String one letter at a time? 
 * The two key built-in String methods are length() and charAt().

length() returns an int representing the total number of characters
 in the String (including punctuation and whitespace). For example,
  if the variable str contains the String "hello", then  str.length() will return 5.
charAt( int n ) returns the  nth character (char) in the String. 
The character positions are zero-based, so if the variable str 
contains the String "ligature", then str.charAt(0) will return 'l', and str.charAt(4) will return 't'.*/

import java.util.Scanner;

public class LetterAtATime
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("What is your message? ");
		String message = kb.nextLine();

		System.out.println("\nYour message is " + message.length() + " characters long.");
		System.out.println("The first character is at position 0 and is '" + message.charAt(0) + "'.");
		int lastpos = message.length() - 1;
		System.out.println("The last character is at position " + lastpos + " and is '" + message.charAt(lastpos) + "'.");
		System.out.println("\nHere are all the characters, one at a time:\n");

		//for ( int i=0; i<=message.length(); i++ ) //if < jadi <= .... dpt thread exception
		for ( int i=0; i<message.length(); i++ )
		{
			System.out.println("\t" + i + " - '" + message.charAt(i) + "'");
		}

		int a_count = 0;

		for ( int i=0; i<message.length(); i++ )
		{
			char letter = message.charAt(i);
			if ( letter == 'a' || letter == 'A' || letter == 'e'|| letter == 'E' || letter == 'i'|| letter == 'I' || letter == 'o'|| letter == 'O' || letter == 'u'|| letter == 'U' )
			{
				a_count++;
			}
		}

		System.out.println("\nYour message contains vowel " + a_count + " times. Isn't that interesting?");

	}
}