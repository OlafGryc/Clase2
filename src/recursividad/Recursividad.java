package recursividad;

public class Recursividad {
	
	static final int HASTAZERO = 5;
	static final int INTSUMA = 5;
	
	

	//Cuenta atras hasta 0
	public static void cuentaAtras (int n) {
		if (n==0) {
			System.out.println(0);
			return; //para el programa en el 0; podemos hacer un return aunque sea un void
		}
		System.out.println(n);
		cuentaAtras(n-1);
	}
	
	//suma n
	public static int suma (int n) {
		if (n==0) {
			return 0;
		}
		
		return n + suma(n-1);
		
	}
	
	//dada una pos de un array, sumar todos los variables
	
	public static int sumaArray(int[] arr, int i) { //tenemos que pasarle el int i para la posicion
		if (i == arr.length -1) {
			return arr[i];
		}
		return arr[i] + sumaArray(arr,(i+1));
	}
	
	public static void main(String[] args) {
		//cuentaAtras(FINAL); //-> da un error, mas grave que exception -> se ha quedado sin espacio por recursividad
		System.out.println(suma(INTSUMA));
		int[] myArray = {1,2,3};
		System.out.println(sumaArray(myArray, 0));
		
	}
}
