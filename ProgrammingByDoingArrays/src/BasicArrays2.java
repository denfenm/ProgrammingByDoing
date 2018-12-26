import java.util.Random;

public class BasicArrays2 {
public static void main(String[] args)
{
	int x;
	Random r = new Random();
	
	int array[] = new int[10];
	
	for(x = 0; x < array.length; x ++)
	{
		array[x] = 1 + r.nextInt(100);;
		System.out.println("Slot " + x + " contains "+ array[x]);
	}
}
}
