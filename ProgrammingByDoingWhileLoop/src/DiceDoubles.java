import java.util.Random;

public class DiceDoubles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		
System.out.println("Here Comes THE DICE!");
Random r = new Random();
num1 = 1+r.nextInt(6);
num2 = 1+r.nextInt(6);

while(num1!=num2) {
	num1 = 1+r.nextInt(6);
	num2 = 1+r.nextInt(6);
	System.out.println("Roll#1: "+num1+"\nRoll#2: "+num2+"\nThe total is "+(num1+num2));
}
System.out.println("Roll#1: "+num1+"\nRoll#2: "+num2+"\nThe total is "+(num1+num2));
	}

}
