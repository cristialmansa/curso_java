package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class PruebaArea {

	public static void main(String[] args) {
		
		MarcoPruebaArea mimarco = new MarcoPruebaArea();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class MarcoPruebaArea extends JFrame {
	
	public MarcoPruebaArea() {
		
		setTitle("Probando Área de texto");
		
		setBounds(500,300,500,350);
		
		setLayout(new BorderLayout());
		
		laminaBotones = new JPanel();
		
		botonInsertar = new JButton("Insertar");
		
		botonInsertar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				areaTexto.append("En un lugar de la Mancha de cuyo nombre" +
				" no quiero acordarme...");
				
			}
			
			
		});
		
		laminaBotones.add(botonInsertar);
		
		botonSaltoLinea = new JButton("Salto línea");
		
		botonSaltoLinea.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				boolean saltar =! areaTexto.getLineWrap();
				
				areaTexto.setLineWrap(saltar);
				
				/*if(saltar == true) {
					
					botonSaltoLinea.setText("No hay salto");
					
				} else {
					
					botonSaltoLinea.setText("Salto Linea");
					
				}*/
				botonSaltoLinea.setText(saltar ? "Quitar salto" : "Salto Linea");
			}
			
		});
		
		laminaBotones.add(botonSaltoLinea);
		
		add(laminaBotones, BorderLayout.SOUTH);
		
		areaTexto = new JTextArea(8,20);
		
		laminaConBarras = new JScrollPane(areaTexto);
		
		add(laminaConBarras, BorderLayout.CENTER);
	
	}
	
	private JPanel laminaBotones;
	
	private JButton botonInsertar, botonSaltoLinea;
	
	private JTextArea areaTexto;
	
	private JScrollPane laminaConBarras;
	
}