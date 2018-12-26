
public class BasicArrays1 {
public static void main(String[] args)
{
	int array[] = new int[10];
	
	for (int x = 0; x < array.length; x++)
	{
		array[x] = -113;
		System.out.println("Slot "+ x + " contains" + array[x]);
		
	}
}
}
