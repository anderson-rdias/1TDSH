package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class TesteCondicionais {
	
	public static void main(String[] args) {
		
		//Ler a idade do usuario
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		
		//Verificar se pode dirigir ou não
		if (idade >= 18) {
			System.out.println("Pode tirar a cnh");
		} else {
			System.out.println("Tem que esperar...");
		}
		
		//Declarar uma variavel do tipo boolean 
		// if ou else com uma única instrução, não precisa das {}
		boolean ok = false;
		
		// Diferente no java é != , =! é a negação + a atribuição
		if (ok)
			System.out.println("OK é verdadeiro");
		else
			System.out.println("OK é falso");
		
		// Digite o dia da semana (1 - segunda, 2 - terça...)
		int semana = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia da semana"));
		
		//Exibir o dia da semana (Segunda, terça, quarta...)
		switch(semana) {
			case 1:
				System.out.println("Segunda");
				break;
			case 2:
				System.out.println("Terça");
				break;
			case 3:
				System.out.println("Quarta");
				break;
			case 4:
				System.out.println("Quinta");
				break;
			case 5:
				System.out.println("Sexta");
				break;
			case 6:
				System.out.println("Sabado");
				break;
			case 7:
				System.out.println("Domingo");
				break;
			default:
				System.out.println("Dia inválido");
		}
		
		//Digite a sigla do estado
		String sigla = JOptionPane.showInputDialog("Digite o estado");
		
		//Exibe a capital do estado
		switch (sigla) {
			case "SP": 
				System.out.println("São Paulo");
				break;
			case "MG":
				System.out.println("Belo Horizonte");
				break;
			case "BA":
				System.out.println("Salvador");
				break;
			default:
				System.out.println("Estado inválido");
		}
		
	}//main

}//classe
