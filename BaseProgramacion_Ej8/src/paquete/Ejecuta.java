package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		
/*
Programa que lee 87 n�meros. Al finalizar mostrar� el m�ximo introducido, y cu�ntas veces
se repite dicho m�ximo.
 */
		
		int n = 5;
		int num, max=0, cont=1;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<n; i++) {
			
			System.out.println("Introduce un numero:");
			num = sc.nextInt();
			
			if(num == max) {
				cont ++;
			}
			else if(num > max) {
				max = num;
				cont=1;
			}
		}
		
		System.out.println("El maximo introducido ha sido " + max + " y se ha repetido " + cont + " veces.");

	}

}
