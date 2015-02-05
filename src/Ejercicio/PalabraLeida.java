package Ejercicio;
/**
 * 
 * @author Luis Usero Reyes
 * @version 1.0
 */
public class PalabraLeida {
	private String valor;
	/**
	 * 
	 * @param palabra con la palabra que vamos a trabajar
	 */
	public PalabraLeida(String valor) {
		this.valor = valor;
	}
	/**
	 * 
	 * @return retorno el numero de palabraa
	 */ 
	public int NumeroDeLetras(){
	int numero = valor.length();
	return numero;
		
	}
	/**
	 * 
	 * @return un false o true si la palabra empieza por vocal
	 */
	public boolean EmpiezaPorVocal(){
		boolean aux = false;
		if(valor.matches("^[aeiouAEIOU].*"))
			aux=true;
				
		
		return aux;
		
	}
	/**
	 * 
	 * @returnun false o true si la palabra acaba por vocal
	 */
	public boolean AcabaPorVocal(){
		boolean aux = false;
			if(valor.matches(".*[aeiouAEIOU]"))
				aux=true;
		
		return aux;
	}
	/**
	 * 
	 * @return el numero de vocales que contiene la palabra
	 */
	public int NumeroDeVocales(){
		int contador = 0;
		for (int i = 0; i < valor.length(); i++) {
			if(String.valueOf(valor.charAt(i)).matches("[aeiouAEIOU]"))
			contador++;
			
		}
		
		return contador;
	}
	/**
	 * 
	 * @return un false o true si la palabra contiene h o H
	 */
	public boolean ContieneH(){
		return (valor.toLowerCase().contains("h"));
	}
	/**
	 * 
	 * @return un false o true si la palabra es un palindromo
	 */
	public boolean EsUnPalindromo(){
		boolean aux = false;
		String palabra = new StringBuilder(valor).reverse().toString();
		//StringBuilder palabra = new StringBuilder(valor);
		//String p = palabra.toString();
		//palabra.reverse();
		if (palabra.equalsIgnoreCase(valor)) 
			aux=true;
		
		return aux; 
	}
	/*public boolean EsUnPalindromoV(){
		String palabra = new StringBuilder(valor).reverse().toString();
		return palabra.equalsIgnoreCase(valor) ;
	}*/
	/**
	 * 
	 * @param palabra
	 * @return un false o true si la palabra es igual que la introducida
	 */
	public boolean SonIguales(String palabra){
		boolean aux = false;
		if(valor.equals(palabra))
			aux=true;
		return aux;	
	}
}
