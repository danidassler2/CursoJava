package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {

/*
Programa consistente en un juego en el que el Jugador1 introduce un n�mero entre el 1 y
el 100 y el Jugador2 tendr� que adivinarlo en un m�ximo de 10 intentos. Por cada intento
del Jugador2, y en el caso de no acertar, se mostrar� el mensaje �Te pasaste�, o �No
llegaste�, seg�n corresponda. De la misma manera, y al terminar el programa, se
mostrar�n los mensajes �Acertaste� o bien �Intentos agotados�.
 */
		
		int num = 0, intentos=10, ad=0, cont=0;
		Scanner sc = new Scanner (System.in);
		boolean acertado = false;
		
		System.out.println("[Jugador 1] Introduce un numero del 1 al 100:"); //se podria controlar si el numero es valido o no
		num = sc.nextInt();
		
		for(int i=0; i<intentos; i++) {
			
			System.out.println("[Jugador 2] Introduce y adivina el numero del 1 al 100:");
			ad = sc.nextInt();
			cont ++;
			
			if(ad == num) {
				acertado = true;
				break;
			}
			else if(ad < num) {
				System.out.println("No llegaste");
			}
			else if(ad > num) {
				System.out.println("Te pasaste");
			}
		}
		
		if(acertado) { System.out.println("Acertaste"); }
		else { System.out.println("Intentos Agotados"); }
		
	}
}



