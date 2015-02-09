package Ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LecturaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if (args.length == 0) {
			
		
		
		Scanner sc = new Scanner(System.in);
		List<String> lista = new ArrayList<String>();
		//crea una lista para guardar la palabra que empiezan por a
		List<String> empiezanporA = new ArrayList<String>(); 
		//palabras que no terminan en vocal
		List<String> noAcabanEnVocal = new ArrayList<String>();
		//palabras mas grandes
		List<String> palabrasMayorLongitud = new ArrayList<String>();
		int mayorLongitud = 0;
		//palabra menor longitud
		List<String> palabrasMenorLongitud = new ArrayList<String>();
		int menorLongitud = Integer.MAX_VALUE;
		List<String> todasLasPalabras= new ArrayList<String>();
	
		String palabra ="";
		while(sc.hasNext()){
		todasLasPalabras.add(palabra);
		if(mayorLongitud < palabra.length())
			mayorLongitud = palabra.length();
		if(menorLongitud > palabra.length())
			menorLongitud = palabra.length();
		palabra = sc.next();
		lista.add(palabra);
		if(palabra.startsWith("a")){
			empiezanporA.add(palabra);
			
			}
		if(!palabra.matches(".*[aeiou]$")){
			noAcabanEnVocal.add(palabra);
			}
		}
		sc.close();
		
		System.out.println("Palabra que empiezan por A o a");
		System.out.println("Numero de caractares que contiene el texto " +lista.size());
		System.out.println("Palabras que empiezan por A "+empiezanporA);
		System.out.println("Palabras que no acaban por vocal " +noAcabanEnVocal);
		System.out.println("Palabras que tiene mayor longitud " +mayorLongitud);
		System.out.println("Palabras que con menor longitud " +menorLongitud);
		
		for (String palabraLeida : todasLasPalabras) {
			if(palabraLeida.length() == menorLongitud)
				palabrasMenorLongitud.add(palabraLeida);
			if(palabraLeida.length() == mayorLongitud)
				palabrasMayorLongitud.add(palabraLeida);
			
		}
		System.out.println("Palabras que tiene mayor longitud " +palabrasMayorLongitud);
		System.out.println("Palabras que con menor longitud" +palabrasMenorLongitud);
		}
		//en el caso que hay arguemntos
		else {
			//System.out.println("Hay argumentos " +args[0]);
			String argumento = args[0];
			Scanner in = new Scanner(System.in);
			String palabra = "";
			List<String> todasLasPalabras= new ArrayList<String>();
			List<String> todasLasPalabrasSugeridas= new ArrayList<String>();
			boolean contieneNombre = false;
			//recorremos el escaner
			while (in.hasNext()) {
				palabra = in.next();
				todasLasPalabras.add(palabra);
				if (palabra.equals(argumento)){
					contieneNombre = true;
					System.out.println("La palabra " +palabra+ " es igual a " +argumento);
					break;
				}
			/*	else {
					System.out.println("no existe en la lista el nombre ");break;
				}
				*///repite que no existe de forma infinita
			}
			in.close();
			if(!contieneNombre)
				System.out.println("no existe en la lista el nombre ");
			String comienzaPor = argumento.substring(0,2);
			//recorrermos la lista que contiene todos los nombres
			for (String palabras : todasLasPalabras) {
				if (palabras.startsWith(comienzaPor)) {
					todasLasPalabrasSugeridas.add(palabras);
				}
				
			}
			System.out.println("Palabras sugeridas: "+todasLasPalabrasSugeridas);
		}
	}
		

}
