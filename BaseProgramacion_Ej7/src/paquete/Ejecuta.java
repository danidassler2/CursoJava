package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		
/*
Programa que pide el número de calificaciones a introducir, y una nota de corte. A
continuación se introducirán las calificaciones, para finalmente indicar cuántas
calificaciones han igualado o superado la nota de corte.
 */

		int numC, cont=0;
		float corte, nota;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica el numero de calificaciones que se van a introducir:");
		numC = sc.nextInt();
		
		System.out.println("Indica la nota de corte:");
		corte = sc.nextFloat();
		
		for(int i=0; i<numC; i++) {
			
			System.out.println("Introduce una nota:");
			nota = sc.nextFloat();
			
			if(nota >= corte) { cont++; }
			
		}
		
		System.out.println("El numero de notas que supera/iguala la nota de corte es: " + cont);
		
	}

}
