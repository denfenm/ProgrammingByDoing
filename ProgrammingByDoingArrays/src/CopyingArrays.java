/*
 * Write a program that creates an array of ten integers.
 *  It should put ten random numbers from 1 to 100 in the array. 
 *  It should copy all the elements of that array into another array
 *   of the same size. Then display the contents of both arrays.
 *    To get the output to look like mine, you'll need a several for loops.

Create an array of ten integers
Fill the array with ten random numbers (1-100)
Copy the array into another array of the same capacity
Change the last value in the first array to a -7
Display the contents of both arrays
 */
import java.util.Random;
import java.util.Arrays;
public class CopyingArrays {
public static void main(String[] args)
{
Random r = new Random();
int arr[] = new int[10];
int destination[] = null;

for(int x = 0; x < arr.length; x++)
{
	arr[x] = 10 + r.nextInt(90);
	System.out.print(arr[x] + "  ");
	destination = Arrays.copyOf(arr,arr.length);
	System.out.println(destination[x] + " ");
}

System.out.println("\n"+Arrays.toString(arr));
System.out.println(Arrays.toString(destination));
arr[arr.length -1] = -7;
System.out.println("\n"+Arrays.toString(arr));
System.out.println(Arrays.toString(destination));
}
}
