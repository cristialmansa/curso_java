package graficos;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;

public class Procesador_II {

	public static void main(String[] args) {
		
		MenuProcesador_II mimarco = new MenuProcesador_II();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MenuProcesador_II extends JFrame {
	
	public MenuProcesador_II() {
		
		setBounds(500, 300, 550, 400);
		
		LaminaProcesador_II milamina = new LaminaProcesador_II();
		
		add(milamina);
		
		setVisible(true);
		
	}
}

class LaminaProcesador_II extends JPanel {
	
	public LaminaProcesador_II() {
		
		setLayout(new BorderLayout());
		
		JPanel laminamenu = new JPanel();
		
		JMenuBar mibarra = new JMenuBar();
		//-----------------------------------------------------------------------
		
		fuente = new JMenu("Fuente");
		
		estilo = new JMenu("Estilo");
		
		tamagno = new JMenu("Tamaño");
		//-----------------------------------------------------------------------
		
		configura_menu("Arial", "fuente", "Arial", 9, 10);
		
		configura_menu("Times New Roman", "fuente", "Times New Roman", 9, 10);
		
		configura_menu("Verdana", "fuente", "Verdana", 9, 10);
		
		//-----------------------------------------------------------------------
		
		configura_menu("Negrita", "estilo", "", Font.BOLD, 1);
		
		configura_menu("Cursiva", "estilo", "", Font.ITALIC, 1);
		
		//-----------------------------------------------------------------------
		
		configura_menu("12", "tamaño", "", 9, 12);
		
		configura_menu("16", "tamaño", "", 9, 16);
		
		configura_menu("20", "tamaño", "", 9, 20);
		
		configura_menu("24", "tamaño", "", 9, 24);
		
		
		
		
		mibarra.add(fuente);
		
		mibarra.add(estilo);
		
		mibarra.add(tamagno);
		
		laminamenu.add(mibarra);
		
		add(laminamenu, BorderLayout.NORTH);
		
		miarea = new JTextPane();
		
		add(miarea, BorderLayout.CENTER);
		
		
	}
	
	public void configura_menu(String rotulo, String menu, String tipo_letra,
			int estilos, int tam) {
		
		JMenuItem elem_menu = new JMenuItem(rotulo);
		
		if(menu=="fuente") {
			
			fuente.add(elem_menu);
			
		} else if (menu=="estilo") {
			
			estilo.add(elem_menu);
			
		} else if (menu=="tamaño") {
			
			tamagno.add(elem_menu);
		}
		
		elem_menu.addActionListener(new Gestiona_Eventos(rotulo, tipo_letra, estilos, tam));
		
	}
	
	private class Gestiona_Eventos implements ActionListener {
		
		String tipo_texto, menu;
		
		int estilo_letra, tamagno_letra;
		
		Gestiona_Eventos(String elemento, String texto2, int estilo2, int tam_letra){
			
			tipo_texto = texto2;
			
			estilo_letra = estilo2;
			
			tamagno_letra = tam_letra;
			
			menu = elemento;
			
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			
			letras = miarea.getFont();
			
			if (menu == "Arial" || menu == "Times New Roman" || menu == "Verdana") {
				
				estilo_letra = letras.getStyle();
				
				tamagno_letra = letras.getSize();
				
				
			} else if (menu == "Cursiva" || menu == "Negrita") {
				
				if (letras.getStyle()==1 || letras.getStyle() ==2) {
					
					estilo_letra = 3;
				}
				
				tipo_texto = letras.getFontName();
				
				tamagno_letra = letras.getSize();
				
			} else if (menu == "12" || menu == "16" || menu == "20" || menu == "24") {
				
				estilo_letra = letras.getStyle();
				
				tipo_texto = letras.getFontName();
				
			}
			
			miarea.setFont(new Font(tipo_texto, estilo_letra, tamagno_letra));
			
			System.out.println("Tipo: " + tipo_texto + " Estilo: " + estilo_letra 
					+ " Tamaño: " + tamagno_letra);
			
		}
		
		
	}
	
	JTextPane miarea;
	
	JMenu fuente, estilo, tamagno;
	
	Font letras;
}