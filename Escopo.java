public class Escopo {

    static int numero = 100;
    static final double PI = 3.14159;

    public void testeEscopo() {
        int numero = 9;
        System.out.println("Variável local: " + numero);
        System.out.println("Campo da classe: " + Escopo.numero);
    }

    public double calcularArea(double lado) {
        return lado * lado; // quadrado
    }

    public double calcularArea(double base, double altura) {
        return base * altura; // retângulo
    }

    public double calcularArea(int raio) {
        return PI * (raio * raio); // círculo
    }
}
