package Ejercicio;

import java.util.Scanner;

public class TestPalabraLeida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce la palabra");
		Scanner in = new Scanner (System.in);
		String palabra = in.nextLine();
		PalabraLeida v = new PalabraLeida(palabra);
		in.close();
		System.out.println("Numero de la palabra " +v.NumeroDeLetras());
		System.out.println("Empieza por vocal " +v.EmpiezaPorVocal());
		System.out.println("Acaba por vocal " +v.AcabaPorVocal());
		System.out.println("Acaba por vocal " +v.NumeroDeVocales());
		System.out.println("Contien H o h " +v.ContieneH());
		System.out.println("Es Palindromo " +v.EsUnPalindromo());
		System.out.println("Es Palindromo " +v.EsUnPalindromoV());
		System.out.println("Son iguales las palabras " +v.SonIguales("hola"));
	}

}
