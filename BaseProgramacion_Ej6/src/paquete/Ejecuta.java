package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		
/*
Programa que lee 9 números, y en el caso en el que el primero introducido sea igual al
último, nos muestra la media. En caso contrario, no se mostrará nada.
 */

		int num, suma=0, primero=0, ultimo=0, n=5;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		primero = sc.nextInt();
		suma += primero;
		
		for(int i=2; i<n; i++) {
			
			System.out.println("Introduce un número:");
			num = sc.nextInt();
			
			suma += num;
			
		}
		
		System.out.println("Introduce un número:");
		ultimo = sc.nextInt();
		suma += ultimo;
		
		if(primero == ultimo) {
			float media = (float)suma/n;
			System.out.println("La media de los " + n +  " números es: " + media);
		}
		else {
			System.out.println("Primer y ultimo numero no coinciden");
		}
	}

}
