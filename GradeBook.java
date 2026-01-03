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
}
	