import java.util.Scanner; 
import java.text.DecimalFormat;
import java.util.Random;

public class MoreUserInputOfData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String firstName;
String lastName;
String login;
int grade;
double gpa;
double id;

System.out.print("Please enter the following information so I can sell it for a profit!\n\n\n");
Scanner input = new Scanner(System.in);

System.out.print("First name: ");
firstName = input.nextLine();

System.out.print("Last name: ");
lastName = input.nextLine();

System.out.print("Grade (9-12): ");
grade = input.nextInt();

System.out.print("ID: ");
id = input.nextDouble();

System.out.print("Login: ");
login = input.next();

System.out.print("GPA (0.0-4.0): ");
gpa = input.nextDouble();
DecimalFormat zeroDecimal = new DecimalFormat("#0");
DecimalFormat oneDecimal = new DecimalFormat("#0.0");
DecimalFormat twoDecimal = new DecimalFormat("#0.00");

System.out.print("Your information:\n\tLogin:" +login+"\n\tfirstName:\t"+firstName+"\n\tlastName:\t"+lastName+"\n\tGPA:\t"+oneDecimal.format(gpa)+"\n\tGrade:\t"+twoDecimal.format(grade)+"\n\tID:\t"+zeroDecimal.format(id));
double randomProfit = (double)(Math.random() * id + 1);
System.out.println("\nI'm getting $" + twoDecimal.format(randomProfit)+" for this!!");
}}
