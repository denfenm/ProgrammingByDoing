import java.util.*;
public class FindingTheLargestValueInAnArray {
	public static void main(String[] args)
	{
		
 int arr[] = new int[10];
 
 Random r = new Random();
 
 int x, max = 0;
 for(x = 0; x < arr.length; x++)
 {
 arr[x] = 1 + r.nextInt(50);
 }
 System.out.println(Arrays.toString(arr));
 
 for(x = 0; x < arr.length; x++)
 {
	 
	 if(arr[x] > max)
		 max = arr[x];
	 
 }
 System.out.println("Largest value is "+max);
 
 for(x = 0; x < arr.length; x++)
 {
	 
	 if(max == arr[x])
		 System.out.println(max + " is in slot "+ x);
 }
}
}