package renfe.maquinaria;

public class Vagon {
	private int numero;
	private double cargaMax;
	private double cargaActual;
	private String tipoMercancia;
	private final double CARGA_MAXIMA_DEFECTO = 5000.0;
	
	public Vagon(int numero,double cargaActual,String tipoMercancia) {
		this.numero = numero;
		this.cargaMax = CARGA_MAXIMA_DEFECTO;
		setCargaActual(cargaActual);
		this.tipoMercancia = tipoMercancia;
	}
	
	public Vagon(int numero, double cargaMax, double cargaActual, String tipoMercancia) {
		this.numero = numero;
		this.cargaMax = cargaMax;
		setCargaActual(cargaActual);
		this.tipoMercancia = tipoMercancia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getCargaMax() {
		return cargaMax;
	}

	public void setCargaMax(double cargaMax) {
		this.cargaMax = cargaMax;
	}

	public double getCargaActual() {
		return cargaActual;
	}

	public void setCargaActual(double cargaActual) {
		if(this.cargaActual > this.cargaMax) {
			throw new IllegalArgumentException("La carga actual no puede sobrepasar la carga máxima");	
			
		}

	this.cargaActual = cargaActual;
	}

	public String getTipoMercancia() {
		return tipoMercancia;
	}

	public void setTipoMercancia(String tipoMercancia) {
		this.tipoMercancia = tipoMercancia;
	}

	public double getCARGA_MAXIMA_DEFECTO() {
		return CARGA_MAXIMA_DEFECTO;
	}
	
	
	
}
