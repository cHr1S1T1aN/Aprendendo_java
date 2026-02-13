public class CalculadoraTest {

    public static void main(String[] args) {

        int a = Calculadora.lerNumero("Digite o primeiro: ");
        int b = Calculadora.lerNumero("Digite o segundo: ");

        int r = Calculadora.somar(a, b);
	int r1 = Calculadora.subtrair(a, b);
	double r2 = Calculadora.dividir(a, b);
	int r3 = Calculadora.multiplicar(a, b);
        System.out.println("Soma: " + r);
	System.out.println("Subtração: " + r1);
	System.out.println("Divisão: " + r2);
	System.out.println("Multiplicação: " + r3);
    }
}
