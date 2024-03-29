package mamiferos;
import clasesEnumeradas.TipoDeDieta;
import zoologico.Animal;

public class Herviboro extends Mamifero {
	
	private TipoDeDieta tipodecomida;
	
	public Herviboro(int numeroDePatas, String tipodepelaje, double peso,String tamano, String tipodecomida) {
		super(numeroDePatas,tipodepelaje,peso,tamano);
		this.tipodecomida = TipoDeDieta.valueOf(tipodecomida);
	}
	
	public TipoDeDieta getTipoDeDieta() {
		return tipodecomida;
	}
	public void setTipoDePelaje(TipoDeDieta tipodecomida) {
		this.tipodecomida = tipodecomida;
	}
	@Override
	public String toString() {
		return "Mamífero [peso=" + this.getPeso()
				+ ", tamano= " + this.getTamano()
				+ ", numeroDePatas=" + this.getNumeroDePatas()
				+ ", tipoDePelaje=" + this.getTipoDeDieta()
				+ "]";
	}
	
	@Override
	public boolean equals(Object obj) {	
		Herviboro otro = (Herviboro) obj;
		boolean result = false;
		
		if(this.getPeso() ==(otro.getPeso()) && 
				this.getTamano() == otro.getTamano() &&
				this.getNumeroDePatas() == (otro.getNumeroDePatas()) &&
				this.getTipoDePelaje().equals(otro.getTipoDePelaje())&&
				this.tipodecomida.equals(otro.tipodecomida)) {
			result = true;
		}
		
		return result;
	}
	
	public void desplazarse() {
		System.out.println("Estoy caminando");
	}
	
	public void comer() {
		System.out.println("Estoy comiendo plantitas");
	}
}
