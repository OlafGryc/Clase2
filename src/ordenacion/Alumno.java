package ordenacion;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
	
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




	public static void main(String[] args) {
		Alumno ana = new Alumno("Ana", 9.0);
		Alumno carlos = new Alumno("Carlos", 8.75);
		
		List students = new ArrayList<Alumno>();
		students.add(ana);
		students.add(carlos);
		
		System.out.println(BubbleSortAlumnos.ordenar();

	}
	
	

}
