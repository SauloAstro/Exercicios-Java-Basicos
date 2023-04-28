/*
	Escreva um programa em java para ler um valor e escrever se é positivo
	ou negativo (considere o valor zero como positivo)
 */


import java.util.Scanner;

public class NumerosPositivosNegativos {
	
	public static void main (String[] args) {
	
	 Scanner sc = new Scanner(System.in);
	  
	  System.out.print("Digite o Número que deseja verificar : ");   
	  int numero = sc.nextInt();
	
	  if(numero >= 0)
	  {
		 System.out.println("O Número " + numero + " é positvo" );
	  }
	  else
	  {
		 System.out.println("O Número " + numero + " é negativo" ); 
	  }
	
		
	}
}

