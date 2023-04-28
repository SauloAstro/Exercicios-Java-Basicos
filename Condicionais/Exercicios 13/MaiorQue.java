/*
	Escreva um programa em Java para ler dois valores
    (considere que não serão lidos valores iguais)
	e escrever o maior deles.
 */

import java.util.Scanner;

public class MaiorQue {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		int n1 = sc.nextInt();
		System.out.print("Digite outro numero : ");
		int n2 = sc.nextInt();
		 if(n1 == n2){
			  System.out.println("São lidos numeros iguais");
			 }
		else{
					 
		if(n1 > n2){
			System.out.println(n1 + " é maior que " + n2 );
		} 
		else{
			System.out.println(n2 + " é maior que " + n1);
		}
		
			}
		
	
		
		
	}
}

