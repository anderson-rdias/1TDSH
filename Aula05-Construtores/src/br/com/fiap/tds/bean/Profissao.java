package br.com.fiap.tds.bean;

public class Profissao {
	
	private String nome;

	//CTRL + 3 -> gcuf (Construtor)
	public Profissao() {}
	
	public Profissao(String nome) {
		this.nome = nome;
	}
	
	//CTRL + 3 -> ggas (Getters Setters)
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}