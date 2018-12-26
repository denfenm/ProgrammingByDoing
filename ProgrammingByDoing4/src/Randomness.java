import java.util.Random;

public class Randomness
{
	public static void main ( String[] args )
	{
		Random r = new Random(4);//letak nombor dlm bracket=seed, x bg gener8 this number again
		int x = 1 + r.nextInt(10); //plus 1 to incl 1 to 10 not 0-10

		System.out.println( "My random number is " + x );

		System.out.println( "Here are some numbers from 1 to 5!" );
		System.out.print( 1 + r.nextInt(5) + " " );
		System.out.print( 1 + r.nextInt(5) + " " );
		System.out.print( 1 + r.nextInt(5) + " " );
		System.out.print( 1 + r.nextInt(5) + " " );
		System.out.print( 1 + r.nextInt(5) + " " );
		System.out.print( 1 + r.nextInt(5) + " " );
		System.out.println();
		
	/*	System.out.println( "Here are some numbers from 1 to 5!" );
		System.out.print(  r.nextInt(5) + " " );
		System.out.print(  r.nextInt(5) + " " );
		System.out.print(  r.nextInt(5) + " " );
		System.out.print(  r.nextInt(5) + " " );
		System.out.print(  r.nextInt(5) + " " );
		System.out.print(  r.nextInt(5) + " " );
		System.out.println(); //without 1+ the range is from 0-5
*/
		
	/*	System.out.println( "Here are some numbers from 1 to 5!" );
		System.out.print( 3+ r.nextInt(5) + " " );
		System.out.print( 3+ r.nextInt(5) + " " );
		System.out.print( 3+ r.nextInt(5) + " " );
		System.out.print( 3+ r.nextInt(5) + " " );
		System.out.print( 3+ r.nextInt(5) + " " );
		System.out.print( 3+ r.nextInt(5) + " " );
		System.out.println(); //adds 3 to the number
		*/
		
		System.out.println( "Here are some numbers from 1 to 100!" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.println();

		int num1 = 1 + r.nextInt(10);
		int num2 = 1 + r.nextInt(10);

		if ( num1 == num2 )
		{
			System.out.println( "The random numbers were the same! Weird." );
		}
		if ( num1 != num2 )
		{
			System.out.println( "The random numbers were different! Not too surprising, actually." );
		}
	}
}