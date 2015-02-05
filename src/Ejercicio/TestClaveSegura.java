package Ejercicio;

public class TestClaveSegura {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String FUENTE_CARACTERES = "aAbBcCdDeEfFgGhHiIjJkKlLm-MnN~n~NoOpPqQrRsStTuUvVwWxXyYzZ0123456789>?()=@.:,;!¡&{}0123456789>?()=@.:,;!¡&{}";
		
		int longitud  = (int) (Math.random()*FUENTE_CARACTERES.length());
		StringBuilder sBuilder = new StringBuilder();
		for (int i = 0; i < longitud; i++) {
			String clave = "";
			int posicion = (int) (Math.random()*longitud);
			clave+=FUENTE_CARACTERES.charAt(posicion);
			String.valueOf(sBuilder.append(i)).toString();
			System.out.println(clave.replaceAll("[\n\r]",""));
			
			
		}
		
	}

}
