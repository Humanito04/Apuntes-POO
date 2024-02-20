package cuentaCorriente;

public class Gestor {
	//Atributos
	private String nombre;
	private String telefono;
	private double importeMaximo;
	
	//Constructores
	
	public Gestor(String nombre, String telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.importeMaximo = 10000.00;
	}
	public Gestor(String nombre, String telefono,double importeMaximo) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.importeMaximo = importeMaximo;
	}
	//Getters y setters

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return this.telefono;
	}


	public double getImporteMaximo() {
		return this.importeMaximo;
	}

	public void setImporteMaximo(double importeMaximo) {
		this.importeMaximo = importeMaximo;
	}
	
	
	//Métodos
	public void mostrarInformacion() {
		System.out.printf("Nombre: %s \n", this.nombre);
		
	}
}
