package paquete;

public class Ejecuta {

	public static void main(String[] args) {
		
/*
2. Programa que muestra los números primos existentes entre el 1 y el 100. NOTA: Un
número es primo si tiene dos únicos divisores que son el 1 y él mismo.
 */
		int cont = 0;
		
		for(int i=1; i<=100; i++) {
			
			for(int j=1; j<=i; j++) {
				
				if(i%j == 0) {
					cont++;
				}
				
			}
			
			if (i == 1 && cont == 1) {
				System.out.println("Numero primo --> " + i);
			}
			else if ( i > 1 && cont ==2) {
				System.out.println("Numero primo --> " + i);
			}
			
			cont=0;
		}
		
	}

}
