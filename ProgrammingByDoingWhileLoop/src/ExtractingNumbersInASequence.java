import java.util.Random;

public class ExtractingNumbersInASequence {
	public static void main(String[] args) {
	int odd=0,even=0,sixdigit,extract=0,remain;
Random r = new Random();

sixdigit = 1+r.nextInt(99999);

System.out.println(sixdigit);

while(sixdigit>0) {
	remain=sixdigit%10;
	if(remain%2==0&&remain!=0) {
		even++;
	} else if(remain!=0) {
		odd++;
	}
				
			sixdigit = sixdigit/10;
		//System.out.println(sixdigit);
			}

System.out.println("\n"+even+"\n"+odd);

/*if(extract%2==0) {
	even++;
} else if(extract%2!=0) {
	odd++;
}*/

	
	}}
