/*Write a program to take the square root of a number typed in by the user.
 *  Your program should use a loop to ensure that the number they typed in is positive. 
 *  If the number is negative, you should print out some sort of warning and make them type it in again.

Note that it is possible to do this program with either a while loop or a do-while loop. 
(Though personally, I think this one is easier with a while loop.)

You can get the square root of a number n with Math.sqrt(n). 
Make sure you don't do this until the loop is done 
and you know for sure you've got a positive number.
*/
import java.util.Scanner;

public class SafeSquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int user;
		double ans;
		Scanner input = new Scanner(System.in);
		System.out.println("Square root!Enter a number: ");
		user = input.nextInt();
while(user<0) {
	System.out.println("u cant sqrt a negative number. try again");
	user = input.nextInt();

	
	
} ans = Math.sqrt(user);
System.out.println(ans);
	}

}
