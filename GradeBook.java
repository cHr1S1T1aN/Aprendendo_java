//  GradeBook.java
// Classe GradeBook que resolve o problema da média da classe
// utilizando repetição controlada por contador.
import java.util.Scanner;

public class GradeBook
{
	private String courseName;
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
	public void calc(){
		Scanner input = new Scanner( System.in );
		int total;
		int gradeCounter;
		int grade;
		double average;
		int alunos;
		int encerrar = 11;
		
		total = 0;
		gradeCounter = 1;
		
		System.out.println("Coloque o numero de alunos: ");
		alunos = input.nextInt();
		while (gradeCounter <= alunos ){
			System.out.println("Enter grade: ");
			grade = input.nextInt();
			total = total + grade;
			gradeCounter = gradeCounter + 1;
			System.out.println("digite 11 caso queira para o programa");
			if( grade == encerrar ){
				gradeCounter = alunos + 1;
			}
		}
			average = (double) total / alunos;
			System.out.printf( "\nTotal of the %d grades entered is %d\n",gradeCounter, total );
			System.out.printf( "Class average is %.2f\n", average );
	}
}
	