package Pizza;

import java.util.Scanner;

public class wrgerg {

	public static void main(String[] args) {
		 /*Pide una cadena y un carácter por teclado (valida que sea un carácter) 
        y muestra cuantas veces aparece el carácter en la cadena.*/

        Scanner sca= new Scanner(System.in);
        
        System.out.println("Introduce una palabra");
        String palabra= sca.next();
        
        System.out.println("Introduce una letra");
        String letra= sca.next();
        
        for(int cont=0; cont< palabra.length(); cont++){
            
            String cadena= palabra.substring(cont, cont+1);
            if(cadena.equalsIgnoreCase(letra)){
                System.out.printf("Contiene la letra en la posicion %d\n ",cont);
                
            }else{
                System.out.println("No contiene la letra");
            }
            
        }
                

	}
	}