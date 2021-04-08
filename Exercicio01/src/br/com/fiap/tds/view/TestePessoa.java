package br.com.fiap.tds.view;

import java.util.Scanner;

import br.com.fiap.tds.bean.Pessoa;

public class TestePessoa {
	
	public static void main(String[] args) {
		//Instanciar uma pessoa e um elevador
		Pessoa pessoa = new Pessoa();
		//Elevador elevador = new Elevador();
		
		//Ler os dados da pessoa e do elevador
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite nome: ");
		String nome = leitor.next() + leitor.nextLine();
		
		System.out.print("Digite a idade: ");
		int idade = leitor.nextInt();
		
		System.out.print("Digite a altura: ");
		float altura = leitor.nextFloat();
		
		//Atribuir os dados nos objetos
		pessoa.gerenciarDados(nome, idade, altura);
		
		//Exibir os dados
		String dados = pessoa.retornarDados();
		System.out.println(dados);
		
		leitor.close();
		
	}

}
