package graficos;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;

public class LibreDisposicion {

	public static void main(String[] args) {
		
		MarcoLibre mimarco = new MarcoLibre();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoLibre extends JFrame {
	
	public MarcoLibre() {
		
		setBounds(450,350,600,400);
		
		LaminaLibre milamina = new LaminaLibre();
		
		add(milamina);
		
		setVisible(true);
	}
}

class LaminaLibre extends JPanel {
	
	public LaminaLibre() {
		
		setLayout(new EnColumnas());
		
		/*JButton boton1 = new JButton("boton 1");
		
		JButton boton2 = new JButton("boton 2");
		
		boton1.setBounds(500, 300, 120, 25);
		
		boton2.setBounds(200, 100, 120, 25);
		
		add(boton1);
		
		add(boton2);*/
		
		JLabel nombre = new JLabel("Nombre: ");
		
		JLabel apellido = new JLabel("Apellido: ");
		
		JLabel edad = new JLabel("Edad: ");
		
		JLabel telefono = new JLabel("Teléfono: ");
		
		JTextField c_nombre = new JTextField();
		
		JTextField c_apellido = new JTextField();
		
		JTextField c_edad = new JTextField();
		
		JTextField c_telefono = new JTextField();
		
		/*nombre.setBounds(20, 20, 80, 10);
		
		c_nombre.setBounds(100, 17, 100, 20);
		
		apellido.setBounds(20, 60, 80, 15);
		
		c_apellido.setBounds(100, 55, 100, 20);*/
		
		add(nombre);
		
		add(c_nombre);
		
		add(apellido);
		
		add(c_apellido);
		
		add(edad);
		
		add(c_edad);
		
		add(telefono);
		
		add(c_telefono);
		
	}
}

class EnColumnas implements LayoutManager {

	@Override
	public void addLayoutComponent(String name, Component comp) {
		
		
	}

	@Override
	public void removeLayoutComponent(Component comp) {
		
		
	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {
		
		return null;
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		
		return null;
	}

	@Override
	public void layoutContainer(Container micontenedor) {
		
		int d = micontenedor.getWidth();
		
		x = d/2;
	
		int contador = 0;
		
		int n = micontenedor.getComponentCount();
		
		for (int i=0;i<n;i++) {
			
			contador++;
			
			Component c = micontenedor.getComponent(i);
			
			c.setBounds(x-100, y, 100, 20);
			
			x+=100;
			
			if (contador % 2 == 0) {
				
				x = d/2;
				
				y+=40;
			}
		}
	}
	
	private int x;
	
	private int y = 20;
}