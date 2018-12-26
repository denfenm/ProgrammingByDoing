/*Make a program which displays an appropriate name for a person, using a combination of nested ifs
 * 
 *  and compound conditions. Ask the user for a gender, first name, last name and age.

If the person is female and 20 or over, ask if she is married. If so, display "Mrs." 
in front of her name. If not, display "Ms." in front of her name. If the female is under 20, display her first and last name.

If the person is male and 20 or over, display "Mr." in front of his name.
 Otherwise, display his first and last name.

Note that asking a person if they are married should only be done if they 
are female and 20 or older, which means you will have a single if and 
else nested inside one of your if statements.

Also, did you know that with an if statement (or else), the curly braces are optional when there is only one statement inside?*/

import java.util.Scanner;

public class GenderGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char gender,marry;
		String firstName, secondName, call="";
		int age;
		
Scanner input = new Scanner(System.in);
System.out.print("What is your gender (M or F): ");
gender = input.next().charAt(0);

System.out.print("First name: ");
firstName = input.next();
System.out.print("Second name: ");
secondName = input.next();
System.out.print("Age: ");
age = input.nextInt();

if(gender == 'M') {
	if (age >= 20) {
		call = "Mr.";
	}else {
		call = "";}
	}else {
		if(age >=20) {
			System.out.printf("Are you married, %s (yes or no)", firstName);
			marry = input.next().charAt(0);
		if(marry == 'y') {
			call = "Mrs.";
			} else { call = "Ms.";}
		} else call = "";}
System.out.printf("%n%nThen I shall call you %s %s", call, secondName);
	}
}
