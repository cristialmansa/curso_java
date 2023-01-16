package graficos;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;

public class MarcoMEmergente {

	public static void main(String[] args) {
		
		MarcoEmergenteM mimarco = new MarcoEmergenteM();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoEmergenteM extends JFrame {
	
	public MarcoEmergenteM() {
		
		setBounds(100,100,300,250);
		
		LaminaEmergenteM milamina = new LaminaEmergenteM();
		
		add(milamina);
		
		setVisible(true);
	}
}

class LaminaEmergenteM extends JPanel  {
	
	public LaminaEmergenteM() {
		
		setLayout(new BorderLayout());
		
		JPanel laminamenu = new JPanel();
		
		JMenuBar mibarra = new JMenuBar();
		
		JMenu fuente = new JMenu("Fuente");
		
		JMenu estilo = new JMenu("Estilo");
		
		JMenu tamagno = new JMenu("Tamaño");
		
		mibarra.add(fuente);
		
		mibarra.add(estilo);
		
		mibarra.add(tamagno);
		
		laminamenu.add(mibarra);
		
		add(laminamenu, BorderLayout.NORTH);
		
		JTextPane miarea = new JTextPane();
		
		add(miarea, BorderLayout.CENTER);
		
		//------------------------------------------------------------------------
		
		JPopupMenu emergente = new JPopupMenu();
		
		JMenuItem opcion1 = new JMenuItem("Opción 1");
		
		JMenuItem opcion2 = new JMenuItem("Opción 2");
		
		JMenuItem opcion3 = new JMenuItem("Opción 3");
		
		emergente.add(opcion1);
		
		emergente.add(opcion2);
		
		emergente.add(opcion3);
		
		miarea.setComponentPopupMenu(emergente);
		
		
	}
}