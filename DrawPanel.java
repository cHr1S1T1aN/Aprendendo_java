import java.awt.Graphics;
import javax.swing.JPanel;


public class DrawPanel extends JPanel
 {
 // desenha um X a partir dos cantos do painel
 public void paintComponent( Graphics g )
 {
 // chama paintComponent para assegurar que o painel seja exibido corretamente
 super.paintComponent( g );

 int width = getWidth(); // largura total
 int height = getHeight(); // altura total

 // desenha uma linha a partir do canto superior esquerdo até o inferior direito
 g.drawLine( 180, 0, width, height );

 } // fim do método paintComponent
} // fim da classe DrawPane