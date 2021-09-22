package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		
/*
 Programa que lee nombre y año de nacimiento de una serie de alumnos hasta introducir
como nombre de alumno “fin”. En ese momento mostrará la edad media de los alumnos y
el nombre del alumno menor. NOTA: Al introducir como nombre “fin”, no nos ha de pedir el
año de nacimiento.
 */
		String nombre, nMenor="No Existe";
		int año, suma=0, menor=1000, edad, cont=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el nombre del alumno:");
		nombre = sc.nextLine();
		
		while(!nombre.equals("fin")){
			
			System.out.println("Introduce la fecha de nacimiento del alumno:");
			año = sc.nextInt();
			
			edad = 2021 - año;
			suma += edad;
			cont++;
			if(edad<menor) {
				menor = edad;
				nMenor = nombre;
			}
			
			System.out.println("Introduce el nombre del alumno:");
			nombre = sc.next();
			
		}
		
		float media = 0F;
		
		if(cont != 0) { media = (float)suma/cont; }
		
		System.out.println("El nombre del menor alumno es: " + nMenor);
		System.out.println("La media de la clase es: " + media + " años");
	}

}
