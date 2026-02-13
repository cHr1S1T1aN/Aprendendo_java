import java.util.Scanner;

public class Calculadora {

	public static int somar(int a, int b) {
        	return a + b;
   	}
	public static int subtrair(int a, int b) {
        	return a - b;
    	}
	public static double dividir(int a, int b) {
		if(b == 0){
		System.out.println("Não pode dividir por zero!");
   		return 0;
		return (double) a / b;
    	}
	public static int multiplicar(int a, int b) {
        	return a * b;
    	}
	private static final Scanner input = new Scanner(System.in);
	public static int lerNumero(String mensagem) {
        System.out.print(mensagem);
        return input.nextInt();
    }
}
