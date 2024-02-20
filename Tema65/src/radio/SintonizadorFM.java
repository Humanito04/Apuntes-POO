package radio;

public class SintonizadorFM {
	// Atributos
	private double frecuencia;

	// Constructores
	public SintonizadorFM(double frecuencia) {
		setFrecuencia(frecuencia);
	}

	// getters y setters
	public double getfrecuencia() {
		return this.frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		if (frecuencia < 80.0) {
			this.frecuencia = 80.0;
		} else if (frecuencia > 108.0) {
			this.frecuencia = 108.0;
		} else {
			this.frecuencia = frecuencia;
		}
	}
	// Métodos
	public void up() {
		this.frecuencia += 0.5;
		if (this.frecuencia > 108) {
			this.frecuencia = 80.0;
		}
	}
	public void up(int vueltas) {
		for (int i = 0; i < vueltas; i++) {
			up();
		}
	}
	public void down() {
		this.frecuencia -= 0.5;
		if (this.frecuencia < 80.0) {
			this.frecuencia = 108.0;
		}
	}
	public void down(int vueltas) {
		for (int i = 0; i < vueltas; i++) {
			down();
		}
	}
	public void display() {
		System.out.printf("Frecuencia: %.1 MHz \n", this.frecuencia);
	}

}
