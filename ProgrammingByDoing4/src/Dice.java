import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Here comes the dice!");
int roll1, roll2;
Random r = new Random();
roll1=1+r.nextInt(6);
roll2=1+r.nextInt(6);

System.out.println("Roll#1: "+roll1+"\nRoll#2: "+roll2+"\nThe total is "+(roll1+roll2));
	}

}
