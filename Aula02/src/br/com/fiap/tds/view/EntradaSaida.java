package br.com.fiap.tds.view;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		//Ler os dados inseridos pelo usuário
		//Instanciar um objeto do tipo Scanner
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		//Ler um número inteiro
	 	int x = leitor.nextInt();
	 	
	 	System.out.print("Digite outro número:");
	 	//Ler outro número inteiro
		int y = leitor.nextInt();
	 	
		int soma = x + y;
	 	//Exibir a soma dos números
	 	System.out.println("A soma dos números: " + soma);
	 	
	 	//Fechar o leitor
	 	leitor.close();
	}
	
}