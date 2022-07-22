
public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(int numero) {
		super(numero);
	}
	
	@Override
	public void sacar(double valor) throws SaldoInsuficienteException {
		double valorSaque = valor + 0.2;
		super.sacar(valorSaque);
	}
	
	@Override
	public void depositar(double valor) {
		super.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
}
