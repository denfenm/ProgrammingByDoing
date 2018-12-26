import java.util.*;

public class WhereIsit {
	public static void main(String[] args)
	{
Random r = new Random();
Scanner input = new Scanner(System.in);

int x, find, count = 0;

int array[] = new int[10];

for(x = 0;x < array.length; x++)
{
	array[x] = 1 + r.nextInt(50);
	
}

System.out.println(Arrays.toString(array).replaceAll("[\\[\\]]",""));
System.out.print("Value to find: ");
find = input.nextInt();

for(x = 0; x < array.length; x++)
{
	if(find == array[x]) 
	System.out.println(find+ " is in slot "+x);
	
}


}
}