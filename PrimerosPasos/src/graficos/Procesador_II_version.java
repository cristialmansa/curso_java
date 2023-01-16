package graficos;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;

public class Procesador_II_version {

	public static void main(String[] args) {
		
		MenuProcesador_II_v2 mimarco = new MenuProcesador_II_v2();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MenuProcesador_II_v2 extends JFrame {
	
	public MenuProcesador_II_v2() {
		
		setBounds(500, 300, 550, 400);
		
		LaminaProcesador_II_v2 milamina = new LaminaProcesador_II_v2();
		
		add(milamina);
		
		setVisible(true);
		
	}
}

class LaminaProcesador_II_v2 extends JPanel {
	
	public LaminaProcesador_II_v2() {
		
		setLayout(new BorderLayout());
		
		JPanel laminamenu = new JPanel();
		
		JMenuBar mibarra = new JMenuBar();
		//-----------------------------------------------------------------------
		
		fuente = new JMenu("Fuente");
		
		estilo = new JMenu("Estilo");
		
		tamagno = new JMenu("Tamaño");
		//-----------------------------------------------------------------------
		
		configura_menu("Arial", "fuente", "Arial", 9, 10, "");
		
		configura_menu("Times New Roman", "fuente", "Times New Roman", 9, 10, "");
		
		configura_menu("Verdana", "fuente", "Verdana", 9, 10, "");
		
		//-----------------------------------------------------------------------
		
		configura_menu("Negrita", "estilo", "", Font.BOLD, 1, "bin/graficos/imagen.png");
		
		configura_menu("Cursiva", "estilo", "", Font.ITALIC, 1, "bin/graficos/imagen.png");
		
		/*JCheckBoxMenuItem negrita = new JCheckBoxMenuItem("Negrita", 
				new ImageIcon("bin/graficos/imagen.png"));
		
		JCheckBoxMenuItem cursiva = new JCheckBoxMenuItem("Cursiva", 
				new ImageIcon("bin/graficos/imagen.png"));
		
		negrita.addActionListener(new StyledEditorKit.BoldAction());
		
		cursiva.addActionListener(new StyledEditorKit.ItalicAction());
		
		estilo.add(negrita);
		
		estilo.add(cursiva);*/
		
		//-----------------------------------------------------------------------
		
		/*configura_menu("12", "tamaño", "", 9, 12, "");
		
		configura_menu("16", "tamaño", "", 9, 16, "");
		
		configura_menu("20", "tamaño", "", 9, 20, "");
		
		configura_menu("24", "tamaño", "", 9, 24, "");*/
		
		ButtonGroup tamagno_letra = new ButtonGroup();
		
		JRadioButtonMenuItem doce = new JRadioButtonMenuItem("12");
		
		JRadioButtonMenuItem dieciseis = new JRadioButtonMenuItem("16");
		
		JRadioButtonMenuItem veinte = new JRadioButtonMenuItem("20");
		
		JRadioButtonMenuItem veinticuatro = new JRadioButtonMenuItem("24");
		
		//veinticuatro.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK));
		
		tamagno_letra.add(doce);
		
		tamagno_letra.add(dieciseis);
		
		tamagno_letra.add(veinte);
		
		tamagno_letra.add(veinticuatro);
		
		doce.addActionListener(new StyledEditorKit.FontSizeAction("cambia tamaño", 12));
		
		dieciseis.addActionListener(new StyledEditorKit.FontSizeAction("cambia tamaño", 16));
		
		veinte.addActionListener(new StyledEditorKit.FontSizeAction("cambia tamaño", 20));
		
		veinticuatro.addActionListener(new StyledEditorKit.FontSizeAction("cambia tamaño", 24));
		
		tamagno.add(doce);
		
		tamagno.add(dieciseis);
		
		tamagno.add(veinte);
		
		tamagno.add(veinticuatro);
		
		//-----------------------------------------------------------------------
		
		mibarra.add(fuente);
		
		mibarra.add(estilo);
		
		mibarra.add(tamagno);
		
		laminamenu.add(mibarra);
		
		add(laminamenu, BorderLayout.NORTH);
		
		miarea = new JTextPane();
		
		add(miarea, BorderLayout.CENTER);
		
		//-----------------------------------------------------------------------
		
		
		JPopupMenu emergente = new JPopupMenu();
		
		JMenuItem negritaE = new JMenuItem("Negrita");
		
		JMenuItem cursivaE = new JMenuItem("Cursiva");
		
		negritaE.addActionListener(new StyledEditorKit.BoldAction());
		
		cursivaE.addActionListener(new StyledEditorKit.ItalicAction());
		
		
		emergente.add(negritaE);
		
		emergente.add(cursivaE);
		
		miarea.setComponentPopupMenu(emergente);
		
		//---------------------------------------------------------------------------------------
		
		JToolBar barra = new JToolBar();
		
		JButton negritaBarra = new JButton(new ImageIcon("bin/graficos/imagen.png"));
		
		JButton cursivaBarra = new JButton(new ImageIcon("bin/graficos/imagen.png"));
		
		JButton subraBarra = new JButton(new ImageIcon("bin/graficos/imagen.png"));
		
		negritaBarra.addActionListener(new StyledEditorKit.BoldAction());
		
		cursivaBarra.addActionListener(new StyledEditorKit.ItalicAction());
		
		subraBarra.addActionListener(new StyledEditorKit.UnderlineAction());
		
		barra.add(negritaBarra);
		
		barra.add(cursivaBarra);
		
		barra.add(subraBarra);
		
		barra.setOrientation(1);
		
		add(barra, BorderLayout.WEST);
		
	}
	
	public void configura_menu(String rotulo, String menu, String tipo_letra,
			int estilos, int tam, String ruta_icono) {
		
		JMenuItem elem_menu = new JMenuItem(rotulo, new ImageIcon(ruta_icono));
		
		if(menu=="fuente") {
			
			fuente.add(elem_menu);
			
			if(tipo_letra =="Arial") {
				
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Arial"));
			
			} else if (tipo_letra == "Times New Roman") {
				
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Times New Roman"));
			
			} else if (tipo_letra == "Verdana") {
				
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Verdana"));
			}
			
		} else if (menu=="estilo") {
			
			estilo.add(elem_menu);
			
			if (estilos == Font.BOLD) {
				
				elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
				
				elem_menu.addActionListener(new StyledEditorKit.BoldAction());
				
			} else if (estilos == Font.ITALIC) {
				
				elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
				
				elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
			}
			
		} else if (menu=="tamaño") {
			
			tamagno.add(elem_menu);
			
			elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambia tamaño", tam));
		}
		
		
	}
	
	
	
	JTextPane miarea;
	
	JMenu fuente, estilo, tamagno;
	
	Font letras;
}