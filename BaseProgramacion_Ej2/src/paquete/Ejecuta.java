package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {

/*
Programa que lee 11 n�meros comprendidos entre el 20 y 40, ambos inclusive. En el caso
en el que alg�n n�mero introducido no se encontrara dentro del rango permitido, se
mostrar� un mensaje de error y seguir� pidiendo n�meros. El programa finalizar� cuando
se hayan introducido 11 n�meros v�lidos y mostrar� el n�mero m�ximo introducido de los
11 v�lidos. Adem�s indicar� cu�ntos n�meros de los introducidos no han sido v�lidos.
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
