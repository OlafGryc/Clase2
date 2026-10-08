package ordenacion;

import java.util.Comparator;

public class ComparadorPorNota {
	
	public class ComparadorPorNota implements Comparator<Alumno>{

		@Override
		public int compare (Alumno o1, Alumno o2) {
			return o1.nota.compareTo(o2.nota);
		}
	}

}
