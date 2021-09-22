package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {

/*
 Programa que muestra todos los divisores de un número introducido. Entre los divisores no
se incluirá el propio número
 */
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor indica un número:");
		num = sc.nextInt();
		
		for(int i=1; i<num; i++) {
			if(num%i == 0) {
				System.out.println(i + " es divisor de " + num);
			}
		}
	}

}
