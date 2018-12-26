import java.util.Scanner;
import java.text.DecimalFormat;
public class KeychainsForSaleultimatepower {

	public static int keychains;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String exit = "", name = "";
		
		int choice, 
			key, 
			base_shipping = 5, 
			per_keychain_shipping = 1, 
			price_per_keychain = 10;
		
		double tax = 8.25/100;
		
		while(!exit.equalsIgnoreCase("exit")) 
		{
		System.out.println("Ye Olde Keychain Shoppe\n\n1.Add Keychains to Order\n2.Remove Keychains from Order\n3.View Current Order\n4.Checkout");
		System.out.print("\n\nPlease enter your choice: ");
		choice = input.nextInt();
		
		if(choice == 1)
		{
			System.out.println("You have "+getKeychains()+" keychains. How many to add?");
			key = input.nextInt();
			if (key > 0)
			{
			add_keychains(key);
			System.out.println("You now have "+getKeychains() +" keychains.");
			} else {
				System.out.println("Invalid");
			}
			
		} else if(choice == 2) {
			System.out.println("You have "+getKeychains()+" keychains.How many to remove?");
			key = input.nextInt();
			if (key < getKeychains())
			{
			remove_keychains(key);
			System.out.println("You now have "+getKeychains() +" keychains.");
			} else if (key > getKeychains() || key < 0){
				System.out.println("Invalid");
			}
			
		} else if(choice == 3) {
			view_order(getKeychains(), price_per_keychain, tax, base_shipping, per_keychain_shipping);
			
		} else if(choice == 4){
		
			checkout(getKeychains(), price_per_keychain, tax, base_shipping, per_keychain_shipping);
			exit = "exit";
			
		} else {
			System.out.println("Invalid");
			
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
	
	public static void view_order(int num_keychains, double price_per_keychain, double tax, int base_shipping, int per_keychain_shipping)
	{
		DecimalFormat formatter = new DecimalFormat("#0.00");
		num_keychains = getKeychains();
		double price = num_keychains* price_per_keychain;
		double totalShipping = base_shipping + (num_keychains -1)* (per_keychain_shipping);
		double withShipping = price + totalShipping;
		double finalPrice = withShipping* ((100 + tax)/100);
		System.out.println("You have "+num_keychains + " keychains. ");
		   System.out.println( "Keychains cost $" + price_per_keychain + " each." );
	         System.out.println( "Shipping charges amount to $" + totalShipping + "." );
	         System.out.println( "Total cost before tax is $" + withShipping + "." );
	         System.out.println( "Total cost after tax in $" + formatter.format(finalPrice) + "." );
	
	}
	
	public static  void checkout(int num_keychains, double price_per_keychain, double tax, int base_shipping, int per_keychain_shipping)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("CHECKOUT");
		System.out.println("What is your name?");
		String name = input.nextLine();
		view_order(num_keychains, price_per_keychain, tax, base_shipping, per_keychain_shipping);
		System.out.println("Thanks for your order, "+name+"!");
		
	}

}
