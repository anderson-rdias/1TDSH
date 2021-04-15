package br.com.fiap.tds.view;

public class ExemploConversaoString {

	//Transformar um primitivo em uma String
	public static void main(String[] args) {
		
		//Definir uma variavel do tipo int e double
		//int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		int idade = 19;
		double salario = 2500.50; 
		
		//Transformar o numero em uma String
		String idadeString = String.valueOf(idade); //transforma o int em uma String
		
		String salarioString = String.valueOf(salario); //transforma um double em uma String
		
		//Exibir a soma
		System.out.println(idade + salario);
		//JOptionPane.showMessageDialog(null, idade + salario);
		
		System.out.println(idadeString + salarioString);
		
		//Concatenacao de Strings... um numero somado a uma string -> resultado string
		String teste = "" + idade; //transforma em uma String
		System.out.println(teste);
		
	}
	
}