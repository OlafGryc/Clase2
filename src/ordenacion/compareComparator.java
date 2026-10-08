package ordenacion;

import java.util.Comparator;
import java.util.List;

public class compareComparator {

	//jprdl jestem do tylu
	
public static List<Alumno> ordenar (List<Alumno> students, Comparator compare){
		
		boolean changed = false;
		
		for (int i = 0; i<students.size()-1; i++) {
			for (int j = 0; j<students.size()-1-i; j++) {
				if(students.get(j).getNota()>students.get(j+1).getNota()) {
					Alumno saved = students.get(j+1);
					students.set(j+1, students.get(j));
					students.set(j, saved);
					changed = true;
				}
			}

			//zmienic
			
			if(!changed) {
				break;
			}
		}
		
		
		return students;
	}
	
}
