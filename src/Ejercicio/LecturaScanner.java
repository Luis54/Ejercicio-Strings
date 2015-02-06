package Ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LecturaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<String> lista = new ArrayList<String>();
		String palabra ="";
		
		while(sc.hasNext()){
		palabra = sc.next();
		lista.add(palabra);
		}
		sc.close();
		//System.out.println(texto);
		System.out.println("Numero de caractares que contiene el texto " +lista.size());
		System.out.println(lista);
	}

}
