package graficos;

import java.awt.*;

import java.awt.geom.*;

import javax.swing.*;


public class TrabajandoColores {

	public static void main(String[] args) {
		
		MarcoConColor mimarco = new MarcoConColor();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class MarcoConColor extends JFrame {
	
	public MarcoConColor() {
		
		setTitle("Prueba con colores");
		
		setSize(400, 400);
		
		LaminaConColor milamina = new LaminaConColor();
		
		add(milamina);
		
		milamina.setBackground(SystemColor.window);
	}
}

class LaminaConColor extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		//dibujo de rectángulo
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
		
		g2.setPaint(Color.BLUE);
		
		g2.draw(rectangulo);
		
		g2.setPaint(Color.RED);
		
		g2.draw(rectangulo);
		
		g2.fill(rectangulo);
		
		//dibujo de elipse
		
		Ellipse2D elipse = new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		
		Color micolor = new Color(100, 50, 200);
		
		g2.setPaint(micolor);
		
		g2.fill(elipse);
		
		g2.draw(elipse);
	}
}
