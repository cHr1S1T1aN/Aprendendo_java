import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static int[] lerNumeros(int qtd) {
        int[] nums = new int[qtd];

        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        return nums;
    }

    static int calcularSoma(int[] nums) {
        int soma = 0;

        for (int i = 0; i < nums.length; i++) {
            soma += nums[i];
        }

        return soma;
    }

    static double calcularMedia(int soma, int qtd) {
        return (double) soma / qtd;
    }

    static void resultado(int soma, double media) {
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);
    }

    public static void main(String[] args) {

        System.out.print("Quantos numeros voce quer digitar? ");
        int qtd = sc.nextInt();

        int[] nums = lerNumeros(qtd);
        int soma = calcularSoma(nums);
        double media = calcularMedia(soma, qtd);

        resultado(soma, media);

        sc.close();
    }
}