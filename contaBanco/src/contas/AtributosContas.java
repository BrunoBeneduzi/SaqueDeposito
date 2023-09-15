package contas;

public class AtributosContas {
	private double saldo;
	private String nomeConta;
	
	
	public AtributosContas() {
		this.saldo = 2000;
	}
	
	public AtributosContas(String nome) {
		this.nomeConta = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaque(double saque) {
		this.saldo -= saque;
	}

	public String getNomeConta() {
		return nomeConta;
	}
	
	protected void setSaldo(double deposito) {
		this.saldo += deposito;
	}
	
	
}