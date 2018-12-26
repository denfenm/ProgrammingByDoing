/*Write another program that uses a for loop. With the loop, make the variable x go from 
 * -10 to 10, counting by 0.5. (This means that x can't be an int.)

Inside the body of the loop, make another variable y become 
the current value of x squared. Then display the current values of both x and y.

To get your output to line up like mine, use a tab.*/
public class XsAndYs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("x \t y \n ------------------");

double x , y;

for (x = -10; x <= 10; x += 0.5) 
{
	y = Math.pow(x, 2);
	
		System.out.println(x + "\t" + y);
}
	}

}

