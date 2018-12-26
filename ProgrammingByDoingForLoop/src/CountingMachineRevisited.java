/*Write a program that gets three integers from the user. Count from
 *  the first number to the second number in increments
 *   of the third number. Use a for loop to do it.
 */
import java.util.Scanner;
public class CountingMachineRevisited {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int countFrom, countTo, countBy, x;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Count from: ");
		countFrom = input.nextInt();
		
		System.out.print("Count to : ");
		countTo = input.nextInt();
		
		System.out.print("Count by : ");
		countBy = input.nextInt();
		
		for(x = countFrom; x < countTo; x = x+countBy)
		{
			System.out.print(x + "  ");
		}
		
	}

}
