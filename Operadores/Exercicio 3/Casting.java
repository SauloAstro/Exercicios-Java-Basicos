/*Crie um arquivo chamado Casting.java Crie uma variavel chamada numero 1 do tipo ong e inicialize-a com o valor 2147483648L
 Depois, crie uma variável chamada numero 2 do tipo int e compie o valor da variável numero1 para a variavel numero2, por fim
 exiba na saida padrão, os valores dessas duas variáveis*/




public class Casting {
	
	public static void main (String[] args) {
		
		long numero1 = 2147483648L;
		
		int numero2 = (int) numero1; 
		
		System.out.println(numero1);
		System.out.println(numero2);
		
	}
}

