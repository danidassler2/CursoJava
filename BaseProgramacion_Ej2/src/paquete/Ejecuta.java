package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {

/*
Programa que lee 11 números comprendidos entre el 20 y 40, ambos inclusive. En el caso
en el que algún número introducido no se encontrara dentro del rango permitido, se
mostrará un mensaje de error y seguirá pidiendo números. El programa finalizará cuando
se hayan introducido 11 números válidos y mostrará el número máximo introducido de los
11 válidos. Además indicará cuántos números de los introducidos no han sido válidos.
*/
		Scanner sc = new Scanner(System.in);
		int mayor = 0;
		int noValidos= 0, validos = 0;
		int num = 0;
		int n = 4;
		
		while(validos != n) {
			
			//ver si se puede hacer con try/catch
			
			System.out.println("Indica el numero " + (validos+1) + " de " + n + " (entre 20 y 40):");
			num = sc.nextInt();
			
			if(num < 20 || num > 40){
				System.out.println("Error, el numero introducido no se encuentra entre 20 y 40");
				noValidos++;
			}
			else {
				if(num >= mayor) {
					mayor = num;
				}
				System.out.println("El numero introducido ha sido: " +  num);
				System.out.println("El numero mayor hasta el momento es: " + mayor);
				validos++;
			}
			
		}
		
		System.out.println("El mayor numero introducido ha sido: " +  mayor);
		System.out.println("Numeros mal introducidos: " + noValidos);
	}

}
