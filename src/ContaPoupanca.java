
public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int numero) {
		super(numero);
	}
	
	@Override
	public void depositar(double valor) {
		super.saldo += valor;
	}
}
