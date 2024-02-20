package cuentaCorriente;

public class Main {

	public static void main(String[] args) {
		CuentaCorriente cuenta1 = new CuentaCorriente ("Vladi", "111111111A");
		
		Gestor gestor1 = new Gestor("Pablo C.","+34 666666666");
		
		CuentaCorriente cuenta2 = new CuentaCorriente ("Pablo", "22222222B", gestor1);
		System.out.println(cuenta2.getGestor().getNombre());
	}

}
