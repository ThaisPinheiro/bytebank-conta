
public class TesteSacar {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente(7777);
		
		conta.depositar(200);
		
		try {
			conta.sacar(100);
		} catch(SaldoInsuficienteException ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.printf("Saldo: %.2f", conta.getSaldo());
	}
}
