/*Make a program which plays a simple game
 *  of 2 Questions. The first question should be "animal, vegetable, or mineral?"
 *   Then, the second question should be "is it bigger than a breadbox?" Then,
 *    display one of six possible responses, depending on their answers. 
 *    You can choose what answers to give for each of the six possibilities.
 

Here's a suggestion:

size \ type	animal	vegetable	mineral
smaller than a breadbox	squirrel	carrot	paper clip
bigger than a breadbox	moose	watermelon	Camaro*/

import java.util.Scanner;


public class TwentyQuestionsWellActuallyJustTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String q1, q2, guess=""; //important!
		

 System.out.print("TWO QUESTIONS!\nThink of an object, and I'll try to guess it.");
 
 Scanner input = new Scanner(System.in);
 
 System.out.print("\nQuestion 1) Is it an animal, vegetable, or mineral?\n>");
 q1 = input.next(); //salah sbb guna nextLine, thus output guess tak keluar.
 
 
 System.out.print("Question 2) Is it bigger than a breadbox?\n>");
 q2 = input.next();
 
//kalau utk letters guna "", xblh guna == utk words, kena guna as below
 	if (q1.equalsIgnoreCase("animal")) { 
 		
 		{ if (q2.equalsIgnoreCase("no")) 
		guess = "squirrel";
 		 else  if(q1.equalsIgnoreCase("yes"))
 			guess = "moose"; }
 		 
 	}else if (q1.equalsIgnoreCase("vegetable")){ 
		 
		 
		 { if (q2.equalsIgnoreCase("no")) 
			 guess = "carrot" ;
		 else if (q2.equalsIgnoreCase("yes")) 
			 guess = "watermelon"; }
		 
	 
	}else if (q1.equalsIgnoreCase("mineral" )){ 
		
		
		 { if(q2.equalsIgnoreCase("no")) 
			 guess = "paperclip";
		 else if (q2.equalsIgnoreCase("yes")) 
			 guess = "Camaro"; }
 	} 		
 	
 	
 		
	 System.out.println("My guess is that you are thinking of a "+ guess +".");
 		
 	}
	}


