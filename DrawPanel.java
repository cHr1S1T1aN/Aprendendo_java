import javax.swing.JPanel;
import java.awt.Graphics;

public class DrawPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        int step = 20; // distância entre as linhas

        // Desenha linhas cruzadas criando o efeito
        for (int i = 0; i <= width; i += step) {

            // cima → direita
            g.drawLine(i, 0, width, height - i);

            // esquerda → baixo
            g.drawLine(0, i, width - i, height);

            // baixo → esquerda
            g.drawLine(i, height, 0, height - i);

            // direita → cima
            g.drawLine(width, i, i, 0);
        }
    }
}
