//  GradeBook.java
// Classe GradeBook que resolve o problema da média da classe
// utilizando repetição controlada por contador.
import java.util.Scanner;

public class GradeBook
{
	private String courseName;
	private int total; // soma das notas
	private int gradeCounter; // número de notas inseridas
	private int aCount; // contagem de notas A
	private int bCount; // contagem de notas B
	private int cCount; // contagem de notas C
	private int dCount; // contagem de notas D
	private int fCount; // 

	public GradeBook( String name )
	{
		courseName = name;
	}
	public String getCourseName()
	{
		return courseName;
	}
	public void setCourseName( String name )
	{
		courseName = name;
	}//manipula o nome do curso
	public void displayMessage()
	{
		System.out.println("Bem vindo,o nome do seu curso é: " + getCourseName() );
	}//utiliza o nome do curso 	
	public void inputGrades()
	{
		Scanner input = new Scanner( System.in );
		int grade;
		System.out.printf("%s\n%s\n %s\n %s\n",
 		"Enter the integer grades in the range 0100." ,
		"Type the endoffile indicator to terminate input:" ,
		"On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
		"On Windows type <Ctrl> z then press Enter" );
		
		while ( input.hasNext() )
		{
			grade = input.nextInt();
			total += grade;
			++gradeCounter;
			incrementLetterGradeCounter( grade );
		}
	}
	public void incrementLetterGradeCounter( int grade )
	{
		switch( grade/10 )
		{
		case 9:
		case 10:
			++aCount;
			break;
		case 8:
			++bCount;
			break;
		case 7:
			++cCount;
			break;
		case 6:
			++dCount;
			break;
		default:
			++fCount;
			break;
		}
	}
	public void displayGradeReport()
	{
		System.out.println("\nGrade Report:");
		if( gradeCounter != 0 )
		{
			double average = total / gradeCounter;
			System.out.printf( "Total of the %d grades entered is %d\n",
			gradeCounter, total );
			System.out.printf( "Class average is %.2f\n", average );
			System.out.printf( "%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
			"Number of students who received each grade:",
			"A: ", aCount, // exibe número de notas A
			"B: ", bCount, // exibe número de notas B
			"C: ", cCount, // exibe número de notas C
			"D: ", dCount, // exibe número de notas D
			"F: ", fCount ); // exibe número de notas F
		} // fim do if
		else
			System.out.println("No grades for media");
	}
}
			
		






