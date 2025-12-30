public class Numeros{

	int [] valores;
	
	Numeros(int qtd) {
		valores = new int[qtd];
	}
	void lerNumeros(java.until.Scanner sc) {
		for (int i=0;i < valores.length;i++){
			System.out.println("digite um valor " + (i+1) + ": ");
			valores[i] = sc.nextInt();
	}
	int soma() {
		int s = 0;
		for (int i = 0;i < valores.lenght;i++){
			s += valores[i];
		}
	}
	double media() {
		return (double) soma() / valores.lenght;
	}
	int maior(){
		int maior = valores[0];	
		for (int i = 0;i < valores.lenght;i++){
			if (valores[i] > maior){
				maior = valores[i];
				}
		}
		return maior;
	}
}