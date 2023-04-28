/*
 Escreva um programa em Java para ler as notas da primeira e segunda avaliação 
 de um aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi 
 ou não aprovado (Considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média
 calculada. 
  
 */


import java.util.Scanner;

public class NotaAluno{
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a nota da primeira prova : ");
		double nota1 = sc.nextDouble();
		
		System.out.print("Digite a nota da segunda prova : ");
		double nota2 = sc.nextDouble();
		
		if(nota1 < 0 || nota2 < 0 || nota2 > 10 || nota2 > 10){
				System.out.println("as notas não podem ser abaixo de zero nem maiores que dez");
			}
		else{
			
			double mediaAritmetica = (nota1 + nota2)/2;
			System.out.println("A Média Aritmética é : " + mediaAritmetica);
			
			if(mediaAritmetica >= 6){
				  System.out.println("O Aluno foi Aprovado");
				}
			else{
				  System.out.println("O Aluno foi reprovado");	
				}
			
		}
		
		
		
	}
}

