import java.util.Scanner;

public class EnterYourPin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int pin=12345;
System.out.println("Welcome to the bank of zara");
System.out.print("Enter your pin");
int entry = input.nextInt();

while (entry!=pin) {
	System.out.println("\nIncorrect pin.Try again.");
	System.out.print("enter your pin: ");
	entry= input.nextInt(); //buang ni nanti dapat infinite loop
}
System.out.println("\nPin accepted. You now have access to your account.");
	}

}
