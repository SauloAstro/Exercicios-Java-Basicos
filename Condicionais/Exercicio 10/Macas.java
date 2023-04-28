/*
  As Maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia
  e R$ 1,00 se forem compradas pelo menos 12. Escreva um programa em Java que leia o número de maçãs
  compradas, calcule e escreva o custo total da compra
 */

import java.util.Scanner;

public class Macas {
	
	public static void main (String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		double macas = 1.30;
		int qntd = 0;
		
		System.out.print("As Maçãs custam R$ 1.30 mas ficam por R$ 1.00 \ndigite a quantidade que deseja : ");
		qntd = sc.nextInt();
		
		if(qntd >= 12 ){
			
			macas = 1;
			
			System.out.println("O Preço total é de : " + macas*qntd + " R$");
			  
			}
			
		else{
		     
		     System.out.println("O Preço total é de : " + macas*qntd + " R$");
				
		}
		
	}
}

