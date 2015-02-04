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
		for (int i = 0; i < valor.length(); i++) {
			if(valor.matches("^[aeiou]."))
				aux=true;
				
		}
		return aux;
		
	}
	
	public boolean AcabaPorVocal(){
		for (int i = 0; i > valor.length(); i++) {
			if(valor.matches(".*[aeiou]+.*"))
				System.out.println("La palabra no acaba en vocal");
		}
		return false;
	}
	
}
