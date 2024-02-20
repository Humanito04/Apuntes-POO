package renfe.personal;

import renfe.personal.enumerados.RangoMaquinista;

public class Maquinista {
	
	private String nombre;
	private String dni;
	private double sueldo;
	private RangoMaquinista rango;
	
	public Maquinista(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
		this.sueldo =1332.0;
		this.rango = RangoMaquinista.BRONCE;
	}

	public Maquinista(String nombre, String dni, double sueldo, String rango) {
		this.nombre = nombre;
		this.dni = dni;
		this.sueldo = sueldo;
		this.rango = RangoMaquinista.valueOf(rango);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public RangoMaquinista getRango() {
		return rango;
	}

	public void setRango(String rango) {
		this.rango = RangoMaquinista.valueOf(rango);
	}
	
	
}
