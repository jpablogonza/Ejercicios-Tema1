package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		//Introducimos las variables
		double longitud;
		int distancia; 
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedidmos la longitud del lanzamiento
		System.out.print("Dime la distancia del lanzamiento en metros: ");
		longitud = sc.nextDouble();
		
		//Calculamos la distancia en centímetros
		distancia = (int) (longitud * 100);
		
		//Mostramos la distancia final en centímetros
		System.out.print("Ha recorrido un total de " + distancia + "cm");
		
		//Cerramos el escaner
		sc.close(); 


	}

}
