package wallapop.compraventa;

public class Producto {
	// Atributos
	private int codigo;
	private static int contadorCod;
	private String nombre;
	private double precio;
	private EstadoProducto estado;
	
	// Constructores
	public Producto(String nombre,  String estado, int codigo) {
		this.codigo = contadorCod+1;
		contadorCod++;
		this.nombre = nombre;
		this.precio = 0.0;
		this.estado = EstadoProducto.valueOf(estado);
		
	}
	
	
	public Producto(String nombre,  String estado, double precio) {
		this.codigo = codigo;
		
		
		this.nombre = nombre;
		this.precio = precio;
		this.estado = EstadoProducto.valueOf(estado);
	}


	public static int getCodigo() {
		return codigo;
	}


	public static void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return this.nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecio() {
		return this.precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public EstadoProducto getEstado() {
		return this.estado;
	}


	public void setEstado(String estado) {
		this.estado = EstadoProducto.valueOf(estado);
	}
	
	
	
	
}
