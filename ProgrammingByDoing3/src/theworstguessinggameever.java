import java.util.Scanner;

public class theworstguessinggameever {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int guess=0,myguess=5;
		
Scanner input = new Scanner(System.in);
System.out.print("This is the worst guessing game ever.\n\n Im thinking of a nbr from 1-10. Try to guess!");
guess=input.nextInt();
//int myguess = (int)(Math.random()*10+1);
if (guess==myguess) { //==myguess) {
	System.out.print(guess==myguess);
}else {
	System.out.print(false);
}


	}

}
