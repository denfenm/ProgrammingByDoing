import java.text.DecimalFormat;
public class NumberPuzzlesIIIArmstrongNumbers {
public static void main(String[] args)
{
	DecimalFormat format = new DecimalFormat("#0");
	for(int z = 0; z < 10; z++)
		for(int x = 0; x < 10; x++)
			for(int c = 0; c < 10; c++)
			{
				double n =  Math.pow(z, 3) + Math.pow(x, 3) + Math.pow(c, 3);
				int m = (z * 100) + (x * 10) + c;
				if(n == m)
				System.out.println(z + " , "+x+ " , "+c + " , "+ format.format(n) + " , "+format.format(m));
			}
				
}
}