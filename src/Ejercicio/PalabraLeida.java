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
		for (int i = 0; i < valor.length(); i++) {
			if(valor.matches(".[aeiou]"))
				System.out.println("La palabra contiene vocales");
		}
		return false;
		
	}
	
	public boolean AcabaPorVocal(){
		for (int i = 0; i > valor.length(); i++) {
			if(valor.matches(".*[aeiou]+.*"))
				System.out.println("La palabra no acaba en vocal");
		}
		return false;
	}
	
}
