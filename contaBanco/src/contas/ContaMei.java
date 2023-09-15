package contas;

public class ContaMei extends Conta {

	public ContaMei() {	
		super(null);
	}

	@Override
	protected boolean verificaSaque(double saque) {
		return  saldo.getSaldo() > saque;
	}

	@Override
	protected void realizaSaque(double saque) {//uma taxa x reais é aplicada
		double taxa = 10;
		saldo.setSaque(saque + taxa);
		System.out.println("Saque realizado com sucesso, Saldo restante: "+saldo.getSaldo()+" R$ uma taxa de "+taxa+" R$ foi aplicada");
	}

	@Override
	public double totalSaldo() {
		return saldo.getSaldo();
	}

	@Override
	public boolean checaConta(String tipoConta) {
		return tipoConta.equalsIgnoreCase("Conta Mei");
	}

	@Override
	protected void deposita(double deposito) {
		if(deposito > 500) {
			saldo.setSaldo(deposito + 50);	
			System.out.println("Deposito realizado com sucesso, Valor restante: "+saldo.getSaldo()+" R$ deposito com bonus de 50 reais para Conta Mei");
		}else {
			saldo.setSaldo(deposito);
			System.out.println("Deposito realizado com sucesso, Valor restante: "+saldo.getSaldo()+" R$ Conta Mei");
		}
	}	
}