/*Create an array that can hold ten integers, and fill each slot with a different random value
 *  from 1-50. Display those values on the screen, and then prompt the user for an integer. 
 *  Search through the array, and if the item is present, say so. It is not necessary to display 
 *  anything if the value was not found. If the item is in the array multiple times, it's okay if 
 *  the program prints the message more than once.*/
import java.util.*;

public class FindingAValueInAnArray 
{
	public static void main(String[] args)
			{
				Random r = new Random();
				Scanner input = new Scanner(System.in);
				int x, max=0 ;
				int[] array = new int[10];

				for( x = 0; x < array.length; x++)
				{
					array[x] = 1 + r.nextInt(50);
				}
				
				System.out.println("Array: "+Arrays.toString(array).replaceAll("[\\[\\]]",""));
				
				for(int y = 0; y < array.length; y++) //find max
				{
					if(array[y] > max)
						max = array[y];
					
				}
				System.out.print(max);
				
				System.out.print("Value to find: ");
				int find = input.nextInt();
				
				for(x = 0; x < array.length; x++){
				{
					if(find == array[x])
					System.out.println(find+" is in the array.");
				}
				}
				
				
}
}