import java.util.Scanner;

public class Adventure2 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nextroom=1;
		String choice ="";
		while(nextroom!=0)
		{
			if(nextroom!=0)
			{
				System.out.println("Room 1");
				System.out.print("> ");
				choice = input.nextLine();
				if(choice.equals("choice 1"))
					nextroom = 2;
				else if (choice.equals("choice 2"))
					nextroom = 3;
				else
					System.out.println("ERROR");
			}
		}
		System.out.println("\nEND.");
	}
	}

