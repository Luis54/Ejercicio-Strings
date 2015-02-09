package Ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestConstitucion {
		public static void main(String[] args) {
	
			Scanner in = new Scanner(System.in);
			List<String> texto = new ArrayList<String>();
			String palabra = "";
			while(in.hasNext())
				palabra = in.next();
				texto.add(palabra);
		in.close();		
		}
}
