/* Crie um arquivo chamadoConversao.java. Crie uma variável chamadatextodo tipoStringeassocie a ela a sequência de caracteres "19.09". Depois, faça a conversão do valor associado a essavariável paradoublee armazene o resultado em uma variável chamadanumerodo tipodouble. Porfim, exiba o valor da variável 
 numero
  */


public class Conversao {
	
	public static void main (String[] args) {
		
		String texto = "19.09";
		
		double numero = Double.parseDouble(texto);
		
		System.out.println(numero);
		
	
		
	}
}

