package aves;

import clasesEnumeradas.LongitudDeAlas;
import clasesEnumeradas.TipoDePico;
import mamiferos.Mamifero;
import zoologico.Animal;

public abstract class Ave extends Animal{
	private LongitudDeAlas longitud;
	private TipoDePico tipoPico;
	
	public Ave(double peso, String tamano,String longitud,String tipoPico) {
		super(peso,tamano);
		this.longitud = LongitudDeAlas.valueOf(longitud);
		this.tipoPico= TipoDePico.valueOf(tipoPico);
	}

	public LongitudDeAlas getLongitud() {
		return longitud;
	}

	public void setLongitud(LongitudDeAlas longitud) {
		this.longitud = longitud;
	}

	public TipoDePico getTipoPico() {
		return tipoPico;
	}

	public void setTipoPico(TipoDePico tipoPico) {
		this.tipoPico = tipoPico;
	}
	@Override
	public String toString() {
		return "Ave [peso=" + this.getPeso()
				+ ", tamano= " + this.getTamano()
				+ ", longitud=" + this.longitud
				+ ", Tipo de Pico=" + this.tipoPico
				+ "]";
	}
	
	@Override
	public boolean equals(Object obj) {	
		Ave otro = (Ave) obj;
		boolean result = false;
		
		if(this.getPeso() ==(otro.getPeso()) && 
				this.getTamano() == otro.getTamano() &&
				this.longitud.equals(otro.longitud) &&
				this.tipoPico.equals(otro.tipoPico)) {
			result = true;
		}
		
		return result;
	}
	
	public void volar() {
		System.out.println("Estoy volando");
	}
	public void cantar() {
		System.out.println("Estoy cantando una preciosa cancion con mi preciosa voz");
	}
	
	
}
