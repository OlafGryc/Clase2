package excepciones;

public class Excepciones {
	
	public static int accederValor(int[] arr, int i) {
		int e = Integer.parseInt("abc"); //recibe NÚMEROS EN STRING, and changes them do int -> va a dar error, 
		int valor = arr[i]; // el programa se para aqui, da el error y ya no avanza
		System.out.println("valor: " + valor);
		return valor;
	}

	public static void main(String[] args) {
		System.out.println("Empieza mi programa:");
		int[] arr = {1,2,3};
		
		//System.out.println(arr[5]); // we have a problem, the arr doesn't have 5 places: excepciones.Excepciones.main(Excepciones.java:9) - nos dice la linea "9"
		
		//usar el debugger (el bicho de arriba); step into enters into functions
		try {
			System.out.println(accederValor(arr,5));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Ese indice no es valido");
		} catch (Exception e) { //puedo encadenar diferentes tipos de errores para dar mensajes mas concretos
			System.out.println("Algo ha ido mal");
		} //en este caso, el primer catch atrapa directamente el out of bound, y segundo problemas generales
		
	}
}
