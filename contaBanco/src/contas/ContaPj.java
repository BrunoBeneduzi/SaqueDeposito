package contas;

public class ContaPj extends Conta{

	public ContaPj(Conta proximo) {
		super(proximo);
	}

	@Override
	public boolean verificaSaque(double saque) {
		return saldo.getSaldo() > saque;
	}

	@Override
	public void realizaSaque(double saque) {//contas PJ tem um taxa de x reais é aplicada 
		double taxa = 20;
		saldo.setSaque(saque + taxa);
		System.out.println("Saque realizado com sucesso, Saldo restante: "+saldo.getSaldo()+" R$ uma taxa de "+taxa+" R$ foi aplicada");
	}

	@Override
	public double totalSaldo() {		
		return saldo.getSaldo();
	}

	@Override
	public boolean checaConta(String tipoConta) {
		return tipoConta.equalsIgnoreCase("Conta Pj");
	}

	@Override
	protected void deposita(double deposito) {
		if(deposito > 2500) {
			saldo.setSaldo(deposito + 100);	
			System.out.println("Deposito realizado com sucesso, Valor restante: "+saldo.getSaldo()+" R$ deposito com bonus de 50 reais para Conta Mei");
		}else {
			saldo.setSaldo(deposito);
			System.out.println("Deposito realizado com sucesso, Valor restante: "+saldo.getSaldo()+" R$ Conta PJ");
		}
	}	
}

