package opcoesDeMovimentacao;

public class EscolheTipoConta {

	public String escolheConta(int codigo) {//aqui pode adicionar os tipos de contas, e eles serão chamados no controle que vai fazer todo o processamento

		switch(codigo) {
		case 1:
			return "Conta Pj";
		case 2:
			return "Conta Mei";	
		default:
			return "Conta vazia";
		}
	}
}