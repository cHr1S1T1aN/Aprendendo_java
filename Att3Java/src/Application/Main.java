package Application;

import java.util.Locale;
import java.util.Scanner;

import DadosDasPessoas.Pessoa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Quantas pessoas serao digitadas? ");
		double altura = 0.00;
		char genero;
		int numeroDePessoas = input.nextInt();
		Pessoa[] vect = new Pessoa[numeroDePessoas];
		
		for(int i = 0; i < vect.length; i ++)  {
			
			System.out.println("Altura da " + (i + 1) + "a pessoa: ");
			altura = input.nextDouble();
			System.out.println("Genero da " + (i + 1) + "a pessoa: ");
			genero = input.next().charAt(0);
			vect[i] = new Pessoa(altura,genero);
		}
		System.out.println(vect[0].toString(vect));
		input.close();
	}

}
