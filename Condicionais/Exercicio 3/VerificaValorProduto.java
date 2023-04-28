/*
Crie um arquivo chamado VerficaValorProduto Solite ao usuário que digite 
Solite ao usuario que digite os valores para as variaveis precProduto1 
e precoProduto2. O Programa deve testar o valor digitado pelo usuário
para as duas variáveis e caso não estejam na faixa 1 até 100 (inclusos) 
exibir a mensagem O VALOR É INVALIDO e finalizar o programa. Caso os valores
digitados sejam válidos exibir a mensagem O Produto 1 é mais barato 
quando o preço do primeiro produto for menor  Caso o contrário, se o 
produto for menor, a mensagem o Produto 2 é o mais barato deve ser exibida
se o preço do segundo produto for menor, a mensagem O Produto 2 é o mais barato 
deve ser exibita. Caso contrario, a mensagem os preços dos dois produtos
são iguais é que deve ser exibida. 
 */


import java.util.Scanner;

public class VerificaValorProduto {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o preço do primeiro produto (1 até 100) : ");
		double precoProduto1 = sc.nextDouble();
		
		System.out.print("Digite o preço do segundo produto (1 até 100) : ");
		double precoProduto2 = sc.nextDouble();
		

		if(precoProduto1 == precoProduto2)
		{
		System.out.println("Os Produtos tem o mesmo preço");	
		}
		else
		{
		 if(precoProduto1 < 1 || precoProduto2 < 1 || precoProduto1 > 100 || precoProduto2 > 100 ){
			 
			 System.out.println("O VALOR É INVALIDO");
			 
		}
		else
		{
			if(precoProduto1 > precoProduto2 ){
			  
					System.out.println("O Produto 2 é mais barato");
			
				}
				else{
					
					System.out.println("O Proudto 1 é mais barato");
					
					}
		 	
			
		}
		 
		 
		 
		 
		 
		 
		 
		 
		}
		
		
		
		
		
		
	}
}

