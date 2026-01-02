import java.util.Scanner;
public class GradeBookTest
{
	public static void main( String[] args)
	{
		Scanner input = new Scanner( System.in );
		GradeBook myGradeBook = new GradeBook();
		 
		System.out.println("Por favor colocar um nome de um curso: ");
		String nameOfCourse = input.nextLine();
		myGradeBook.setCourseName(nameOfCourse);
		myGradeBook.displayMessage();
	}
}

