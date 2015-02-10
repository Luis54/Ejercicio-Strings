package Ejercicio;


import java.awt.font.NumericShaper;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestConstitucion {
		public static void main(String[] args) {
	
			Scanner in = new Scanner(System.in);
			List<String> texto = new ArrayList<String>();
			String palabra = "";
			while(in.hasNext()){
				palabra = in.next();
				texto.add(palabra);
		}
		
		StringBuilder quinientos = new StringBuilder();
		for (int i = 0; i < 500; i++) {
			String letras = texto.get(i);
			
			quinientos.append(letras);
			
		}
		System.out.println(texto);
		System.out.println(quinientos);
		//UtilidadesString f = new UtilidadesString());
	
		//System.out.println("El texto tiene este numero de proposiciones " +f.);
		}
}
