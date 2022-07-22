
public class TesteContas {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente(4556);
		conta.depositar(100.0);
		
		ContaPoupanca contap = new ContaPoupanca(4120);
		contap.depositar(200.00);
		
		System.out.println(conta.getSaldo());
		System.out.println(contap.getSaldo());
		
		SeguroDeVida seguro = new SeguroDeVida();
		CalculadorImposto calc = new CalculadorImposto();
		calc.registra(conta);
		calc.registra(seguro);
		
		System.out.println("CC: " + conta.getSaldo());
		System.out.println("CP: " + contap.getSaldo());
		System.out.println(calc.getTotalImposto());
	}
}
