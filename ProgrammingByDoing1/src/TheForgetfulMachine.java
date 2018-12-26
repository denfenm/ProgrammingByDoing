import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class TheForgetfulMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstWord;
		String secondWord;
		double firstNumber;
		double secondNumber;
		
		Scanner input=new Scanner(System.in);
		System.out.print("Give me a word!");
		firstWord = input.next();
		
		System.out.print("Give me a second word!");
		secondWord = input.next();
		
		System.out.print("Great, now your favourite number?");
		firstNumber = input.nextDouble();
		
		System.out.print("And your second-favourite number...");
		secondNumber = input.nextDouble();
		
		double max = firstNumber;
		double min = 1;
				
		//double random = Math.random() * firstNumber + 1;
		double random = (double)(Math.random() * firstNumber +1);
		DecimalFormat formatter = new DecimalFormat("#0");
	System.out.println("Uhhh was your first number " + formatter.format(random) +"?");
		
		
	}

}
