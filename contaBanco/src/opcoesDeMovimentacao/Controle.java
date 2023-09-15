package opcoesDeMovimentacao;


import contas.Conta;
import contas.ContaMei;
import contas.ContaPj;


public class Controle {//essa classe realiza o controle das contas
	private String tipoConta;
	private Conta conta = new ContaPj(new ContaMei());
	
	public Controle(String tipoConta) {//define o tipo de conta no construtor
		this.tipoConta = tipoConta;
	}
	
	
	public String getTipoConta() {
		return tipoConta;
	}


	public void saqueConta(double saque) {//realiza o saque de um valor na conta escolhida ao instanciar a classe na Main
		try {
			conta.saque(saque, this.tipoConta);	
		}catch(Exception e) {
			System.out.println("Nenhum tipo de conta foi econtrada");
		}
	}
	
	public void depositoConta(double deposito) {//realiza o deposito de um valor na conta escolhida ao instanciar a classe na Main
		try {
			conta.deposita(deposito, tipoConta);	
		}catch(Exception e) {
			System.out.println("Nenhum tipo de conta foi econtrada");
		}
		
	}
	
}