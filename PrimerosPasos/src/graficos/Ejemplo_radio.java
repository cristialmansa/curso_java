package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejemplo_radio {

	public static void main(String[] args) {
		
		Marco_radio mimarco = new Marco_radio();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class Marco_radio extends JFrame {
	
	public Marco_radio() {
		
		setVisible(true);
		
		setBounds(550,300,500,350);
		
		Lamina_radio milamina = new Lamina_radio();
		
		add(milamina);
	}
}

class Lamina_radio extends JPanel {
	
	public Lamina_radio() {
		
		setLayout(new BorderLayout());
		
		texto = new JLabel("En un lugar de la Mancha de cuyo nombre...");
		
		texto.setFont(new Font("Serif", Font.PLAIN, 12));
		
		add(texto, BorderLayout.CENTER);
		
		lamina_botones = new JPanel();
		
		migrupo = new ButtonGroup();
		
		Colocar_botones("Pequeño", false, 10);
		
		Colocar_botones("Mediano", true, 12);
		
		Colocar_botones("Grande", false, 18);
		
		Colocar_botones("Muy grande", false, 24);
		
		add(lamina_botones, BorderLayout.SOUTH);
		
	}
	
	public void Colocar_botones(String nombre, boolean seleccionado, int tamagno) {
		
		JRadioButton boton = new JRadioButton(nombre, seleccionado);
		
		migrupo.add(boton);
		
		lamina_botones.add(boton);
		
		ActionListener mievento = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				texto.setFont(new Font("Serif", Font.PLAIN, tamagno));
				
			}
			
		};
		
		boton.addActionListener(mievento);
		
	}
	
	
	
	private JLabel texto; 
	
	private JRadioButton boton1, boton2, boton3, boton4;
	
	private ButtonGroup migrupo;
	
	private JPanel lamina_botones;
	
}