public class TestandoArrays {

    public static void modifyArray(int[] arr) {
        arr[0] = 100; // altera o original
    }

    public static void modifyElement(int x) {
        x = 100; // NÃO altera o original
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3};

        modifyArray(numeros);
        System.out.println(numeros[0]); // 100

        modifyElement(numeros[1]);
        System.out.println(numeros[1]); // 2
    }
}