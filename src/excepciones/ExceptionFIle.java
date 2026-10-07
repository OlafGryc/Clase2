package excepciones;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionFIle {
	
	public static void abrirFicher(String s) {
		try {
			FileReader f = new FileReader(s);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); //sale una lista larga de errores, porque java intenta varios metodos para abrir el fichero
		} //java verifica este tipo de excepciones y nos avisa directamente que pongamos try-catch;
		System.out.println("Abrir el fichero ha terminado");
	}
	
	public static void main (String[] args) {
		abrirFicher("Direction"); 
	}

}
