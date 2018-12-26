import java.util.Scanner;

public class BabyNimakaEmptyThePiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);

int A=3,B=3,C=3,remove;
String choose="";

/*do
{ System.out.println("A:"+A+"\tB:"+B+"\tC:"+C+"\n\nChoose a pile");
	choose = input.next();
	
	if(choose.equalsIgnoreCase("A")) {
		System.out.print("How many to remove from pile A: ");
		remove = input.nextInt();
		A-=remove;
	} else if(choose.equalsIgnoreCase("B")) {
		System.out.print("How many to remove from pile B: ");
		remove = input.nextInt();
		B-=remove;
	} else if(choose.equalsIgnoreCase("C")) {
		System.out.print("How many to remove from pile C: ");
		remove = input.nextInt();
		C-=remove;
}
}while(A!=0||B!=0||C!=0);*/
while(A!=0||B!=0||C!=0) {
	System.out.println("A:"+A+"\tB:"+B+"\tC:"+C+"\n\nChoose a pile");
	choose = input.next();
	
	if(choose.equalsIgnoreCase("A")) {
		System.out.print("How many to remove from pile A: ");
		remove = input.nextInt();
		A-=remove;
	} else if(choose.equalsIgnoreCase("B")) {
		System.out.print("How many to remove from pile B: ");
		remove = input.nextInt();
		B-=remove;
	} else if(choose.equalsIgnoreCase("C")) {
		System.out.print("How many to remove from pile C: ");
		remove = input.nextInt();
		C-=remove;
}
}


System.out.println("A:"+A+"\tB:"+B+"\tC:"+C);
System.out.println("All piles are empty. Good job!");
}}
