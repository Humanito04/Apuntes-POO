package Pizza;

public class Pizza {
	// Atributos
	private Tamanopizza tamano;
	private TipoPizza tipo;
	private EstadoPizza estado;
	
	// Atributos estáticos
	private static int numeroPizzasPedidas;
	private static int numeroPizzasServidas;
	
	
	
	
	
	
	
	// COonstructor
		public Pizza(String tamano,String tipo, String estado){
			setTipo(tipo);
			setTamano(tamano);
			this.estado= EstadoPizza.PEDIDA;
			numeroPizzasPedidas++;
			
			
		}
		
		// Set y getters
			public String getTipo() {
				return this.tipo.toString();
			}
			public void setTipo(String tipo) {
				this.tipo = TipoPizza.valueOf(tipo);
				
			}
			public String getTamano() {
				return this.tamano.toString();
			}
			public void setTamano(String tamano) {
				this.tamano= Tamanopizza.valueOf(tamano);
				
			}
			public static  int getPizzasPedidas() {
				 return numeroPizzasPedidas;
			}
			public void setPizzasPedidas(int numeroPizzasPedidas) {
				Pizza.numeroPizzasPedidas = numeroPizzasPedidas;
			}
			public static  int getPizzasServidas() {
				 return numeroPizzasServidas;
			}
			public void setPizzasServidas(int numeroPizzasServidas) {
				Pizza.numeroPizzasServidas = numeroPizzasServidas;
			}
			
			
			
		// Métodos
		 
			public void servir() {
				if(this.estado.equals(EstadoPizza.PEDIDA)) {
					this.estado = EstadoPizza.SERVIDA;
					Pizza.numeroPizzasServidas++;
				}
				else {
					throw new IllegalStateException("La pizza ya ha sido servida");
				}
			}


	
	

}
