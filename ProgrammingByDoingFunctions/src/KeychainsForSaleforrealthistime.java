import java.util.Scanner;

public class KeychainsForSaleforrealthistime {

public static int keychains;
public static int price = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String exit = "", name = "";
		int choice, key;
		while(!exit.equalsIgnoreCase("exit")) 
		{
		System.out.println("Ye Olde Keychain Shoppe\n\n1.Add Keychains to Order\n2.Remove Keychains from Order\n3.View Current Order\n4.Checkout");
		System.out.print("\n\nPlease enter your choice: ");
		choice = input.nextInt();
		
		if(choice == 1)
		{
			System.out.println("You have "+getKeychains()+" keychains. How many to add?");
			key = input.nextInt();
			add_keychains(key);
			System.out.println("You now have "+getKeychains() +" keychains.");
			
		} else if(choice == 2) {
			System.out.println("You have "+getKeychains()+" keychains.How many to remove?");
			key = input.nextInt();
			remove_keychains(key);
			System.out.println("You now have "+getKeychains() +" keychains.");
			
		} else if(choice == 3) {
			view_order();
			
		} else {
		
			checkout();
			exit = "exit";
			
		}
		
		
		
		}
		
		
	}
	
	public static int getKeychains()
	{
		return keychains;
	}
	
	public static void add_keychains(int number)
	{
		
		keychains += number;
		getKeychains();
		
	}
	
	public static void remove_keychains(int number)
	{
		
		keychains -= number;
		getKeychains();
	}
	
	public static void view_order()
	{
		System.out.println("You have "+getKeychains() + " keychains.");
		price();
	}
	
	public static  void checkout()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("CHECKOUT");
		System.out.println("What is your name?");
		String name = input.nextLine();
		view_order();
		System.out.println("Thanks for your order, "+name+"!");
		
	}
	
	public static void price()
	{
		
		System.out.println("Keychains cost $10 each. Total cost is $"+ price*getKeychains());
	}
	
	

}
