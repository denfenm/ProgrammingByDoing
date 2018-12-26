/*Write a program that simulates a random fortune from a fortune cookie. You must have at least six fortunes.

For bonus points, also add randomly-chosen lotto numbers to the
 fortune. In Texas, the lotto chooses 6 numbers, each from 1-54.*/
import java.util.Random;
public class FortuneCookie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random r =new Random();

int fortune; //takleh ltk another r here!
String fortuneSays="";

fortune = 1+r.nextInt(6);
if (fortune==1) {
	fortuneSays= "ur mom gay";
} else if (fortune==2) {
	fortuneSays= "okay bos";
} else if (fortune==3) {
	fortuneSays= "abc";
} else if (fortune==4) {
	fortuneSays= "qazwsx";
} else if (fortune==5) {
	fortuneSays= "i dunno";
} else if (fortune==6) {
	fortuneSays= "uhhhhhh";
} 

System.out.println("Fortune says: "+fortuneSays);
System.out.print(1+r.nextInt(54)+""+" - ");
System.out.print(1+r.nextInt(54)+""+" - ");
System.out.print(1+r.nextInt(54)+""+" - ");
System.out.print(1+r.nextInt(54)+""+" - ");
System.out.print(1+r.nextInt(54)+""+" - ");
System.out.print(1+r.nextInt(54)+""+" - ");
System.out.print(1+r.nextInt(54)+"");
	}

}
