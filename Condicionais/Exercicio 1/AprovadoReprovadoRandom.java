/*
  Crie um arquivo chamado AprovadoReprovadoRandom.java Gere um numero  aleatório com valores entre 0 e 10 e atribua
  a variavel nota. o Programa deve exibir a mensagem REPROVADO quando a nota do aluno for menor do que 6 ou APROVADO caso contrário
  
 */

import java.util.Random; /// Importa a biblioteca random para o programa


public class AprovadoReprovadoRandom {
	
	public static void main (String[] args) {
			
		Random random = new Random();
		
		int nota = random.nextInt(10);
		
		
		if(nota >= 6)
		{
			System.out.println("Sua Nota Foi: " + nota + " você foi aprovado");
		}
		else
		{
	
			System.out.println("Sua Nota Foi: " + nota + " você foi reprovado");
			
		}
			
	}
}

