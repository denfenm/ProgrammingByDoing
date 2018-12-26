import java.util.Scanner;

public class AgeInFiveYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name;
int age;
Scanner input = new Scanner(System.in);

System.out.print("Hello. What is your name? ");
name = input.next();

System.out.print("Hi, "+name+" !"+"\tHow old are you?");
age = input.nextInt();

while(age <= 0) {
System.out.print("INVALID, enter again");
age = input.nextInt();

	}
System.out.println("Did you know that in five years you will be "+(age+5)+" years old\nAnd five years ago you were "+(age-5)+"!"+" Imagine that!");
}}
