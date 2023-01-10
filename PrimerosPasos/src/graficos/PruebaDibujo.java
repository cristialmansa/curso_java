package graficos;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class PruebaDibujo {

	public static void main(String[] args) {
		
			MarcoConDibujos mimarco = new MarcoConDibujos();
			
			mimarco.setVisible(true);
			
			mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConDibujos extends JFrame {
	
	public MarcoConDibujos() {
		
		setTitle("Prueba de dibujo");
		
		setSize(400,400);
		
		LaminaConFiguras milamina = new LaminaConFiguras();
		
		add(milamina);
		
	}
}

class LaminaConFiguras extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200.25, 150);
		
		g2.draw(rectangulo);
		
		Ellipse2D elipse = new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		
		g2.draw(elipse);
		
		g2.draw(new Line2D.Double(100, 100, 300, 250));
		
		double CentroenX = rectangulo.getCenterX();
		
		double CentroenY = rectangulo.getCenterY();
		
		double radio  = 150;
		
		Ellipse2D circulo = new Ellipse2D.Double();
		
		circulo.setFrameFromCenter(CentroenX, CentroenY, CentroenX+radio,
				CentroenY+radio);
		
		g2.draw(circulo);
	
	}
}