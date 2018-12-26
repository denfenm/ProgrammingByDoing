import java.util.Scanner; 

public class FindingPrimeNumbers {
public static void main(String[] args) 
{
//	Scanner input = new Scanner(System.in);
//	System.out.println("Enter a number ");
//	
//	int n = input.nextInt();
	
	for(int i = 2; i <= 99; i++)
	{
	if (isPrime(i))
		System.out.println(i + " <");
	else 
		System.out.println(i);
	}
}
	public static boolean isPrime(int n)
	{
		
		for(int i = 2; i <= n/2; i++ ) 
		{
			if(n % i == 0 )
			
				return false;
		}
		return true;
			
	}
	
}
