package Ejercicio;

public class PalabraLeida {
	private String valor;
	
	public PalabraLeida(String valor) {
		this.valor = valor;
	}
	public int NumeroDeLetras(){
	int numero = valor.length();
	return numero;
		
	}
	public boolean EmpiezaPorVocal(){
		boolean aux = false;
		if(valor.matches("^[aeiouAEIOU].*"))
			aux=true;
				
		
		return aux;
		
	}
	
	public boolean AcabaPorVocal(){
		boolean aux = false;
			if(valor.matches(".*[aeiouAEIOU]"))
				aux=true;
		
		return aux;
	}
	
	public int NumeroDeVocales(){
		int contador = 0;
		for (int i = 0; i < valor.length(); i++) {
			if(String.valueOf(valor.charAt(i)).matches("[aeiouAEIOU]"))
			contador++;
			
		}
		
		return contador;
	}
	public boolean ContieneH(){
		return (valor.contains("h") || valor.contains("H"));
	}
	public boolean EsUnPalindromo(){
		boolean aux = false;
		String palabra = new StringBuilder(valor).reverse().toString();
		//StringBuilder palabra = new StringBuilder(valor);
		//palabra.reverse();
		//String p = palabra.toString();
		if (palabra.equalsIgnoreCase(valor) ) 
			aux=true;
		
		return aux; 
	}
	public boolean EsUnPalindromoV(){
		
		String palabra = new StringBuilder(valor).reverse().toString();
		
		return palabra.equalsIgnoreCase(valor) ;
			
		
		 
	}
	public boolean SonIguales(String palabra){
		boolean aux = false;
		if(valor.equalsIgnoreCase(palabra))
			aux=true;
		return aux;	
	}
}
