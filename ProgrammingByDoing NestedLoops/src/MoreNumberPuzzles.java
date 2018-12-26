/*Use nested for loops to generate a list of all the two digit numbers which are less
 *  than or equal to fifty-six, and the sum of whose digits is greater than ten.

Use another set of nested for loops to find a two-digit number such that the number itself minus
 the number reversed is equal to the sum of its digits.

For example, 72 is not such a number because 72-27 (which is 45) is not the same as the sum of its digits (2+7 = 9).

Finally, put the code for each of the two parts into its own separate function,
 and have a menu in main() which allows you to choose which of the two sets to find.	
 This main program should keep repeating until you choose to quit (use a do-while loop for this).
*/
import java.util.Scanner;

public class MoreNumberPuzzles {
	public static Scanner input;
	public static int user;
	public static void main(String[] args)
	{
		
	do 
		{
		menu();
		if( user == 1)
		{
			choice1();
		}
		else if(user == 2)
		{
			choice2();
		}
		
		else if(user != 3 && user != 2 && user != 1)
		{
			System.out.println("invalid");
		}
		}
	while(user != 3);


}
	public static void choice1() 
	{
	for(int x = 0; x < 10; x++)
	{
		for(int i = 0; i < 10; i++)
		{
		if( (x <= 5 && i <= 6 ) && (x+i) >= 10)
			System.out.println(x + " and "+ i);
		}
	}
	}
	
	public static void choice2()
	{
	{for(int c = 0; c < 10; c++)
	
		for(int v = 0; v < 10; v++)
		{
			int a = (c*10) + v;
			int b = (v*10) + c;
			int d = c + v;
			
			if( (a - b) == d)
				System.out.println(c + " and "+ v);
		}
	}
	}
	
	public static void menu()
	{
		input = new Scanner(System.in);
		System.out.print("1)Find two digit numbers <= 56 sums of digits > 10"
				+ "\n2)Find two digit number minus number reversed which equals sum of digits"
				+ "\n3)Quit\n> ");
		user = input.nextInt();
	}
}