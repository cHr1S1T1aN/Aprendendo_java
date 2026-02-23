public class InitArray
{
	public static void main(String [] args)
	{
		//declara a constante
		final int ARRAY_LENGTH = 11;
		int[] array = new int [ARRAY_LENGTH];
		
		for(int counter = 1; counter < array.length; counter++)
    		array[counter] = 3 * counter;

		System.out.printf("%s%8s\n", "Index", "Value");
		
		for( int counter=0; counter < array.length; counter++)
			System.out.printf("%5d%8d\n", counter, array[ counter ]);
	}
}