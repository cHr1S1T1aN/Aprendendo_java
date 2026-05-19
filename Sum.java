public class Sum
{
	public static void main( String [] args )
	{
		int Total = 0;
		
		for(int number = 2; number <= 20; number += 2)
		{
		Total += number;
		}
		System.out.printf("Sum is %d\n" , Total );
	}
}