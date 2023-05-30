package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Conta;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Entre com os dados conta: ");
			System.out.print("Numero: ");
			int numero = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Saldo inicial: ");
			Double saldo = sc.nextDouble();
			System.out.print("Limite de saque: ");
			Double limiteSaque = sc.nextDouble();
			Conta x = new Conta(numero, nome, saldo, limiteSaque);
			
			System.out.println();
			System.out.print("Informe o valor do saque: ");
			Double valor = sc.nextDouble();
			x.saque(valor);
			System.out.println("Novo Saldo: " + String.format("%.2f", x.getSaldo()));		
		
			sc.close();
		}
		catch() {
			
		}
	}

}
