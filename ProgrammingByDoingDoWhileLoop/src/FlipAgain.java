import java.util.Random;
import java.util.Scanner;

public class FlipAgain
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random rng = new Random();
//for do while, dont need to initialise it can still work bcs it doesnt test the condition first but execute terus
		String again;//String again="y";

		/*while ( again.equals("y") )
		{
			int flip = rng.nextInt(2);
			String coin;

			if ( flip == 1 )
				coin = "HEADS";
			else
				coin = "TAILS";

			System.out.println( "You flip a coin and it is... " + coin );

			System.out.print( "Would you like to flip again (y/n)? " );
			again = keyboard.next();
		}*/
		
		//dowhileloop
		do {
			int flip = rng.nextInt(2);
			String coin;

			if ( flip == 1 )
				coin = "HEADS";
			else
				coin = "TAILS";

			System.out.println( "You flip a coin and it is... " + coin );

			System.out.print( "Would you like to flip again (y/n)? " );
			again = keyboard.next(); } while(again.equals("y"));
		}
	}