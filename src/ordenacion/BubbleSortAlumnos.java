package ordenacion;

import java.util.List;

public class BubbleSortAlumnos {
	
	public static double[] toGrades (List<Alumno> students){
		double[] notas = new double[students.size()];
		for (int i =0 ; i<students.size(); i++) {
			Alumno student = students.get(i);
			double nota = student.getNota();
			notas[i] = nota;
		}
		return(ordenar (notas));
	}
	

	public static double[] ordenar (double[] arr) {
			
			boolean changed = false;
			
			for (int i = 0; i<arr.length-1; i++) {
				for (int j = 0; j<arr.length-1-i; j++) {
					if(arr[j]>arr[j+1]) {
						double saved = arr[j+1];
						arr[j+1]=arr[j];
						arr[j]=saved;
						changed = true;
					}
				}
	
				if(!changed) {
					break;
				}
			}
			
			return arr;
	}
}
