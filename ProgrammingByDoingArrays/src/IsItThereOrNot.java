import java.util.*;

public class IsItThereOrNot 
{
public static void main(String[] args)
{
	Random r = new Random();
	Scanner input = new Scanner(System.in);
	int arr[] = new int[10];
	int count = 0, find, x;
	for(x = 0; x < arr.length; x++)
	{
		arr[x] = 1 + r.nextInt(50);
	}
	
	System.out.println("Array: "+ Arrays.toString(arr).replaceAll("[\\[\\]]", ""));
	System.out.print("Value to find: ");
	find = input.nextInt();
	
	for(x = 0; x < arr.length; x++)
	{
		if(find == arr[x])
			count++;
	}
	
	if(count == 0)
		System.out.println(find+" is not in the array.");
	else if(count > 0)
		System.out.println(find+" is in the array.");
}
}
