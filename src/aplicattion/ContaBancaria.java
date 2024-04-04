package aplicattion;

import java.util.Scanner;

import entities.Banco;

public class ContaBancaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Banco banco;
		
		System.out.println("Insira o número da conta: ");
		int numero = sc.nextInt();
		System.out.println();
		
		System.out.println("Insira o titular da conta: ");
		String nome = sc.next();
		
		System.out.println();
		
		System.out.println("Existe um depósito inicial? (s/n): ");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.println("Insira um valor inicial? ");
			double depositoInicial = sc.nextDouble();
			banco = new Banco(numero, nome, depositoInicial);
			System.out.println("Dados da conta: "+ banco);
			
		}else {
			banco = new Banco(numero, nome);
			System.out.println("Dados da conta: "+ banco);
		}
		System.out.println("Insira um valor para deposito");
		double valorDeposito = sc.nextDouble();
		banco.deposito(valorDeposito);
		System.out.println("Dados da conta atualizado: "+ banco);
		
		System.out.println();
		
		System.out.println("Insira um valor de saque: ");
		double valorSaque = sc.nextDouble();
		banco.saque(valorSaque);
		System.out.println("Dados da conta atualizado: "+banco);
		
		sc.close();
	}

}
