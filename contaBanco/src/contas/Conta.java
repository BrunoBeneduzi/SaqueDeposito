package contas;

public  abstract class Conta {
	protected AtributosContas saldo = new AtributosContas();;
	public Conta proximo;

	public Conta(Conta proximo) {
		this.proximo =  proximo;
	}//recebe uma classe do tipo Conta ou qualquer classe que herde o tipo conta

	public void saque(double saque, String nome) {//metodo para realizar o saque 
		if(checaConta(nome)) {
			if(verificaSaque(saque)) realizaSaque(saque);
			else System.out.println("Saldo insuficiente, saldo restante "+saldo.getSaldo()+" R$");
		}
		else proximo.saque(saque, nome);//verifica se a conta é o tipo certo, se não for, vai chamar a proxima classe herdada
	}

	public void deposita(double deposito, String nome) {
		if(checaConta(nome)) {
			deposita(deposito);
		}
		else proximo.deposita(deposito, nome);//verifica se a conta é o tipo certo, se não for, vai chamar a proxima classe herdada
	}

	protected abstract void deposita(double deposito);//realiza o deposito
	protected abstract boolean verificaSaque(double saque);//verifica se o saldo é suficiente 
	protected abstract void realizaSaque(double saque);//realiza o saque, dependendo do tipo da conta vai ter uma cobrança de uma taxa 
	protected abstract double totalSaldo();//verifica o saldo da conta
	protected abstract boolean checaConta(String TipoConta);//metodo abstrato padrão para todos os metodos da conta, ele verifica o tipo da conta  
}