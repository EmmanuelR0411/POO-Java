import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Para crear instancias de una clase se realiza:
		CuentaBAncaria cuenta_personal = new CuentaBAncaria();
		//Cada objeto es independiente
		cuenta_personal.beneficiario = "Emmanuel";
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingresa un monto a depositar: ");
		float deposito = leer.nextFloat();
		
		System.out.println("Ingresa un monto a retirar: ");
		float retiro = leer.nextFloat();
		
		cuenta_personal.depositos(deposito);
		cuenta_personal.retiros(retiro);
		
		System.out.println(cuenta_personal.consultarSaldo()); 
		System.out.println(cuenta_personal.beneficiario);
		
		//Creamos un segundo objeto que proviene de la misma clase
		CuentaBAncaria cuenta_papa = new CuentaBAncaria();
		cuenta_papa.beneficiario = "Pedro";
		System.out.println(cuenta_papa.beneficiario);
		
	}

}
