import java.util.*;
public class ParallelArrays {
public static void main(String[] args)
{
	int x, find;
	Scanner input = new Scanner(System.in);
	String[] lastname = {"Mitchell", "Ortiz", "Luu", "Zimmerman", "Brooks"};
	double[] grade = {99.5, 78.5, 95.6, 82.7,99.2};
	int[] id = {123456, 813225, 123011, 123121, 32235};
	
	for(x = 0; x < lastname.length; x++)
	{
		System.out.println(lastname[x]+" "+grade[x]+" "+id[x]);
	}
	
	System.out.println("ID number to find: ");
	find = input.nextInt();
	
	for(x = 0; x < lastname.length; x++)
	{
		if(find == id[x])
		System.out.println(lastname[x]+" "+grade[x]+" "+id[x]);
	}
}
}
