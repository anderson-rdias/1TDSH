package br.com.fiap.tds.view;

import br.com.fiap.tds.bean.Usuario;

public class Teste {

	//main + CTRL + espaço
	public static void main(String[] args) {
		//Instanciar a classe Usuario -> obter o objeto
		Usuario user = new Usuario(); //CTRL + SHIFT + o (import)
		user.setCodigo(1);
		int cd = user.getCodigo();
		
	}	
}
