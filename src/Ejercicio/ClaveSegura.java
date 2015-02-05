package Ejercicio;

public class ClaveSegura {
	private StringBuilder clave;
	
	
	public ClaveSegura(StringBuilder clave) {
		this.clave = clave;
	}
	public boolean esClaveSegura(){
		//boolean aux = false;
		return minimoLongitudOcho() && letraMayuscula() && letraMinuscula() 
				&& tieneDigito() && tieneDigitoOLetra();
		
		//return aux;	
	}
	private boolean minimoLongitudOcho(){
		return clave.length() >= 7 ;
	}
	
	private boolean letraMayuscula(){
		boolean aux=false;
		for (int i = 0; i < clave.length(); i++) {
		if (Character.isUpperCase(clave.charAt(i))){
			aux=true;
			break;
		}
	}
		return aux;	
}
	private boolean letraMinuscula(){
		boolean aux=false;
		for (int i = 0; i < clave.length(); i++) {
		if (Character.isLowerCase(clave.charAt(i))){
			aux=true;
			break;
		}
	}
		return aux;
}
	private boolean tieneDigito(){
		boolean aux=false;
		for (int i = 0; i < clave.length(); i++) {
		if (Character.isDigit(clave.charAt(i))){
			aux=true;
			break;
		}
	}
		return aux;
}
	private boolean tieneDigitoOLetra(){
		boolean aux=false;
		for (int i = 0; i < clave.length(); i++) {
		if (!Character.isLetterOrDigit(clave.charAt(i))){
			aux=true;
			break;
		}
	}
		return aux;
}
	public boolean cumpletodo(){
		return minimoLongitudOcho() && letraMayuscula() && letraMinuscula() 
				&& tieneDigito() && tieneDigitoOLetra();
	}
}
