package recursividad;

import java.util.Arrays;

//PREGUNTAR GEMINI QUE HACER PARA QUE NO IMPRIMA LOS 2


public class BacktrackingSegundaClase {
	/*laberinto, solo puedo pasar por 0, 1 es pared
	*entrada (0,0)
	*salida (3,3)
	
	*0 1 0 0
	*0 0 0 1
	*1 1 0 1
	*0 1 0 0
	*tengo que poner al programa limites para que no se salga del laberinto
	*
	*voy a tener que utilizar un array doble
	*
	*/
	
	//Creamos una clase auxiliar, porque no funcionan Expressions en el debugger
	static class Laberinto{
		int[][] mapa;
		public Laberinto (int[][] mapa) {
			this.mapa = mapa;
		}
		
		//Sustituimos la ejecution de otro metodo
		@Override
		public String toString() {
			String myString ="";
			for (int[] fila : mapa) {
				for (int numero : fila) {
					myString += (numero + " ");
					
				}
				myString += "\n";
			}
			return myString;
		}
	}

	
	
	
	//Funcion que busca camino por el laberinto, fila y columna son posiciones de start
	public static boolean camino (Laberinto laberinto, int fila, int columna) {
		
		//Por aqui no hay camino, nos hemos salido del laberinto
		//Laberinto.mapa, porque mapa es un atributo de laberinto, queremos usar mapa
		if (fila>laberinto.mapa.length-1 || fila<0 || columna > laberinto.mapa[fila].length-1 || columna <0) {
			return false; 		}
		
		//Choco contra la pared, o chocamos contra la posicion 
		if (laberinto.mapa[fila][columna] == 1 || laberinto.mapa[fila][columna] == 2)
		{
			return false;
		}
		
		//Salida
		if (fila == laberinto.mapa.length-1 && columna == laberinto.mapa[laberinto.mapa.length-1].length-1) {
			laberinto.mapa[fila][columna] = 2;
			System.out.println(laberinto + "es un camino valido");
			return true;
		}
		
		/*BACKTRACKING
		 * 1) Pruebo
		 * 2) Exploro
		 * 3) Vuelvo
		 */
		
		// 1) Pruebo -> pongo un dos para marcar el camino que hago
		laberinto.mapa[fila][columna] = 2;
		
		// 2) Exploro -> voy primero probando filas, luego columnas, tengo que probar si alguno ha llegado al final
		if(camino (laberinto, fila, columna+1) || camino (laberinto, fila, columna-1) || camino (laberinto, fila+1, columna) || camino (laberinto, fila-1, columna)) {
			laberinto.mapa[fila][columna] = 2;
			return true;
			//tenemos que devolver el true en el if, porque si no siempre ejecutaria el 3) Vuelvo, haria el camino = 0 y devoleria false 
		}
		
		
		// 3) Vuelvo
		laberinto.mapa[fila][columna] = 0;

		
		return false;
	}
	
	public static void main(String[] args) {
		int[][] mapa = {
				{0,0,1,0},
				{1,0,0,0},
				{0,0,1,1},
				{0,0,0,0}
		};
		
		Laberinto laberinto = new Laberinto(mapa);
		
		//System.out.println(Arrays.toString(mapa[0])); //tenemos que usar Arrays.toString porque un array es UNA REFERENCIA, no objeto

		System.out.println(camino(laberinto, 0, 0));
	}
}
