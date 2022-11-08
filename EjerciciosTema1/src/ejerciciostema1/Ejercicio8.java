package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//Introducimos las variables
		int adultos, niños;
		double precioAdulto = 20, precioInfantil = 15.5, descuento = 0.05, total; 
		 
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		//Pedimos que introduzca el número de entradas infantiles
		System.out.print("Dime el número de entradas infantiles: ");
		niños = sc.nextInt();
		
		//Pedimos que introduzca el número de entradas de adultos
		System.out.print("Dime el número de entradas de adultos: ");
		adultos = sc.nextInt();

		//Calculamos el total de las entradas
		total = (niños * precioInfantil) + (adultos * precioAdulto);

		//Si el total supera los 100€ se le haría una rebaja del 5%
		total = total >= 100 ? total - total * descuento : total; 

		//Mostramos cuanto sería el precio de las entradas, en caso de ser superior a 100€ se mostrara con la rebaja
		System.out.print("El total de las entradas es de: " + total + "€");

		//Cerramos el escaner
		sc.close();


	}

}
