public class GradeBook
{
	private String courseName;
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
		System.out.println("Bem vindo,o nome do seu curso é: " + getCourseName() );
	}	 	
}
	