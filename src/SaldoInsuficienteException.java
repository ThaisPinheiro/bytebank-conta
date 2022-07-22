
public class SaldoInsuficienteException extends Exception{
	
	public SaldoInsuficienteException(String msg) {
		super(msg);
		System.out.println("Saldo Insuficiente");
	}
}
