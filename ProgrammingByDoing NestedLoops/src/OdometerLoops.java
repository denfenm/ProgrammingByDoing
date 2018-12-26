import java.util.Scanner;

public class OdometerLoops
{
	public static void main( String[] args ) throws Exception
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int x  = input.nextInt();
		
		for ( int thous=0; thous<x; thous++ )
		//{
			for ( int hund=0; hund<x; hund++ )
			//{
				for ( int tens=0; tens<x; tens++ )
				//{
					for ( int ones=0; ones<x; ones++ )
					{
						System.out.print( " " + thous + "" + hund + "" + tens + "" + ones + "\r" );
						Thread.sleep(500);
					} //remaining only these braces still works
				//} 
			//}
		//}

		System.out.println();
	}
}

//changing from <10 to <8 gets 7777
//changing from <8 to allow user input 