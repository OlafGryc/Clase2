package ordenacion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.Comparator;

public class Alumno implements Comparable<Alumno> {
	
	String nombre;
	double nota;
	
	public Alumno (String nombre, double nota) {
		this.nombre = nombre;
		this.nota = nota;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}



	public double getNota() {
		return nota; 
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	@Override
    public String toString() {
        return this.nombre + " (" + this.nota + ")";
    }

	
	@Override // Tenemos que hacer Override, porque implementamos Comparable
	public int compareTo(Alumno o) {
		int c = Double.compare(this.nota, o.nota);
		if (c!= 0) {
			return c;
		} else {
			return this.nombre.compareTo(o.nombre);
		}
	}
	
	
	public static void main(String[] args) {
		Alumno ana = new Alumno("Ana", 9.0);
		Alumno carlos = new Alumno("Carlos", 8.75);
		Alumno alejandra = new Alumno("Alejandra", 7.5);
		
		List students = new ArrayList<Alumno>();
		students.add(ana);
		students.add(carlos);
		students.add(alejandra);
		
		System.out.println(BubbleSortAlumnos.ordenar(students));
		//Arrays.sort(students); //??
		
		Comparator<Alumno> porNombre = new ComparadorPorNombre();
		//porNombre.compare(carlos, alejandra);
		//System.out.println(Arrays.deepToString(compareComparator.ordenar(students, porNombre)));
		
		//Comparator<Alumno> porNota = new ComparadorPorNota();
		//System.out.println(Arrays.toString(compareComparator.ordenar(students, porNota)));
		
		// Otra forma del metodo Comparator; usamos -> en vez de {} porque solo es una linea
		
		Comparator <Alumno> porNombre2 = (a, b) -> a.nombre.compareTo(b.nombre);

	}

}
