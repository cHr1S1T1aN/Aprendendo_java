import javax.swing.JOptionPane;
public class Dialog1{
	
	public static void main( String[] args ){
		
		String name = 
		JOptionPane.showInputDialog( "Qual teu nome? ");
		if ( name != null){
		String message =
		String.format( "Welcome, %s, to Java Programming!", name );
		JOptionPane.showMessageDialog(null,message);
		}
	}
}