public class Numeros{

	int [] valores;
	
	Numeros(int qtd) {
		valores = new int[qtd];
	}
	void lerValores(java.util.Scanner sc) {
		for (int i= 0; i < valores.length; i++){
			System.out.println("digite um valor " + (i+1) + ": ");
			valores[i] = sc.nextInt();
			}
	}
	int soma() {
		int s = 0;
		for (int i = 0;i < valores.length;i++){
			s += valores[i];
		}
		return s;
	}
	double media() {
		return (double) soma() / valores.length;
	}
	int maior(){
		int maior = valores[0];	
		for (int i = 0;i < valores.length;i++){
			if (valores[i] > maior){
				maior = valores[i];
				}
		}
		return maior;
	}
}