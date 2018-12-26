/*
 * Use nested for loops to find four positive integers whose sum is 45, and such that the first plus 2, 
 * the second minus 2, the third multiplied by 2, and the fourth divided by 2 are all equal.

Please note that these four numbers are integers, and not necessarily just digits. 
In this problem, we are no longer finding a single four-digit number; we are finding four separate numbers.
 However, since we are trying to generate all possible combinations, the procedure should be the same.

For those of you having trouble with the English on this one (I've noticed that students really don't like word problems),
 here's what that means.

The output of your program should be four numbers. They won't be negative numbers.
When you add the four numbers, they add up to 45.
If you add 2 to the first number, you get the same answer as if you had subtracted 2 from the second number.
If you multiply the third number by two, you also get the same answer.
If you divide the fourth number by two, you also get the same answer.
The following mathematical statments are also true about these numbers:

A + 2 = B - 2 = C × 2 = D ÷ 2
and

A + B + C + D = 45
 */
public class NumberPuzzlesIVANewHope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int x = 0; x < 100; x++)
		{
			for(int c = 0; c < 100; c++)
			{
				for(int v = 0; v < 100; v++)
				{
					for(int b = 0; b < 100; b++)
					{
						if((x + c + v + b == 45) && ((x + 2) == (c - 2)) && ((c - 2) == (v * 2)) && ((v * 2) == b / 2))
						{
							System.out.printf("%d, %d, %d, %d", x,c,v,b);
						}
					}
				}
			}
		}
		
		
	}

}
