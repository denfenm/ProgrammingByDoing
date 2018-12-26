import java.util.Scanner;

public class AreaCalculator {
	public static void main(String[] args) {
		int side,length,base,height,width,radius;
		char choose;
		
		Scanner input = new Scanner(System.in);
		
System.out.println("Which shape to calculate? Enter \ns = square\nr = rectangle\nt = triangle\nc = circle");

choose = input.nextLine().charAt(0);

if (choose == 's') {
	System.out.print("Square is chosen. Enter your side length.");
	side = input.nextInt();
	System.out.println("Area is " + area_square(side));
} else if (choose == 'r') {
	System.out.print("Rectangle is chosen. Enter your length and width.");
	length = input.nextInt();
	width = input.nextInt();
	System.out.println("Area is "+area_rectangle(length,width));
} else if (choose == 't') {
	System.out.print("Triangle is chosen. Enter your base and height. ");
	base = input.nextInt();
	height = input.nextInt();
	System.out.println("Area is " + area_triangle(base,height));
} else if (choose == 'c') {
	System.out.print("Circle is chosen. Enter your radius. ");
	radius = input.nextInt();
	System.out.print("Area is " + area_circle(radius));
}

}
	
	public static double area_circle(int radius) 
	{
		double area;
		
		area = Math.PI*Math.pow(radius, 2);
		
		return area;
	}
	
	public static int area_rectangle(int length, int width)
	{
		int area;
		
		area = length*width;
		
		return area;
	}
	
	public static int area_square (int side)
	{
		int area;
		
		area = side*side;
		
		return area;
	}
	
	public static double area_triangle(int base, int height)
	{
		int area;
		
		area = base*height*(1/2);
		
		return area;
	}
}