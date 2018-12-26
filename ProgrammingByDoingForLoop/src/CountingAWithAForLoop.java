/*As you saw in Counting with a While Loop, a while loop can be used to to make something happen an exact number of times.

However, this isn't our best choice. while loops are designed to keep going as long as something is true. But if we know in advance how many times we want to do something, Java has a special kind of loop designed just for making a variable change values: the for loop.

Type in the following code, and get it to compile. Then answer the questions down below.*/


import java.util.Scanner;
import java.util.Random;
public class CountingAWithAForLoop
{
    public static void main( String[] args )
    {
    	
    	int x,count;
    	String message;
//        Scanner keyboard = new Scanner(System.in);
//
//        System.out.println( "Type in a message, and I'll display it five times." );
//        System.out.print( "Message: " );
//        String message = keyboard.nextLine();
//
//        for ( int n = 1 ; n <= 5 ; n = n+1 )
//        {
//            System.out.println( n + ". " + message );
//        }
//
//    }


/*for loops are best when we know in advance how many times we want to do something.

Do this ten times.
Do this five times.
Pick a random number, and do it that many times.
Take this list of items, and do it one time for each item in the list.
On the other hand, while loops are best for repeating as long as something is true:

Keep going as long as they haven't guessed it.
Keep going as long as you haven't got doubles.
Keep going as long as they keep typing in a negative number.
Keep going as long as they haven't typed in a zero.*/

//    Scanner input = new Scanner(System.in);
//
//    System.out.println( "Type in a message, and I'll display it five times." );
//    System.out.print( "Message: " );
//    String message = input.nextLine();
//
//    for ( int n = 1 ; n <= 10 ; n = n+1 )
//    {
//        System.out.println( n + ". " + message );
//    }
    System.out.println("Type something: ");
    
    Scanner input = new Scanner(System.in);
    
    message = input.nextLine();
    
    Random r = new Random();
    count = 1+r.nextInt(99);
    
    for (x = 1; x <= count; x++) {
    	System.out.println(x +". "+message);
    }
    

}
}