import java.util.Scanner;
public class GradeBookTest
{
	public static void main( String[] args)
	{
		Scanner input = new Scanner( System.in );
		GradeBook myGradeBook = new GradeBook("testando");
		GradeBook myGradeBook1 = new GradeBook("testando2");
		 
		System.out.println("testando o nome dos cursos: " + myGradeBook.getCourseName() );
		System.out.println("Por favor colocar um nome de um curso: ");
		String nameOfCourse = input.nextLine();
		myGradeBook.setCourseName(nameOfCourse);
		
		System.out.println("testando o nome dos cursos: " + myGradeBook1.getCourseName() );
		myGradeBook.displayMessage();
		myGradeBook.calc();
	}
}

