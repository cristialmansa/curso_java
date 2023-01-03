package poo;

public class Pruebas {

	public static void main(String[] args) {
		
		Empleados trabajador1 = new Empleados("Paco");
		
		Empleados trabajador2 = new Empleados("Ana");
		
		Empleados trabajador3 = new Empleados("Antonio");
		
		Empleados trabajador4 = new Empleados("María");
		
		trabajador1.cambiaSeccion("RRHH");
		
		System.out.println(trabajador1.devuelveDatos() + "\n" + 
		trabajador2.devuelveDatos() + "\n" + trabajador3.devuelveDatos() +
		"\n" + trabajador4.devuelveDatos());
		
		System.out.println(Empleados.dameIdsiguiente());

	}

}

class Empleados {
	
	public Empleados (String nom) {
		
		nombre = nom;
		
		seccion = "Administración";
		
		id = idSiguiente;
		
		idSiguiente++;
	}
	
	public void cambiaSeccion(String seccion) { //SETTERS
		
		this.seccion = seccion;
	}
	
	
	public String devuelveDatos() { //GETTERS
		
		return "El nombre es " + nombre + ", la sección es " + seccion + 
				" y el id es " + id;
	}
	
	public static String dameIdsiguiente() {
		
		return "El idSiguiente es: " + idSiguiente;
	}
	
	private final String nombre;
	
	private String seccion;
	
	private int id;
	
	private static int idSiguiente = 1;
	
}