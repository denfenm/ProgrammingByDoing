import java.util.Random;

public class BasicArrays3 {


	public static void main(String[] args) {
		Random r = new Random();
		int count = 0;
		int[] array = new int[1000];
		
		for(int x = 0; x < array.length; x++)
		{
			array[x] = 10 + r.nextInt(90);
			System.out.print(array[x] + "  ");
			count ++;
			
			if(count == 20)
			{
				System.out.println();
				count = 0;
			}
		}
		
	}
}
