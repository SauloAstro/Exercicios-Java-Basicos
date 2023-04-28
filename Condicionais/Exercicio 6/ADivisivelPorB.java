/*
	Crie um arquivo chamado ADivisivelPorB.Java Implemente um programa em Java 
	que guarde dois valores numéricos inteiros : a e b, informados pelo Usuário
	sendo a de 0 até 1000(inclusos) e b de 0 a 20(Inclusos). Valide os valores
	digitados pelo usuário, informando caso não sejam validos.
	Valide, também se o valor de 1 é maior ou igual ao valor de b, caso não seja 
	informe ao usuário. Exiba na saida padrão a mensagem é Divisivel quando a for 
	divisivel por b ou a mensagem não é divisivel, caso contrátrio
 */


import java.util.Scanner;

public class ADivisivelPorB {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		int a = sc.nextInt();
		System.out.println("Digite o segundo numero"); 
		int b = sc.nextInt();
		sc.close();
		
		if(a < 0 || a > 1000 && b < 0 || b > 20)
		{
			System.out.println("OPCAO INVALIDA");
		}
		else
		{
		   if(a == 0 || a == 1 || b == 0 || b == 1)
		   {
			 System.out.println("Você digitou 0 ou 1 e eles são dividios por eles mesmos");   
			}
			else{
	
				if(a % b == 0)
				{
					System.out.println("a e divisivel por b");
					
				}
				else
				{
					System.out.println("a nao e divisivel por b");
				}
	
				}
		}
	
		
	}
}

