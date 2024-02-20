package Repaso;

public class Repaso {

	public static void main(String[] args) {
		/*Realiza una función que cuente el número de dígitos de
		 *  un número entero y lo imprima por pantalla
		 *  */
		
		System.out.println(capicua(121));

	}
	public static int digitos(int numero) {
		int result = 0;
		while(numero > 0) {
			numero /= 10;
			result++;
		}		
		return result;
	}
	
	public static boolean capicua (int numero) {
		return numero == voltea(numero);
	}
	
	  public static int voltea(int numero) {
	        int volteado = 0;
	        
	        while (numero > 0) {
	            
	            volteado = volteado * 10;
	            int digito = numero % 10;
	            numero = numero / 10;
	            volteado = volteado + digito;
	        }
	        
	        return volteado;
	    }
	
	
	
	
	
	
}
