/*
	Crie um arquivo chamado OperadoresLogico.java complete o codigo, sub
	sequencia "XXXXX" com operações lògicas. O programa deve exibir os 
	valores true, true, true, false, false e true nesa ordem. Não utiliz
	o mesmo operador duas ou mais vezes.
 */


public class OperadoresLogicos {
	
	public static void main (String[] args) {
		
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		
		System.out.println(a > b || c < d);
		System.out.println(a > b | c < d);
		System.out.println(a > b  & c < d);
		System.out.println(a > b  &&  c < d);
		System.out.println(a > b  !=  c < d);
		
		
	}
}

