package ordenacion;

import java.util.Arrays;

public class BubbleSort {
	
	public static int[] ordenar (int[] arr) {
		
		boolean changed = false;
		
		for (int i = 0; i<arr.length-1; i++) {
			for (int j = 0; j<arr.length-1-i; j++) {//ya en la primera ejecucion el numero mas grande se pone a la derecha
				if(arr[j]>arr[j+1]) {
					int saved = arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=saved;
					changed = true;
				}
			}
			System.out.println("How many times? " + i);

			//si en toda iteracion de i no ha cambiado ningun valor, es que ya está ordenado nuestro set
			if(!changed) {
				break;
			}
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(ordenar(new int[] {1000,4,4,12,-12,100,45,23,1200000,23})));
		System.out.println(Arrays.toString(ordenar(new int[] {-12, 4, 4, 12, 23, 23, 45, 100, 1000, 1200000})));
	}
	
		
}
