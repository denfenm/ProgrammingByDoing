import java.text.DecimalFormat;
import java.util.Scanner;

public class AskingQuestions
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		DecimalFormat formatter = new DecimalFormat("#0.00");
		
		
		int age;
		String feetTall;
		double weight;
		int inches;

		System.out.print( "How old are you? " );
		age = keyboard.nextInt();

		System.out.print( "How many feet tall are you? " );
		feetTall = keyboard.next();
		
		System.out.print( "And how many inches? " );
		inches = keyboard.nextInt();

		System.out.print( "How much do you weigh? " );
		weight = keyboard.nextDouble();

		System.out.println( "So you're " + age + " old, " + feetTall + "\'" + inches +"\"" + " tall and " + formatter.format(weight) + " heavy." );
		System.out.printf("Your weight is %4.2fkg", weight);
	}
}