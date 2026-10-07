package excepciones;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionFileException {
	
	public static void abrirFicher(String s) throws FileNotFoundException {
		//si le damos throws, le decimos basicamente que se calle -> nos va a decir en la funcion abajo, para que lo manejemos
			FileReader f = new FileReader(s);
	}
	
	public static void main (String[] args) throws FileNotFoundException {
		abrirFicher("Direction"); //otra vez hemos tenido que darle throws, es decir
		//"se que hay un problema, pero me da igual"
		System.out.println("El programa ha termiando"); // no se ejecuta, porque no manejamos el error de arriba
	}

}
