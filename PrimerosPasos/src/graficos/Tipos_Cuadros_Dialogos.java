package graficos;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;

public class Tipos_Cuadros_Dialogos {

	public static void main(String[] args) {
		
		Cuadros_Dialogos mimarco = new Cuadros_Dialogos();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class Cuadros_Dialogos extends JFrame {
	
	public Cuadros_Dialogos() {
		
		setBounds(500,300,400,250);
		
		add(new Lamina_Cuadros_Dialogos());
	}
}

class Lamina_Cuadros_Dialogos extends JPanel {
	
	public Lamina_Cuadros_Dialogos() {
		
		boton1 = new JButton("boton 1");
		
		boton2 = new JButton("boton 2");
		
		boton3 = new JButton("boton 3");
		
		boton4 = new JButton("boton 4");
		
		boton1.addActionListener(new Accion_botones());
		boton2.addActionListener(new Accion_botones());
		boton3.addActionListener(new Accion_botones());
		boton4.addActionListener(new Accion_botones());
		
		add(boton1);
		
		add(boton2);
		
		add(boton3);
		
		add(boton4);
	}
	
	private class Accion_botones implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == boton1) {
				
				//System.out.println("Has pulsado el botón 1");
				
				//JOptionPane.showMessageDialog(Lamina_Cuadros_Dialogos.this, "Mensaje de prueba");
				
				JOptionPane.showMessageDialog(Lamina_Cuadros_Dialogos.this, "Mensaje de prueba",
						"Advertencia", 0);
				
			} else if (e.getSource() == boton2) {
				
				//System.out.println("Has pulsado el botón 2");
				
				JOptionPane.showInputDialog(Lamina_Cuadros_Dialogos.this, "Introduce nombre",
						"Introducción datos", 2);
				
			} else if (e.getSource() == boton3) {
				
				//System.out.println("Has pulsado el botón 3");
				
				JOptionPane.showConfirmDialog(Lamina_Cuadros_Dialogos.this, "Elige opción",
						"V Confirmar", 0);
				
			} else {
				
				//System.out.println("Has pulsado el botón 4");
				
				JOptionPane.showOptionDialog(Lamina_Cuadros_Dialogos.this, "Elige",
						"V de opciones", 1, 1, null, null, null);
				
			}
			
		}
	}
	
	JButton boton1, boton2, boton3, boton4;
}