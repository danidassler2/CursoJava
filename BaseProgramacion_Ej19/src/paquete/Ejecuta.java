package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {

/*
Realiza un programa que lea desde teclado 10 números y posteriormente muestre
solamente los que sean pares. CON ARRAYS
 */
		int num = 0;
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		
		for(int i=0; i<10; i++) {
			
			System.out.println("Indica un numero: ");
			num = sc.nextInt();
			arr[i] = num;
			
		}
		
		System.out.println("Numeros pares introducidos: ");
		for(int j = 0; j<arr.length; j++) {
			if(arr[j]%2 == 0) { System.out.println(arr[j]); }
		}

	}

}
