package cuentaCorriente;

public class CuentaCorriente {
	//Atributos
	private String dni;
	private String nombre;
	private double saldo;
	
	private Gestor gestor;
	
	//Constructores
	public CuentaCorriente(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = 0.0;
		this.gestor = null;	
}
	public CuentaCorriente(String dni, String nombre, Gestor gestor) {
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = 0.0;
		this.gestor = gestor;
}
	//Getter y setters
			public String getDni() {
				return this.dni;
			}
			
			public void setDni(String dni) {
				this.dni = dni;
			}
			
			public String getNombre() {
				return nombre;
			}
			public void setNombre(String nombre) {
				this.nombre = nombre;
			}
			public double getSaldo() {
				return saldo;
			}
			public void setSaldo(double saldo) {
				this.saldo = saldo;
			}
			
			public Gestor getGestor() {
				return this.gestor;
			}
			
			public void setGestor(Gestor gestor) {
				this.gestor = gestor;
			}
			
// Métodos
	public void ingresar(double cantidad) {
		this.saldo +=cantidad;
		System.out.printf("Saldo actual: %.2f € \n", this.saldo );
		if (cantidad>this.saldo) {
			System.out.println("No puedes sacar dinero, pobre.");
		} 	else {
			this.saldo = saldo - cantidad;
		}
	
	}


	public void retirar(double cantidad) {
		
		boolean result = false;
	
	if(cantidad > this.saldo) {
		throw new IllegalArgumentException("No tienes saldo suficiente");
	}

		this.saldo -= cantidad;
		
	}
	

		void mostrarInformacion() {
			System.out.printf("Nombre: %s \n", this.nombre);
			System.out.printf("DNI: %s \n", this.dni);
			System.out.printf("Saldo actual: %.2f \n", this.saldo);
			System.out.printf("Gesto: %s \n", this.gestor);
	}


}
