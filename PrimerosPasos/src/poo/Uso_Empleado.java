package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		
		Jefatura jefe_RRHH = new Jefatura("Juan", 55000, 2006, 9, 25);
		
		jefe_RRHH.estableceIncentivo(2570);
		
		Empleado[] misEmpleados = new Empleado[6];
		
		misEmpleados[0] = new Empleado("Paco Gómez", 85000, 1990, 12, 17);
		
		misEmpleados[1] = new Empleado("Ana López", 95000, 1995, 06, 02);
		
		misEmpleados[2] = new Empleado("María Martín", 105000, 2002, 03, 15);	
		
		misEmpleados[3] = new Empleado("Antonio Fernández");
		
		misEmpleados[4] = jefe_RRHH; //Polimorfismo en acción. Principio de sustitución
		
		misEmpleados[5] = new Jefatura("María", 95000, 1999, 05, 26);
		
		Jefatura jefa_Finanzas = (Jefatura) misEmpleados[5];
		
		jefa_Finanzas.estableceIncentivo(5000);
		
		System.out.println(jefa_Finanzas.tomar_decisiones("Dar más días de vacaciones" +
		" de vacaciones"));
		
		for (Empleado e: misEmpleados) {
			e.subeSueldo(5);
		}
		
		Arrays.sort(misEmpleados);
		
		
		
		for (Empleado e: misEmpleados) {
			
			System.out.println("Nombre: " + e.dameNombre()
			+ " Sueldo: " + e.dameSueldo()
			+ " Fecha de alta: " + e.dameFechaContrato());
		}

	}

}

class Empleado implements Comparable {
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		
		nombre = nom;
		
		sueldo = sue;
		
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		
		altaContrato = calendario.getTime();
		
		++Idsiguiente;
		
		Id = Idsiguiente;
	}
	
	public Empleado(String nom) {
		
		this(nom, 30000, 2000, 01, 01);
		
	}
	
	
	public String dameNombre() { //GETTER
		
		return nombre; 
	}
	
	public double dameSueldo() { //GETTER
		
		return sueldo;
	}
	
	public Date dameFechaContrato() { //GETTER
		
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) { //SETTER
		
		double aumento = sueldo*porcentaje/100;
		
		sueldo+=aumento;
		
	}
	
	public int compareTo(Object miObjeto) {
		
		Empleado otroEmpleado = (Empleado) miObjeto;
		
		if (this.Id<otroEmpleado.Id) {
			return -1;
		}
		if (this.Id>otroEmpleado.Id) {
			return 1;
		}
		
		return 0;
		
		
	}
	
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;
	
	private static int Idsiguiente;
	
	private int Id;
	
}

class Jefatura extends Empleado implements Jefes {
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom, sue, agno, mes, dia);
			
	}
	
	public String tomar_decisiones(String decision) {
		
		return "Un miembro de la dirección ha tomado la decisión"
				+ " de: " + decision;
	}
	
	public void estableceIncentivo(double b) {
		
		incentivo = b;
	}
	
	public double dameSueldo() {
		
		double sueldoJefe = super.dameSueldo();
		
		return sueldoJefe + incentivo;
	}
	
	private double incentivo;
	
	
}

class Director extends Jefatura {
	
	public Director (String nom, double sue, int agno, int mes, int dia) {
		
		super(nom, sue, agno, mes, dia);
		
	}
	
}


