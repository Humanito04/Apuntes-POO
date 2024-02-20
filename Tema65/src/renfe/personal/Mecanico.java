package renfe.personal;

import renfe.personal.enumerados.EspecialidadMecanico;

public class Mecanico {
	private String nombre;
	private String telefono;
	private EspecialidadMecanico especialidad;
	
	
	
	
	public Mecanico(String nombre,String telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.especialidad = EspecialidadMecanico.FRENOS;
		
	}
	
	public Mecanico(String nombre, String telefono, String especialidad) {
		this(nombre, telefono);
		this.especialidad = EspecialidadMecanico.valueOf(especialidad);
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public EspecialidadMecanico getEspecialidad() {
		return especialidad;
	}
	
	public void setEspecialidad(String especialidad) {
		this.especialidad= EspecialidadMecanico.valueOf(especialidad);
	}

}
