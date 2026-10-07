package recursividad;

public class BusquedaBinaria {
	
	public static int busquedaBinaria(int[] arr, int valor) {
		int izq = 0;
		int dch = arr.length-1;
		int pos = (dch-izq)/2;
		
		while(izq<=dch) {
			if (arr[pos] == valor) {
				return pos;
			} else if (arr[pos]>valor) { // Si arr[pos] es mayor, nos tenemos que mover hacia la izquierda
				//Acutalizo el valor de la derecha, moviendolo a la position de pos, pero una anterior
				dch = pos-1;
				pos = izq + ((dch-izq)/2);
				
			} else { //Si es menor que el valor, nos movemos hacia la derecha
				izq = pos+1;
				pos = izq + ((dch-izq)/2);
			}
		}
		return -1;

	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,8,9,12,14};
		System.out.println(busquedaBinaria(arr, 14));
	}

}
