package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		/*
		 Programa que lee dos números A y B,
		  y nos informa si B es divisor de A o no.
		
		 */
		int A;
		int B;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Introduzca el numero A:");
			A = sc.nextInt();
			
			System.out.println("Introduzca el numero B:");
			B = sc.nextInt();
			
			if(A%B == 0) {
				System.out.println("B es divisor de A");
				//mensaje = String.format(%d es divisor de %d, b, a);
				//System.out.println(mensaje);
			}
			else {
				System.out.println("B no es divisor de A");
			}
		}
		catch(Exception e){
			System.out.println("A y B deben ser numeros enteros");
		}

	}

}
