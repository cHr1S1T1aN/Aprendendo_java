public class TestandoEscopo {

    public static void main(String[] args) {

        Escopo obj = new Escopo();

        // Teste de escopo
        obj.testeEscopo();

        // Teste das áreas
        double areaQuadrado = obj.calcularArea(5.0);
        double areaRetangulo = obj.calcularArea(4.0, 6.0);
        double areaCirculo = obj.calcularArea(3);

        System.out.println("Área do quadrado: " + areaQuadrado);
        System.out.println("Área do retângulo: " + areaRetangulo);
        System.out.println("Área do círculo: " + areaCirculo);
    }
}
