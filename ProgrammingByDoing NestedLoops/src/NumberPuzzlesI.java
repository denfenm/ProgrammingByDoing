
public class NumberPuzzlesI {
public static void main(String[] args)
{
	int num1 = 0, num2 = 0;
	
	for (num1 = 1; num1 < 100; num1++)
	{
		for (num2 = 1; num2 < 100; num2++)
		{
			if((num1 + num2) == 60 && (num1 - num2) == 14)
				System.out.println(num1 +","+ num2);
		}
	}
}
}
