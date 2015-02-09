package Ejercicio;

public class UtilidadesString {

	public final String[] ARTICULOS_DETERMINADOS = {"el","las","los","la"};
	public final String[] ARTICULOS_INDETERMINADOS = {"un","unos","una","unas"};
	public final String[] PREPOSICIONES = {"a", "ante", "bajo", "cabe", "con", "contra", "de", "desde", "en", "entre",
	"hacia", "hasta","para", "por", "según", "sin", "so", "sobre", "tras"};
	
	StringBuilder cadena = new StringBuilder();
	public int numeroPalabras(String frase){
		return frase.length();
	}
	
	public int numeroPreposiciones(String frase){
		int contador = 0;
		for (int i = 0; i < PREPOSICIONES.length; i++) {
			cadena = cadena.append(PREPOSICIONES[i]);
		}
		for (int i = 0; i < frase.length(); i++) {
		if (frase.contains(cadena)) {
			contador++;
		}
			
	}
		return contador;
	}
	public int numeroArticulosDeterminados(String frase){
		int contador = 0;
		for (int i = 0; i < ARTICULOS_DETERMINADOS.length; i++) {
			cadena = cadena.append(ARTICULOS_DETERMINADOS[i]);
		}
		for (int i = 0; i < frase.length(); i++) {
		if (frase.contains(cadena)) {
			contador++;
		}
			
	}
		return contador;
	}
	
	public int numeroArticulosInderterminados(String frase){
		int contador = 0;
		for (int i = 0; i < ARTICULOS_INDETERMINADOS .length; i++) {
			cadena = cadena.append(ARTICULOS_INDETERMINADOS [i]);
		}
		for (int i = 0; i < frase.length(); i++) {
		if (frase.contains(cadena)) {
			contador++;
		}
			
	}
		return contador;
	}
	
	public String devolverMayusculas(int comienzo,int fin,String frase){
		
		return frase;
	}


}

