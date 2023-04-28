/*
	Escreva um programa em java para ler um valor e escrever a mensagem
	"É Maior que 10 !" se o valor lido for maior que 10, caso contrátrio
	Escrever "Não é maior que 10 !"
 */


import java.util.Scanner;

public class MaiorQue {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número");
		
		int n1 = sc.nextInt();
		
		if(n1 > 10){
			System.out.println("É MAIOR QUE 10 !");
		}
		else{
			System.out.println("NÃO É MAIOR QUE 10 !");
		}
		
		
	}
}

