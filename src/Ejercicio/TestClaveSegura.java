package Ejercicio;

public class TestClaveSegura {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String FUENTE_CARACTERES = "aAbBcCdDeEfFgGhHiIjJkKlLm-MnN~n~NoOpPqQrRsStTuUvVwWxXyYzZ0123456789>?()=@.:,;!¡&{}0123456789>?()=@.:,;!¡&{}";
		
		int longitud  = (int) (Math.random()*FUENTE_CARACTERES.length());
		StringBuilder sBuilder = new StringBuilder();
		for (int i = 0; i < longitud; i++) {
			int posicion = (int) (Math.random()*FUENTE_CARACTERES.length());
			sBuilder.append(FUENTE_CARACTERES.charAt(posicion));
			
			
			
		}
		System.out.println(sBuilder);
		ClaveSegura s = new ClaveSegura(sBuilder);
		System.out.println("¿La clave introducida es segura? " +s.cumpletodo());
			
		}

		
	}


