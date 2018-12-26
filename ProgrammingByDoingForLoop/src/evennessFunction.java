/*Write a function like so:

public static boolean isEven( int n )
The function should return the value true if n is an even number (evenly divisible by 2) and false otherwise.

Also, write

public static boolean isDivisibleBy3( int n )
The function should return the value true if n is evenly divisible by 3 and false otherwise.

Write a main() that contains a for loop to generate all the numbers from 1 to 20.
 Use if statements inside the loop to mark the number with a "<" if it's even, 
 with a "=" if it's evenly divisible by 3, and with both if it's divisible by both 2 and 3.
*/
public class evennessFunction {
	
	public static void main(String[] args)
	{
		for(int x = 0; x <= 20; x++)
		{
			if (isDivisibleBy3(x) == true && isEven(x) == true)
			{
				System.out.println(x+ " <=");
				
			} else if (isDivisibleBy3(x) == true) {
				
				System.out.println(x+ " =");
				
			} else if (isEven(x) == true) {
				
				System.out.println(x+ " <");;
				
			} else {
				
				System.out.println(x);
			}
		}
	}
	public static boolean isEven (int n)
	{
		if (n % 2 == 0)
			return true;
		else 
			return false;
	}
	
	public static boolean isDivisibleBy3 (int n)
	{
		if (n % 3 == 0)
			return true;
		else
			return false;
	}
	
	
}
	
