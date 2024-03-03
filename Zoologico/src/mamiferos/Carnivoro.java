package mamiferos;


import java.util.Objects;

import clasesEnumeradas.NivelDeAgresividad;
import zoologico.Animal;

public class Carnivoro extends Mamifero{
	
	//Atributos
	private NivelDeAgresividad nivel;
	
	//Constructores
	public Carnivoro(int numeroDePatas, String tipodepelaje, double peso, String tamano, String nivel) {
		super( numeroDePatas, tipodepelaje,peso,tamano);
		this.nivel = NivelDeAgresividad.valueOf(nivel);
	}
	//Getters y Setters
	public NivelDeAgresividad getNivelDeAgresividad() {
		return nivel;
	}
	public void setNivelDeAgresividad (NivelDeAgresividad nivel) {
		this.nivel = nivel;
	}
	@Override
	public String toString() {
		return "Carnivoro [peso=" + this.getPeso()
				+ ", tamano= " + this.getTamano()
				+ ", numeroDePatas=" + this.getNumeroDePatas()
				+ ", tipoDePelaje=" + this.getTipoDePelaje()
				+ ", nivelDeAgresividad=" + this.nivel 
				+ "]";
	}
	
	@Override
	public boolean equals(Object obj) {	
		Carnivoro otro = (Carnivoro) obj;
		boolean result = false;
		
		if(this.getPeso() ==(otro.getPeso()) && 
				this.getTamano() == otro.getTamano() &&
				this.getNumeroDePatas() == (otro.getNumeroDePatas()) &&
				this.getTipoDePelaje().equals(getTipoDePelaje()) &&
				this.nivel.equals(otro.nivel)) {
			result = true;
		}
		
		return result;
	}
	
	public void desplazarse() {
		System.out.println("Estoy caminando");
	}
	
	public void comer() {
		System.out.println("Estoy comiendo carne");
	}

}
