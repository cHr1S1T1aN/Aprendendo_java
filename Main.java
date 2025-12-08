import java.util.Scanner;
public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("Lições Java");	
		System.out.println("Digite seu nome:");
		String nome = sc.nextLine();
		System.out.println("Digite um numero:");
		int num = sc.nextInt();
		if (num % 2 == 0) {
		System.out.println("Seu numero é par");
		}else{
		System.out.println(nome+" Seu numero é impar");		
		pegando o nome e o numero digitado e mostrando se é impar ou par
		*/


		/*System.out.println("Digite um numero: ");
		int numero = sc.nextInt();
		for(numero=numero;numero < 5;numero++){
		System.out.println(numero);
		pegando um numero menor que 5 ele conta até 5
		*/
		/*System.out.println("Digite um numero: ");
		int numero = sc.nextInt();
		for(int num=10;numero <= num;numero++){
		System.out.println(numero);*/



		/*int numero = 0; //declara uma variavel
		System.out.println("digita ai um numero: ");
		numero = sc.nextInt();
		while (numero < 3){
		numero++;
		System.out.println("seu numero: "+numero);*/


		/*System.out.println("digite um numero para somar: ");
		int num1 = sc.nextInt();
		int soma = 0;
		while(num1 != 0){	
			soma = soma+num1;	
			System.out.println("digite um numero para somar: ");
			num1 = sc.nextInt();
		}	
			System.out.println("Sua soma é: " + soma);*/



		/*System.out.println("Digite um numero: ");
		int num = sc.nextInt();
		System.out.println("digite outro numero");
		int num1= sc.nextInt();
		if(num > num1){
			System.out.println(num+" é maior que: " +num1);
		} else if (num < num1){
			System.out.println(num +" é menor que: " + num1);
		} else {
			System.out.println(num+" é igual a: "+num1);
		} */

		
		System.out.println("Digite quantos numeros serão usados: ");
		int num= sc.nextInt();
		int rep = 1;
		int numeros=0;
		int somanum= 0;
		for(rep=rep;rep <= num;rep++){
			System.out.println("Digite um numero: ");
			numeros= sc.nextInt();
			somanum= numeros + somanum;
			if(rep == num){
			System.out.println("Quer adicionar mais numeros? digite 1 pra sim e 2 pra não");
				int escolha= sc.nextInt();
				if(escolha==1){
					System.out.println("digite a quantidade que quer adicionar:");
					int num1= sc.nextInt();
					num = num + num1;
				}
			}
		}
		System.out.println("resultado foi: " +somanum);
	}	
}