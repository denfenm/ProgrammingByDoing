import java.util.Scanner;

public class KeychainsForSale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String exit = "";
		int choice;
		while(!exit.equalsIgnoreCase("exit")) 
		{
		System.out.println("Ye Olde Keychain Shoppe\n\n1.Add Keychains to Order\n2.Remove Keychains from Order\n3.View Current Order\n4.Checkout");
		System.out.print("\n\nPlease enter your choice: ");
		choice = input.nextInt();
		
		if(choice == 1)
		{
			add_keychains();
		} else if(choice == 2) {
			remove_keychains();
		} else if(choice == 3) {
			view_order();
		} else {
			checkout();
			exit = "exit";
		}
		
		}
		
	}
	
	public static void add_keychains()
	{
		System.out.println("ADD KEYCHAINS");
	}
	
	public static void remove_keychains()
	{
		System.out.println("REMOVE KEYCHAINS");
	}
	
	public static  void view_order()
	{
		System.out.println("VIEW ORDER");
	}
	
	public static  void checkout()
	{
		System.out.println("CHECKOUT");
	}
	
	

}
