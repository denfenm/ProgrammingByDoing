import java.util.Scanner;
import java.util.Random;

public class HiLoWithLimitedTries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int guess=0,mynum,tries=0; //remember to initialise!!! random number tak perlu initialise

Scanner input = new Scanner(System.in);
Random r = new Random();
mynum=1+r.nextInt(10);

//while(mynum!=0 && tries>7) {
System.out.println("Im thinking of a number between 1-100. you have 7 guess");
guess = input.nextInt();
//tries++;
//if(guess>mynum) System.out.println("Too high");
//else {System.out.println("Too low");}

	while(guess!=mynum&&tries<7)  { //kena letak number of tries sini gak
	tries++;
	System.out.println("try again.\t"+tries+"/7");
	guess = input.nextInt();
	if(guess>mynum) System.out.println("Too high");
	else if(guess<mynum){System.out.println("Too low");}
	
	}//}
	if(guess!=mynum) System.out.println ("you have used all the tries. no more m8");
	else tries++; System.out.println("correct. took you tries: "+tries);
}
	}

 