/*
	Crie um arquivo chamado ADivisivelPorB implemente um programa em java que guarde 
	dois valores numéricos inteiros : a e b, informados pelo usuário, sendo a de 0
	até 1000(inclusos) e b de 0 a 20 (inclusos). valor de 1 é maior ou igual ao valor
	de b, caso não seja, informe ao usuário exiba na sáida padrão a mensagem é divisivel 
	por b ou a mensagem não é divisivel, caso ao contrário
 */

import java.util.Random;

public class AdivisivelPorBRandom {
	
	public static void main (String[] args) {
		
		Random gerador = new Random();
		
		int a = gerador.nextInt(1000);
		int b = gerador.nextInt(20);
		
		
		
		System.out.println("Numeros Gerados\n" + "A :" + a + "\n" + "B :" + b);
		
		if(a % b == 0)
		{
			
			System.out.println("DIVISIVEL");
			
		}
		else{
			 System.out.println("A nao e divisivel por B");
			}
		
		
		
		
	}
}
