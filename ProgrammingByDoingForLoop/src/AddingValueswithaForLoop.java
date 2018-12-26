import java.util.Scanner;

public class AddingValueswithaForLoop {
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
System.out.println("Give num" );
int user = input.nextInt();
int x, sum=0;
for (x = 1; x <= user; x++ )
{
	System.out.print(x + " ");
	sum+=x; //sum
	
}

System.out.println("\nThe sum is "+ sum);

}
}
