import javax.swing.*;

public class peso_ideal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String genero = "";
		
		do {
			genero = JOptionPane.showInputDialog("Introduce tu género (H/M)");
			
		} while(genero.equalsIgnoreCase("H")==false && 
				genero.equalsIgnoreCase("M")==false);
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce "
				+ "altura en cm"));
		
		int pesoideal = 0; 
		
		if (genero.equalsIgnoreCase("H")) {
			pesoideal = altura-110; 
		}
		else if (genero.equalsIgnoreCase("M")) {
			pesoideal = altura-120;
		}
		
		System.out.println("Tu peso ideal es " + pesoideal + " kg");
	}

}
