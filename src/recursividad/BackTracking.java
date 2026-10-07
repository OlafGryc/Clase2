package recursividad;

import java.util.ArrayList;
import java.util.List;

public class BackTracking {
	//cuando encontramos una solution, tenemos que volver hacia atras para encontrar otras solutiones
	//ej. queremos una suma igual a 4 compuesta por 1, 2 o 3;
	//pueden ser
	// 4=1+1+1+1
	// 4=1+1+2
	// 4= 2+2
	// i tak dalej...
	
	public static void backtracking (int[] arr, int objetivo, int acumulado, List<Integer> solution) {
		if (acumulado == objetivo) {
			System.out.println(solution);
			return; //siempre tengo que hacer return para salir del programa
		}
		
		if (acumulado > objetivo) {
			return; //si me he pasado del objetivo, se que tambien no va a ser el objetivo
		}
		
		for (int i : arr) {
			//probar
			solution.add(i);
			
			//exploro
			backtracking(arr, objetivo, acumulado+i, solution);
			
			
			//volver
			
			
			solution.remove (solution.size() -1 );//quitamos el ultimo elemento, no un valor en concreto //cuando termina [1,1,1,3] elimina el tres, se termina el bucle, y vuelve
		//a hacer el siguiente paso, que es llamar otra vez la funcion, porque estaba en cola
		}
	}
	
	
	public static void main(String[] args) {
		List<Integer> e = new ArrayList<>();
		
		backtracking (new int[] {1,2,3}, 4, 0, e);
	}
	
}
