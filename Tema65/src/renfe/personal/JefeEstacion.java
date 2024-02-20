package renfe.personal;

import java.time.LocalDateTime;

public class JefeEstacion {
	private String nombre;
	private String DNI;
	private LocalDateTime fechaNombramiento;
	
	public JefeEstacion(String nombre, String DNI) {
		this.nombre = nombre;
		this.DNI = DNI;
		this.fechaNombramiento = LocalDateTime.now();
	}
	
	
	public JefeEstacion(String nombre, String DNI, LocalDateTime fechaNombramiento) {
		this.nombre = nombre;
		this.DNI = DNI;
		this.fechaNombramiento = fechaNombramiento;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDNI() {
		return DNI;
		
	}
	
	public void setDNI(String DNI) {
		this.DNI = DNI;
	}
	
	public LocalDateTime getFechaNombramiento() {
		return fechaNombramiento;
	}
	
	public void setFechaNombramiento(LocalDateTime fechaNombramiento) {
		this.fechaNombramiento = fechaNombramiento;
	}
}
