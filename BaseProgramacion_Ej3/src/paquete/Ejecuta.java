package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {

/*
  Programa que lee de manera consecutiva n�meros hasta que se introducen dos n�meros
iguales seguidos
 */
		int num, aux;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca n�mero:");
		num = sc.nextInt();
		
		do {
			aux=num;
			
			System.out.println("Introduzca n�mero:");
			num = sc.nextInt();
			
		}while(aux != num);

		System.out.println("Se han introducido dos numeros consecutivos.");
	}

}
