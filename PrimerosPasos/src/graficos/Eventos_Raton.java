package graficos;
import javax.swing.*;
import java.awt.event.*;


public class Eventos_Raton {

	public static void main(String[] args) {
		
		MarcoRaton mimarco = new MarcoRaton();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoRaton extends JFrame {
	
	public MarcoRaton() {
		
		setVisible(true);
		
		setBounds(700,300,600,450);
		
		EventosDeRaton EventoRaton = new EventosDeRaton();
		
		addMouseMotionListener(EventoRaton);
		
	}
}


class EventosDeRaton implements MouseMotionListener {

	@Override
	public void mouseDragged(MouseEvent e) {
		
		System.out.println("Estás arrastrando");
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
		System.out.println("Estás moviendo");
		
	}
	
	
}

