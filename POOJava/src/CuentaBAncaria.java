
public class CuentaBAncaria {
	/*
	 * Al trabajar con clases se trata de abstraer cosas de la vida real
	 */
	//ATRIBUTOS
	String institucion = "";
	String beneficiario = "";
	float saldo = 0;
	String producto = "";
	String direccion = "";
	String RFC = "";
	
	//METODOS
	public void depositos(float monto) {
		this.saldo = this.saldo + monto;
	}
	
	public void retiros(float monto) {
		if(monto < this.saldo && monto>0) {
			this.saldo = this.saldo - monto;
		}
	}
	
	public float consultarSaldo() {
		return this.saldo;
	}
	
	public String estadoDeCuenta() {
		return "";
	}
}
