/*
 Crie um arquivo chamado VerificaValorProdutoRandom.java
* Gere dois números aleatórios
entre 1 e 1000 (inclusos), atribuindo as variáveis
precoProduto1 e precoProduto2. O programa deve
exibir a mensagem O produto 1 é o mais barato quando preço do primeiro produto for menor.
Caso contrário, se o preço do segundo produto for menor, a mensagem O produto 2 é o mais barato
deve ser exibida. Caso contrário, a mensagem Os preços dos dois produtos são iguais é que deve ser
exibida
 */

import java.util.Random;

public class VerificaValorProdutoRandom {
	
	public static void main (String[] args) {
		
		Random gerador = new Random();
		
		int produto1 = gerador.nextInt(100); 
		int produto2 = gerador.nextInt(100); 
			
		if(produto1 == produto2)
		{
			System.out.println("Produto 1 tem o valor de : " + produto1);
			System.out.println("Produto 2 tem o valor de : " + produto2);
			
			System.out.println("Os Produtos tem valores iguais"); 
		}	
		else{
			
			if(produto1 > produto2)
			{
			System.out.println("Produto 1 tem o valor de : " + produto1);
			System.out.println("Produto 2 tem o valor de : " + produto2);
			
			System.out.println("O Produto 2 é mais barato que Produto 1");
			}
			else{
			System.out.println("Produto 1 tem o valor de : " + produto1);
			System.out.println("Produto 2 tem o valor de : " + produto2);
			
			System.out.println("Produto 1 é mais barato que o produto 2");			
				}
			
		}
		
	}
}

