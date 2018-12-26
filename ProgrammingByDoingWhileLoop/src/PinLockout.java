import java.util.Scanner;

public class PinLockout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int pin = 12345;
int tries = 0;
System.out.println("Welcome to the bank zaata");
System.out.println("enter ur pin: ");
int entry = input.nextInt();
tries++;

//while(entry!=pin&&tries<3) { 
	while(entry!=pin&&tries<4) { //chg the code so that it locks them after 4 tries
	System.out.println("\nIncorrect pin. try again");
	System.out.println("enter ur pin");
	entry = input.nextInt();
	tries++;}

if(entry==pin) System.out.println("\npin accepted. u now have access to your acc");
else if (tries >= 3) System.out.println("\nu have run out of tries. acc locked.");
	}

}
