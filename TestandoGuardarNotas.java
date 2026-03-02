public class TestandoGuardarNotas
{
	private String courseName;
	private int[] grades;

	public TestandoGuardarNotas(String name,int[] gradesArray)
	{

		courseName = name;
		grades = gradesArray;
	}	




	
	public void setCourseName( String name )
	{
		courseName = name;
	}
	
	

	public String getCourseName()
	{
		return courseName;
	}
		

	public void displayMessage()
	{	
		System.out.printf("Welcome to the grade book for \n%s!\n\n",
		getCourseName() );
	}
	
		

	public void processGrade()
	{
		outputGrades();	
		
		System.out.printf("Lowest grade is %d\nHighest grade is %d\n\n",
			getMinimum(),getMaximum());
		outputBarChart();
	}

	public int getMinimum()
	{
		int lowGrade = grades[0];
		
		for( int grade : grades )
		{
			if(grade < lowGrade)
			lowGrade = grade;
		}
		return lowGrade;
	}
	
	public int getMaximum()
	{
		
		int highGrade = grades [0];
		
		for (int grade : grades)
		{
			if(grade > highGrade)
			highGrade = grade;
		}
		return highGrade;
	}
		
	public double getAverage()
	{
		int total = 0;
		for(int grade : grades)
			total += grade;
		return (double) total / grades.length;
	}
	
	public void outputBarChart()
	{
		System.out.println( "Grade distribution:" );
		//armazena frequência de notas em cada intervalo de 10 notas
		int[] frequency = new int[ 11 ];

		// para cada nota, incrementa a frequência apropriada
		for ( int grade : grades )
			++frequency[ grade / 10 ];

		// para cada frequência de nota, imprime barra no gráfico
		for ( int count = 0; count < frequency.length; count++ )
		{
		// imprime rótulo de barra ( "0009: ", …, "9099: ", "100: " )
		if ( count == 10 )
			System.out.printf( "%5d: ", 100 );
		else
			System.out.printf( "%02d%02d: ",
			count * 10, count * 10 + 9 );

		// imprime a barra de asteriscos
		for ( int stars = 0; stars < frequency[ count ]; stars++ )
		System.out.print( "*" );

		System.out.println(); // inicia uma nova linha de saída
		} // fim do for externo
	} // fim do método 128


	// gera a saída do conteúdo do array de notas
	public void outputGrades()
	{
		System.out.println( "The grades are:\n" );

		// gera a saída da nota de cada aluno
		for ( int student = 0; student < grades.length; student++ )
		System.out.printf( "Student %2d: %3d\n",
		student + 1, grades[ student ] );
	} // fim do método outputGrades
} // fim da classe GradeBook	