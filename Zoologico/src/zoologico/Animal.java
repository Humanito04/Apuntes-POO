package zoologico;

public class Animal extends Object {
	
	//Atributos
	private double peso;
	private TamanoAnimal tamano;
	
	//Constructor/es
	public Animal(double peso, String tamano) {
		this.peso = peso;
		this.tamano = TamanoAnimal.valueOf(tamano);
	}
	
	//Getters y Setters
	public double getPeso() {
		return this.peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public TamanoAnimal getTamano() {
		return tamano;
	}
	public void setTamano(TamanoAnimal tamano) {
		this.tamano = tamano;
	}
	@Override
	public String toString() {
		return "Animal [peso=" + this.peso 
				+ ", tamano=" + this.tamano
				+ "]";
	}
	@Override
	public boolean equals(Object obj) {	
		Animal otro = (Animal) obj;
		boolean result = false;
		
		if(this.peso ==(otro.peso) && 
				this.tamano == otro.tamano) {
			result = true;
		}
		
		return result;
	}
	
	
}
