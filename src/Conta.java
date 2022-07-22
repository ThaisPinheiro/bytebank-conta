
public abstract class Conta {
	
	private String agencia = "0001";
	private int numero;
	protected double saldo;
	private Cliente titular;
	private static int total;
		
	public Conta(int numero) {
		if(numero <= 0) {
			System.out.println("Numero não pode ser menor ou igual a 0.");
			return;
		} else {
			Conta.total++;
		}
	}
	
	public abstract void depositar(double valor);
	
	public void sacar(double valor) throws SaldoInsuficienteException {
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		
		this.saldo -= valor;
	}
	
	public void tranferir(double valor, Conta destino) throws SaldoInsuficienteException {
		this.sacar(valor);
		destino.depositar(valor);
	}
	
	public String getAgencia() {
		return this.agencia;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}







