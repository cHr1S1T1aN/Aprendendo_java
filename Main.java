import java.util.Scanner;
public class Main{
	static Scanner sc = new Scanner(System.in);
	static int contador(){
		int num1=0;
		int [] numeros = new int[5];
		int soma = 0;

		for(num1=num1;num1 < 5;num1++){
		System.out.println("digite 5 numeros: ");
		numeros[num1] = sc.nextInt();	
		soma += numeros[num1];
		}
		return soma;		
	}
	public static void main(String[]args) {
		int resultado = contador();
        	System.out.println("Resultado: " + resultado);
       		sc.close();
	}	
}