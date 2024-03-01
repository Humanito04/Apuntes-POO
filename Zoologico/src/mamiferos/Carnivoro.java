package mamiferos;


import java.util.Objects;

import zoologico.Animal;

public class Carnivoro extends Mamifero{
	
	//Atributos
	private NivelDeAgresividad nivel;
	
	//Constructores
	public Carnivoro(int numeroDePatas, String tipodepelaje, double peso, String nivel) {
		super( numeroDePatas, tipodepelaje,peso);
		this.nivel = NivelDeAgresividad.valueOf(nivel);
	}
	//Getters y Setters
	public NivelDeAgresividad getNivelDeAgresividad() {
		return nivel;
	}
	public void setNivelDeAgresividad (NivelDeAgresividad nivel) {
		this.nivel = nivel;
	}
	
	

}
