public class GivingAnArrayABunchOfValuesAtOnce
{
	public static void main( String[] args )
	{
		String[] arr1 = { "alpha", "bravo", "charlie", "delta", "echo"};
		int[] arr2 = {11,23,37,53};
		
		System.out.print("The first array is filled with the following values:\n\t");
		for ( int i=0; i<arr1.length; i++ )
			System.out.print( arr1[i] + " " );
		System.out.println();
		
		System.out.print("The second array is filled with the following values:\n\t");
		for ( int x=0; x<arr2.length; x++ )
			System.out.print( arr2[x] + " " );
		System.out.println();

	}
}