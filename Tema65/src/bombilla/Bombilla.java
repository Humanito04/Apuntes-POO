package bombilla;

public class Bombilla {
	//Atributos
	private boolean estado;
	private static boolean general;
	
	//Constructores
	public Bombilla() {
		this.estado = false;
	}
	public Bombilla(boolean estado) {
		this.estado = estado;
	}
	
	//Getters y Setters
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public static boolean isGeneral() {
		return Bombilla.general;
	}
	public static void setGeneral() {
		 Bombilla.general = general;
	}	
	//Métodos
	
	public void encender() {
		this.estado = true;
	}
	public void apagar(){
		this.estado = false;
		}
	public static boolean encenderGeneral() {
		return Bombilla.general;
	}
	public static boolean apagarGeneral() {
		return Bombilla.general;
	}
	}
