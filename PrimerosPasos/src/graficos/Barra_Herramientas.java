package graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class Barra_Herramientas {

	public static void main(String[] args) {
		
		Marco_Barra mimarco = new Marco_Barra();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class Marco_Barra extends JFrame {
	
	public Marco_Barra() {
		
		setTitle("Marco con barra");
		
		setBounds(500,300,600,450);
		
		lamina = new JPanel();
		
		add(lamina);
		
		//configuración de acciones
		
		Action accionAzul = new AccionColor("Azul", new ImageIcon("src/graficos/imagen.png"), Color.BLUE);
		
		Action accionAmarillo = new AccionColor("Amarillo", new ImageIcon("src/graficos/imagen.png"), Color.YELLOW);
		
		Action accionRojo = new AccionColor("Rojo", new ImageIcon("src/graficos/imagen.png"), Color.RED);
		
		Action accionSalir = new AbstractAction("Salir", new ImageIcon("src/graficos/imagen.png")) {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
			
		};
		
		JMenu menu = new JMenu("Color");
		
		menu.add(accionAzul);
		
		menu.add(accionAmarillo);
		
		menu.add(accionRojo);
		
		JMenuBar barra_menus = new JMenuBar();
		
		barra_menus.add(menu);
		
		setJMenuBar(barra_menus);
		
		//Construcción de la barra de herramientas 
		
		JToolBar barra = new JToolBar();
		
		barra.add(accionAzul);
		
		barra.add(accionAmarillo);
		
		barra.add(accionRojo);
		
		barra.addSeparator();
		
		barra.add(accionSalir);
		
		add(barra, BorderLayout.NORTH);
		
	}
	
	private class AccionColor extends AbstractAction {
		
		public AccionColor(String nombre, Icon icono, Color c) {
			
			putValue(Action.NAME, nombre);
			
			putValue(Action.SMALL_ICON, icono);
			
			putValue(Action.SHORT_DESCRIPTION, "Color de fondo..." + nombre);
			
			putValue("Color", c);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			Color c = (Color) getValue("Color");
			
			lamina.setBackground(c);
			
		}
		
		
	}
	
	JPanel lamina;
}
