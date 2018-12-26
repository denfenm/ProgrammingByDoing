/*Write a program to allow the user to enter three integers. You must use do-while or while loops to enforce that these integers are in ascending order, though duplicate numbers are allowed.

Tell the user whether or not these integers would represent the sides of a right triangle.*/
import java.util.Scanner;

public class RightTriangleChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int side1,side2,side3;
Scanner input = new Scanner(System.in);
System.out.println("Enter 3 integers. Side 1: ");
side1 = input.nextInt();
System.out.println("side 2: ");
side2=input.nextInt();
while(side2<side1) {
	System.out.println(side2+" Smaller than "+side1+" .try again");
	side2=input.nextInt();
} System.out.println("side 3: "); side3=input.nextInt();
while(side3<side2) {
	System.out.println(side3+" Smaller than "+side2+" .try again");
	side2=input.nextInt();
} if((Math.pow(side2, 2))+(Math.pow(side1, 2))==(Math.pow(side3, 2))) 
	System.out.println("these sides make a right triangle");
	else System.out.println("they dont make a right triangle");
}
	}


