import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class DrawPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2D = (Graphics2D) g;
        // Desenha 3 linhas de estrelas
        Star star = new Star(0, 0); // cria forma de estrela
        float delta = 60f; // distância entre estrelas
        float startY = 20f;

        for (int y = 0; y < 3; y++) {
            float x = 20f; // posição inicial na linha
            for (int i = 0; i < 4; i++) {
                // desenha a estrela em cada ponto
                Shape s = star.atLocation(x, startY);
                g2D.draw(s);
                x += delta;
            }
            startY += delta;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Estrelas legais!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new DrawPanel());
        frame.setVisible(true);
    }
}

class Star {
    private java.awt.geom.GeneralPath path;
    private float startX;
    private float startY;

    public Star(float x, float y) {
        this.startX = x;
        this.startY = y;
        createStar();
    }

    private void createStar() {
        path = new GeneralPath();
        path.moveTo(startX, startY);
        path.lineTo(startX + 20, startY - 5);
        path.lineTo(startX + 5, startY - 20);
        path.lineTo(startX - 5, startY - 20);
        path.lineTo(startX - 20, startY - 5);
        path.lineTo(startX - 20, startY + 5);
        path.lineTo(startX - 5, startY + 20);
        path.lineTo(startX + 5, startY + 20);
        path.lineTo(startX + 20, startY + 5);
        path.closePath();
    }

    public Shape atLocation(float x, float y) {
        startX = x;
        startY = y;
        createStar(); // recalcula a forma em nova posição
        return path;
    }
}
