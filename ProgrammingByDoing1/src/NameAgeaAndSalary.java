import java.util.Scanner;
import java.text.DecimalFormat;

public class NameAgeaAndSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name; 
		int age;
		double salary;
		
Scanner input = new Scanner(System.in);
System.out.println("Hello. What is your name?");
name = input.nextLine();

System.out.println("Hi, "+name+ "!\tHow old are you?");
age = input.nextInt();

DecimalFormat formatter = new DecimalFormat ("#0.00");

if(age <18) {
	System.out.println("So you're "+age+", eh?\tThat's not old are all!\nHow much do you make,"+name+"?");
	 salary = input.nextDouble();
	 System.out.println(salary+"!\t I hope that's per hour and not per year! LOL!");
} else if (age>18) {
	System.out.println("So you're "+age+", eh?\tThat's old!\nHow much do you make,"+name+"?");
	salary = input.nextDouble();
	System.out.println("$"+formatter.format(salary)+"!\tI hope that's per hour and not per year! LOL!");
	}

}
}