package tema6;

public class Persona {
	
	// Atributos
			String nombre;
			int edad;
			double estatura;  
			static String dia;		
			
			
			 Persona(String nombre, int edad, double estatura,String dia){
				this.nombre= nombre;
				this.edad= edad;
				this.estatura= estatura;
				this.dia= dia;
			}
			public Persona() {
				this.nombre = "Pablo";
				this.edad = 19;
				this.estatura= 1.78;
			}
			void saludar() {
				System.out.println("Hola");
				}
			void crecer(double centimetros) {
				estatura = estatura + centimetros;
			}
			void cumplirAnios() {
				edad++;
			}
//Métodos estáticos 
			
	static void mostrarDia() {
		System.out.println("Hoy es " + Persona.dia);
	}

}
