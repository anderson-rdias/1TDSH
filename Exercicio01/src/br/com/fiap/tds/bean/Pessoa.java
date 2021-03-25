package br.com.fiap.tds.bean;

public class Pessoa {

	//Atributos: nome, idade, altura
	public String nome;
	
	public int idade;
	
	public float altura;
	
	//Métodos: para alterar os valores e recuperar os valores
	public void gerenciarDados(String nomePessoa, int idade, float altura) {
		nome = nomePessoa;
		this.idade = idade;
		this.altura = altura; //this -> referencia para a classe/objeto
	}
	
	public String retornarDados() {
		String dados = "Nome: " + nome + " Idade: " + idade 
											+ " Altura: " + altura;
		return dados;
	}
	
}