package principal;

import opcoesDeMovimentacao.*;
import java.util.*;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String escolha;
		EscolheTipoConta decideConta = new EscolheTipoConta();


		System.out.println("Bem vindo a criação de conta, selecione o tipo de conta que deseja criar");
		System.out.println("1- Conta PJ -> a cada deposito com o valor superior a 2500 reais você ganha 100 reais de bonus, com uma taxa de 20 reais para cada saque realizado");
		System.out.println("2- Conta Mei -> a cada deposito com o valor superior a 500 reais você ganha 50 reais de bonus, com uma taxa de 10 reais para cada saque realizado");
		System.out.print("-> ");
		
		Controle conta = new Controle(decideConta.escolheConta(sc.nextInt()));
		System.out.println("*************************************************************************************************************************");
		do {
			System.out.println("Digite a opção que deseja realizar");
			System.out.println("1- Saque");
			System.out.println("2- Deposito");
			System.out.println("3- Para verificar o tipo da sua conta");
			System.out.println("4- para encerar");
			System.out.print("-> ");

			escolha = sc.next();
			System.out.println("*************************************************************************************************************************");
			
			switch(escolha) {
			case "1":
				System.out.println("Digite o valor do saque -> ");
				double saque = sc.nextDouble();
				conta.saqueConta(saque);
				break;
			case "2":
				System.out.print("Digite o valor do deposito -> ");
				double deposito = sc.nextDouble();
				conta.depositoConta(deposito);
				break;
			case "3":
				System.out.println("Sua conta é do tipo -> "+conta.getTipoConta());
				break;
			case "4":
				System.out.println("..........FINALIZANDO O PROGRAMA..........");
				break;
			}
			System.out.println("*************************************************************************************************************************");
		}while(!escolha.equalsIgnoreCase("4"));	
	}

}