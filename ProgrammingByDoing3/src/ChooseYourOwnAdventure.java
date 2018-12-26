/*Make a short "Choose Your Own Adventure" game. The starting room should give the user two choices.
 *  Then the second room they travel to should give them two more choices. Finally the third room should give them two choices.

This means your game will have eight possible "endings". Your game will also have a total of fifteen rooms:

        _ R1 _
       /      \
    R2          R3
   /  \        /  \
 R4    R5    R6    R7
 /\    /\    /\    /\
E1 E2 E3 E4 E5 E6 E7 E8*/
import java.util.Scanner;

public class ChooseYourOwnAdventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstChoice="",secondChoice="",thirdChoice=""; 
		
Scanner input = new Scanner(System.in);

System.out.print("WELCOME TO ZARA'S TINY ADVENTURE!\n\n"
		+ "You are in a creepy house! Would you like to go \"upstairs\" or into the \"kitchen\"?\n>");
firstChoice = input.next();

	if(firstChoice.equalsIgnoreCase("kitchen")) 
		
{System.out.print("There is a long countertop with dirty dishes everywhere. Off to one side there is, as you'd expect a refridgerator. You may"
		+ "open the \"refridgerator\" or look into a \"cabinet\".\n>");
secondChoice = input.next(); 

{if(secondChoice.equalsIgnoreCase("refridgerator")) 
	
{System.out.print("Inside the refridgerator you see food. It looks nasty. Would you like to eat the food? (yes or no)");
thirdChoice = input.next();

{if(thirdChoice.equalsIgnoreCase("yes"))
{System.out.println("You live!");}
else{System.out.println("You die of starvation!");}
}}
else 
{System.out.println("Inside the cabinet you see food. Do you eat it? (yes or no)");
thirdChoice = input.next();

{if(thirdChoice.equalsIgnoreCase("yes"))
{System.out.println("You die of poisoning!");}
else{System.out.println("You live!");}}
}
} }else /*if(secondChoice.equalsIgnoreCase("upstairs"))*/ {
	{System.out.print("Upstairs you see a hallway. At the end of the hallway is the master \"bedroom\". There's also a \"bathroom\" off the hallway. "
			+ "Where yould you like to go?");
	secondChoice = input.next(); 
	{if(secondChoice.equalsIgnoreCase("bedroom")) 
		
	{System.out.print("You are in a plush bedroom, with expensive- looking hardwood furniture. The bed is unmade. In the back of the room"
			+ ", the closet door is ajar. Would you like to open the door? (yes or no)");
	thirdChoice = input.next();

	{if(thirdChoice.equalsIgnoreCase("yes"))
	{System.out.println("You see your mom.");}
	else{System.out.println("Well, I guess you'll never know what was in there.");}
	}}
	else 
	{System.out.println("You go into the bathroom and see a shower curtain. Do you open it? (yes or no)");
	thirdChoice = input.next();

	{if(thirdChoice.equalsIgnoreCase("yes"))
	{System.out.println("You found gold!");}
	else{System.out.println("Nothing happens then.");}}
	}}}}}}