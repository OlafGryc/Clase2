package ordenacion;

import java.util.Arrays;

// 08/10/2026

public class Merge {
	
	/*
	 * Queremos mezclar dos arrays ordenados en uno ordenado.
	 * Para hacer esto de forma eficiente vamos a utilizar los boucles while.
	 */

	public static int[] merge(int[] arr1, int[] arr2) {
		int[] res = new int[arr1.length+ arr2.length];
		
		// Punteros de arr1 y arr2
		int pos1 = 0;
		int pos2 = 0;
	

		
		int posRes = 0;
		
		while(pos1<arr1.length && pos2<arr2.length) {
			
			if (arr1[pos1]<=arr2[pos2]) {
				res[posRes] = arr1[pos1];
				pos1++;
				posRes++;
			} else {
				res[posRes] = arr2[pos2];
				pos2++;
				posRes++;
			}
			
			
		}
		
		//Dos metodos que aseguran que rellenan res si un array tiene todos los numeros menores que el otro
		while (pos1<arr1.length) {
			res[posRes] = arr1[pos1];
			pos1++;
			posRes++;
			
		}
		
		while (pos2<arr2.length) {
			res[posRes] = arr2[pos2];
			pos2++;
			posRes++;
			
		}
		
		// Res est'a lleno
		return res;
	}
	
	
	public static int[] dividirPrimeraMitad(int[] arr) {
		int[] res = new int[arr.length/2];
		
		for (int i = 0; i <arr.length/2; i++) {
			res[i] = arr[i];
		}
		return res;
	}
	
	public static int[] dividirSegundaMitad(int[] arr) {
		int[] res = new int[(arr.length - arr.length/2)];
		int posRes =0;
		
		for (int i = arr.length/2; i <arr.length; i++) {
			res[posRes] = arr[i];
			posRes++;
		}
		return res;
	}
	
	
	
	public static int[] mergeSort(int[] arr) {
		if(arr.length<= 1) { //menor o igual por seguridad, por si le pasamos un array de tamano zero
			return arr;
		}
		
		int[] izq = dividirPrimeraMitad(arr);
		int[] dch = dividirSegundaMitad(arr);
		
		izq = mergeSort(izq);
		dch = mergeSort(dch);
		
		return merge(izq,dch);
		
	}
	
	public static void main(String[] args) {
		int [] arr1 = {1,2,3,4,5};
		int [] arr2 = {6,7,8,9,};
		System.out.println(Arrays.toString(merge(arr1,arr2)));
		
		System.out.println(Arrays.toString(mergeSort(new int[] {5,2,4,3,6,1,9,7})));
	}
}
