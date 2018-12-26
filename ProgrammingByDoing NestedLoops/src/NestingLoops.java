public class NestingLoops
{
	public static void main( String[] args )
	{
		// this is #1 - I'll call it "CN"
		for ( int n=1; n <= 3; n++ )
		{
			for ( char c='A'; c <= 'E'; c++ ) //variable in inner loop changes faster
			{
				System.out.println( c + " " + n );
			}
		}

		System.out.println("\n");

		// this is #2 - I'll call it "AB"
		for ( int a=1; a <= 3; a++ )
		{
			for ( int b=1; b <= 3; b++ )
			{
				System.out.println( a + "-" + b + " " );
			}
			System.out.println();
		}

		System.out.println("\n");

	}
}