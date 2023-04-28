/*
	Crie um arquivo chamado AprovadoReprovado Solicite ao usuario que digite o valor para 
	a variavel nota. O programa deve testar o valor digitado pelo usuario e caso não esteja na faixa  de 0 
	até 10 (inclusos), exibir a mensagem VALOR INVALIDO E Finalizer o programa. Caso o Valor Digitado seja Valido,
	exibir a mensagem REPROVADO quando a nota do aluno for menor do que 6 ou APROVADO caso o contrário.
 */

import java.util.Scanner;

public class AprovadoReprovado {
	
	public static void main (String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
		int nota = sc.nextInt();
		
		if(nota < 0 || nota > 10)
		{
			System.out.println("OPCÃO INVALIDA");
		}
		else
		{
		
			if(nota >= 6 )
			{
			 
			  System.out.println(nota);
			  System.out.println("Você Foi Aprovado");
			}
			else
			{
			System.out.println(nota);
			System.out.println("Você foi Reprovado");	
				
			}
		
		}
		
	}
}

