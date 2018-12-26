import java.util.Scanner;
public class CollatzSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start,step=0,largest=0;
		
Scanner input = new Scanner(System.in);
System.out.println("enter a number: ");
start = input.nextInt();
System.out.println("\t"+start);
while(start!=1) {
	 start = (start % 2 == 0) ? start / 2 : start * 3 + 1; /*<- shortened version of int i = {some value};
	 if(i % 2 == 0){
		   i = i / 2;
		}
		else {
		   i = i * 3 + 1;*/   //i = (condition) ? if-branch : else-branch;
	 System.out.println("\t"+start+"\t");
	 step++;
	 if (largest<start) largest=start; //to find largest number in a sequence
		} 
System.out.println("largest number is: "+largest+"\tsteps: "+step);
}}
