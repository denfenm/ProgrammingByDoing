import java.util.Scanner;
public class CountingMachine {
public static void main(String[] args) {
	int x, count;
Scanner input = new Scanner(System.in);

	System.out.print("Count to: ");
	count = input.nextInt();
	
	input.nextLine();
	
	for (x=0; x<count; x++) {
		
		System.out.print(x+"  ");
		
	}
	
}
}
