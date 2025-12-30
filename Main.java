import java.util.Scanner;

public class Main {
	public static void main(Strings[]args){
	
		canner sc = new Scanner(System.in);
	
		ystem.out.println("Quantos numeros? ");
		nt qtd = sc.nextInt();
	
		umeros nums = new Numeros(qtd);
		ums.lerValores(sc);
	
		ystem.out.println("soma: " + nums.soma());
		ystem.out.println("media: " + nums.media());
		ystem.out.println("maior: " + nums.media());
		c.close();
	}
}
