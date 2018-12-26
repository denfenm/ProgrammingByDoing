import java.util.Scanner;

public class Adventure2Sample {
 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 int nextroom = 1;
	 String choice = "";
	
		 while(nextroom!=0)
 {
		 if(nextroom==1)
		 {
			 System.out.println("You are in a small room. There is a \"closet\" and a doorway to the \"hall\".");
			 System.out.print("> ");
			 choice = input.nextLine();
			 if(choice.equals("closet"))
				 nextroom = 2;
			 else if (choice.equals("hall"))
				 nextroom = 3;
			 else
				 System.out.println(choice+" wasnt one of the options. try again");
		 }
		 if(nextroom==2)
		 {
			 System.out.println("you're in a barren closet. there's nothing to do here except go \"back\".");
			 System.out.print("> ");
			 choice = input.nextLine();
			 if (choice.equals("back"))
				 nextroom = 1;
			 else
				 System.out.println(choice+" wasnt one of the options. Try again.");
		 }
		 if(nextroom==3)
		 {System.out.println("You find yourself in a concrete hallway.Oddly, there is only a single");
		 System.out.println("\"door\" visible. otherwise, the hall just extends about fifteen feet");
		 System.out.println("in either direction, and ends in a smooth, blank, concrete wall.");
		 System.out.println("Do you want to enter the \"door\" or approach the \"wall\" looking for clues?");
		 choice = input.nextLine();
		 System.out.print("> ");
		 if (choice.equals("door"))
			 nextroom=1;
		 else if (choice.equals("wall"))
			 nextroom=4;
		 else
			 System.out.println(choice+"wasnt one of the options. try again.");}
		 if(nextroom==4) {
			 System.out.println("upon closer inspection, the seemingly blank wall shimmers ever so slightly");
		 System.out.println("in the dim light. u put forward a tentative hand, and it pushes through,");
		 System.out.println("a feeling of static sliding up your arm");
		 System.out.println();
		 System.out.println("you pass through the portal into the unknown..." );
		 nextroom=0;
}
		 }
		 }}
 
 