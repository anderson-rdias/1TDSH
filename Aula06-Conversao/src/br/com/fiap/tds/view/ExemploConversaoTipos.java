package br.com.fiap.tds.view;

public class ExemploConversaoTipos {

	//Converter os tipos primitivos para outros tipos
	public static void main(String[] args) {
		
		//Conversao implicita (automaticas: byte -> short -> int -> long -> float -> double)
		byte valorByte = 10;
		short valorShort = valorByte;
		int valorInt = valorShort;
		long valorLong = valorInt;
		float valorFloat = valorLong;
		double valorDouble = valorFloat;
		
		float valorFloat2 = valorShort;
		long valorLong2 = valorShort;
		
		//Conversao explicita (cast: forcar um tipo ser de outro tipo)
		valorFloat = 10.5f; //(f no final, diz que o numero eh do tipo float)
		
		System.out.println("Float: " + valorFloat);
		
		valorInt = (int) valorFloat;
		
		System.out.println("Int: " + valorInt);
		
		valorFloat = (float) valorDouble;
		
		valorInt = (int) valorLong;
	}
}
