/*
	Escreva um programa em Java para ler o ano atual e o ano de nascimento 
	de uma pessoa. Escrever uma mensagem que diga se ela poderá ou não votar este ano 
	(não é necessario considerar o mês em que a pessoa nasceu);
 */


import java.util.Scanner;

public class AnoEleitoral {
	
	public static void main (String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Digite o ano de nascimento : ");
		int AnoNasc = sc.nextInt();
		 
		 System.out.print("Digite o ano atual : ");
		 int AnoAtual = sc.nextInt();
		 
		int resposta =  AnoAtual - AnoNasc; 
		
		if(resposta < 0)
		{
			System.out.println("Opção Invalida, verifique sua resposta");
		} 
		else{
			
		if(resposta >= 16)
		{
		  System.out.println("o eleitor tem " + resposta +" Ele pode Votar");
		}
		else
		{
		  System.out.println("o eleitor tem " +  resposta +" Ele não pode votar");	
		}
		
			}
		 
	}
}

