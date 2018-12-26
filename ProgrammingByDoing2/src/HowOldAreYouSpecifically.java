import java.util.Scanner;

public class HowOldAreYouSpecifically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int age;
Scanner input = new Scanner(System.in);

System.out.print("Hey, what's your name? ");
name = input.next();

System.out.print("Okay, "+name+", how old are you?");
age = input.nextInt();

if (age<16) {
	System.out.println("You can't drive, "+name+".");
}else if (age==16 || age==17) {
	System.out.println("You can drive but not vote, "+name+".");
}else if (age>=18 || age <=24) {
	System.out.println("You can vote but not rent a car, "+name+".");
}else if (age>=25) {
	System.out.println("You can do pretty much anything, "+name+".");
}else {
	System.out.println("ERROR");
}
	}

}
