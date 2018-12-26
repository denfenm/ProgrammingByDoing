/*Julio Cesar Chavez Mark VII is an interplanetary space boxer, who currently holds the championship belts 
 * for various weight categories on many different planets within our solar system. However, 
 * it is often difficult for him to recall what his "target weight" 
 * needs to be on earth in order to make the weight class on other planets.	
 * Write a program to help him keep track of this.
 */
import java.util.Scanner;
//import java.text.DecimalFormat;
public class SpaceBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double earthWeight;
		int planetNumber;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your current earth weight: ");
		earthWeight = input.nextDouble();
		
		System.out.print("I have information for the following planets: \n\t1.Venus\t\t2.Mars\t\t3.Jupiter\n\t4.Saturn\t5.Uranus\t6.Neptune\n\nWhich planet are you visiting?");
		
		planetNumber = input.nextInt();
		
		//DecimalFormat twoDecimalPoint = new DecimalFormat("#0.00");
		
		switch(planetNumber) {
		case 1: System.out.printf("Your weight would be %4.2f pounds on that planet", planetNumber*0.78);
		break;
		
		case 2:System.out.printf("Your weight would be %4.2f pounds on that planet", planetNumber*0.39);
		break;

		case 3: System.out.printf("Your weight would be %4.2f pounds on that planet", planetNumber*2.65);
		break;
		
		case 4: System.out.printf("Your weight would be %4.2f pounds on that planet", planetNumber*1.17);
		break;
		
		case 5: System.out.printf("Your weight would be %4.2f pounds on that planet", planetNumber*1.05);
		break;
		
		case 6: System.out.printf("Your weight would be %4.2f pounds on that planet", planetNumber*1.23);
		break;
		
		// System.out.println("Your weight would be "+twoDecimalPoint.format(planetNumber*0.78)+" pounds on that planet");
		}
	}

}