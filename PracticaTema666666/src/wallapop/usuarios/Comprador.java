package wallapop.usuarios;

public class Comprador {

	private String nombre;
	private int productosComprados[];
	private double dineroDisponible;

	public Comprador(String nombre, int productosComprados[], double dineroDisponible) {
		this.nombre = nombre;
		this.productosComprados = productosComprados;
		this.dineroDisponible = dineroDisponible;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int[] productosComprados() {
		return productosComprados;
	}

	public void setProductosComprados(int productosComprados[]) {
		this.productosComprados = productosComprados;
	}

	public double getDineroDisponible() {
		return dineroDisponible;
	}

	public void setDineroDisponible(double dineroDisponible) {
		this.dineroDisponible = dineroDisponible;
	}
}
