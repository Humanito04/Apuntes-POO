package tema7;

import java.util.Objects;

public class Persona extends Object{
	private String nombre;
	private int edad;
	private double estatura;
	
	
	
	public Persona(String nombre, int edad, double estatura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public double getEstatura() {
		return estatura;
	}



	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}



	@Override
	public String toString() {
		return "Persona [nombre=" + this.nombre 
				+", edad=" + this.edad
				+ ", estatura=" + this.estatura + "]";
	}



	@Override
	public boolean equals(Object obj) {
		// obj
		// this
		
		// Casteo la clase
		Persona otra = (Persona) obj;
		
		//Variable de resultado
		boolean result = false;
		
		// comprobación de igualdad
		if(this.nombre.equals(otra.nombre)&&
				this.edad == otra.edad &&
				this.estatura == otra.estatura) {
			result = true;
		}
		return result;
	}
	
	
}
