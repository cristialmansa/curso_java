package excepciones_I;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Leer_Imagen {

	public static void main(String[] args) {
		
		MarcoImagen mimarco = new MarcoImagen();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoImagen extends JFrame {
	
	public MarcoImagen() {
		
		setTitle("Marco con imagen");
		
		setBounds(750,300,300,200);
		
		LaminaConImagen milamina = new LaminaConImagen();
		
		add(milamina);
	}
}

class LaminaConImagen extends JPanel {
	
	public LaminaConImagen() {
		
		try {
			
			imagen = ImageIO.read(new File("src/excepciones_I/imagen.png"));
			
		}catch(IOException e) {
			
			System.out.println("La imagen no se encuentra");
		}
		
		
	}
	
	public void paintComponent(Graphics g) throws NullPointerException {
		
		super.paintComponent(g);
		
		try {
		
			int anchuraImagen = imagen.getWidth(this);
			
			int alturaImagen = imagen.getHeight(this);
			
			g.drawImage(imagen, 0, 0, null);
			
			for (int i = 0; i<300; i++) {
				
				for (int j = 0; j<200; j++) {
					
					if(i+j>0) {
						
						g.copyArea(0, 0, anchuraImagen, alturaImagen, anchuraImagen*i, alturaImagen*j);
					}
				}
			} 
		}catch (NullPointerException e) {
				
			g.drawString("No se ha podido cargar la imagen", 10, 10);
		}
	}
	
	private Image imagen;
}