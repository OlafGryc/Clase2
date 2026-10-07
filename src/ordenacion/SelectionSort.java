package ordenacion;

import java.util.Arrays;

public class SelectionSort {
	
	public static int[] ordenar (int[] arr) {
		
		
		
		for (int i =0; i< arr.length;i++) {
			int posMin = i;
			int valorMin = Integer.MAX_VALUE;
			for (int j = i; j<arr.length; j++) {
				if (valorMin>arr[j]) {
					posMin = j;
					valorMin = arr[posMin];
					
				}
			}
			int valorActual = arr[i];
			arr[i] = valorMin;
			arr[posMin]=valorActual;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(ordenar(new int[] {5,4,4,12,-12,45,23,23,100})));
	}

}
