import java.util.Scanner;

public class AlphabeticalOrderCompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner input = new Scanner(System.in);
String ln;
//int c,j,s,y;
System.out.print("What's your last name? ");

ln = input.nextLine();
//important! put IgnoreCase so that user can type with lowercase
if(ln.compareToIgnoreCase("Carswell")<=0) {
	System.out.print("you dont have to wait long "+ln);
} else if(ln.compareToIgnoreCase("Jones")<=0) {
	System.out.print("thats not bad"+ln);
}else if(ln.compareToIgnoreCase("Smith")<=0) {
		System.out.print("looks like a bit of a wait "+ln);
} else if(ln.compareToIgnoreCase("Young")<=0) {
	System.out.print("its gonna be awhile "+ln);
} else {
	System.out.print("not going anywhere in awhile "+ln);
} 
/*c = ln.compareTo("Carswell");
j = ln.compareTo("Jones");
s= ln.compareTo("Smith");
y= ln.compareTo("Young");

if(c<=0) {
	System.out.println("you dont have to wait long "+ln);
} else if(j<=0) {
	System.out.println("thats not bad"+ln);
}else if(s<=0) {
		System.out.println("looks like a bit of a wait "+ln);
} else if(y<=0) {
	System.out.println("its gonna be awhile "+ln);
} else {
	System.out.println("not going anywhere in awhile "+ln);
}

*/


	}

}
