/*
	Crie um arquivo chamado Saudação.java Implemente um programa em Java
	que declare uma variável chamada hora. Essa variável deve armazenar
	a hora do dia. Esse programa deve exibir a mensagem Zzzzzz
	se a hora estiver no intervalo[0,6], Bom dia se a hora estiver no 
	intervalo [7, 11], boa tarde se a hora estiver no intervalo
	[12, 17 ] ou Boa noite se a hora estiver no intervalo [18, 23].
	De a opão do Usuário informar a hora manualmente ou gerar a hora 
	aleatoriamente, sempre fazendo todas as validações necessárias







 */

import java.util.Scanner;

public class Saudacao {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um horario do dia : ");
		int hora = sc.nextInt();
		
		if(hora > 24){
			System.out.println("Opção Invalida");
		}
		
		else{
			if(hora >= 0 && hora<= 6)
			{
				System.out.println("Zzzzz");
			}
			
			else{
				 if(hora >=7 && hora <= 11)
				 {
				  System.out.println("Bom Dia");	 
				 }
				 
				 else{
					 
					 if(hora >= 12 && hora <= 17)
					 {
						 System.out.println("Boa Tarde");
					 }
					 
					 else
					 {
						if(hora >= 18 && hora <= 23)
						{
							System.out.println("Boa Noite");
						}
					 }
					 
					 
					 }
				 
				}
			
		}
		
		
	}
}

