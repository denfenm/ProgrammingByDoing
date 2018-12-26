import java.util.Scanner;

public class AddingValuesInALoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int user,sum=0;
Scanner input = new Scanner(System.in);

System.out.println("I will add up the numbers. enter 0 to exit"); //igt utk tulis mcm ni balik seblm letak dlm while loop
user = input.nextInt();
sum+=user;
System.out.println("total number so far is "+sum);
while(user!=0) {
	user = input.nextInt();
	sum+=user;
	System.out.println("total number so far is "+sum);
	
	;
	
}
System.out.println(sum);
	}

}*/
		
//adding integers in a sequence
int usernum,extract=0,sum;
		Scanner input = new Scanner(System.in);
		

String again="y";

	while(again.equals("y")) {
		System.out.print("type a number ranging from 1-99999. i will add them. ");
		usernum = input.nextInt();
		sum=0;
	while(usernum>0) {
		extract=usernum%10;
		usernum/=10;
		sum+=extract;}
	
	System.out.println(sum+"try again? type y");
	again = input.next();
	}}}




