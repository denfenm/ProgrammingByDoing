import java.util.Scanner; 

public class ALittleQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char Y;
		int score=0;
		int Q1;
		int Q2;
		int Q3;
		
		Scanner input = new Scanner(System.in);
	
System.out.print("Are you ready for a quiz? Type yes if you are ");
Y = input.next().charAt(0);

if (Y != 'y') {
	System.out.println("Program exited");
} else {
System.out.println("Okay here it comes!");
}

System.out.print("Q1) What is the capital of Alaska?\n\t1)Melbourne\n\t2)Anchorage\n\t3)Juneau\n\n>");
Q1 = input.nextInt();

if (Q1 == 3) {
	System.out.println("That's right");
	score++;
} else {
	System.out.println("The answer is Juneau");
}
System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?\n\t1)Yes\n\t2)No\n\t3)IDK\n\n>");
Q2 = input.nextInt();

if (Q2 == 2) {
	System.out.println("That's right");
	score++;
} else {
	System.out.println("The answer is 2");
}
System.out.println("Q3) What is the result of 9+6/3?\n\t1)5\n\t2)11\n\t3)15/3\n\n>");
Q3 = input.nextInt();

if (Q2 == 2) {
	System.out.println("That's right");
	score++;
} else {
	System.out.println("The answer is 2");
}
	System.out.println("Overall, you got "+score+" out of 3 correct.\n\nThanks for playing!");
}

	}


