/*for ( <stuff> )
{
    if ( <something with modulus> )
    {
        System.out.println( <something> );
    }
    else
    {
        System.out.println( <something different> );
    }
}*/

public class NoticingEvenNumbers {
	
public static void main(String[] args)

{
	
int x;

for (x = 1; x<=20; x++)
{
if ( x%2 == 0 ) 
{
	System.out.println(x + "<");
} else {
	
	System.out.println(x);
}
}

}
}
