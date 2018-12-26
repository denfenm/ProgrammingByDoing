/*Create an array that can hold ten integers, and fill each slot with a different random value from 1-50. 
 * Display those values on the screen, and then prompt the user for an integer. Search through the array, and 
 * count the number of times the item is found.*/

import java.util.*;

public class HowManyTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random r = new Random();
Scanner input = new Scanner(System.in);

		int array[] = new int[10];
int x, find, count = 0;

for(x = 0; x < array.length; x++)
{
	array[x] = 1 + r.nextInt(50);
	
}

System.out.println("Array: "+ Arrays.toString(array).replaceAll("[\\[\\]]",""));
System.out.print("Value to find: ");
find = input.nextInt();

for(x = 0; x <array.length; x++)
{
	if(find == array[x])
		count++;
}

System.out.println(find+ " was found "+count+" time(s).");
	}

}
