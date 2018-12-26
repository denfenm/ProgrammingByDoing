
public class MultiplicationTable {

	public static void main(String[] args)
	{
	
	
		System.out.println("x  | 1\t2\t3\t4\t5\t6\t7\t8\t9 ");
		System.out.println("===+=================================================================");
	
		for(int x = 1; x <= 12; x++)
		{
			System.out.print(x+"  |"); // dub
			
			for(int j = 1; j <= 9; j++)
			{
				System.out.print(x*j+"\t"); //dub dap dap dap dap dap dap
			}
			System.out.println(); //dub dap dap dap dap dap dap
			                      //deb
	}
	}}