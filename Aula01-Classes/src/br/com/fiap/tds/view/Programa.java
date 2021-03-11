package br.com.fiap.tds.view;

public class Programa {

	public static void main(String[] args) {
		
		//Declaração de duas variáveis do tipo int
		int x = 10;
		int y = 2;
		
		//Realizar a soma de x e y
		int soma = x + y;
		//Exibir o resultado da soma
		System.out.println("A soma é: " + soma); 
		
		//Realizar a subtração
		int subtracao = x - y;
		//Exibir o resultado da subtração
		System.out.println("A subtração é: " + subtracao);
	
		//Realizar a multiplicação
		int multiplicacao = x * y;
		//Exibir o resultado da multiplicação
		System.out.println("A multiplicação é: " + multiplicacao);
		
		//Realizar a divisão
		int divisao = x / y; 
		//Exibir o resultado da divisão
		System.out.println("O resultado da divisão é: " + divisao);
		
		//Obter o resto da divisão //x = 10, y = 2 (mod)
		int resto = x % y; 
		//Exibir o resto da divisão
		System.out.println("O resto da divisão é: " + resto);
		
		//Incremento
		x++; // incrementar em 1 unidade -> x = x + 1;
		System.out.println("Incremento: " + x);
		
		//Decremento
		x--; // retira 1 unidade -> x = x - 1;
		System.out.println("Decremento: " + x);
		
		//Atribuição aditiva  (x = 10)
		x += 2; // x = x + 2;
		System.out.println("Atribuição aditiva: " + x); // 12
		
		//Atribuição subtrativa (x = 12)
		x -= y; // x = x - y;
		System.out.println("Atribuição subtrativa: " + x); // 10
		
		//Atribuição multiplicativa (x = 10)
		x *= y; // x = x * y;
		System.out.println("Atribuição multiplicativa: " + x); // 20
		
		//Atribuição de divisão (x = 20)
		x /= y; // x = x / y;
		System.out.println("Atribuição de divisão: " + x); // 10
		
		//Atribuição de resto (x = 10)
		x %= y; // x = x % 2;
		System.out.println("Atribuição de resto: " + x); // 0
	}
	
}