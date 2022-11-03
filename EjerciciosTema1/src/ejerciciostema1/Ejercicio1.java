package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		double num; //Introducimos las variables que vamos a usar
		
		Scanner sc = new Scanner(System.in); //Creamos el scanner
		
		System.out.print("Dime un número: "); //Pedimos que introduzcan un número
		num = sc.nextDouble();
		
		num += 0.5; //Le sumamos 0.5 para poder redondear el número
		
		System.out.print("El número redondeado sería: " + (int) num); //Mostramos el número redondeado 
		
		sc.close(); //Cerramos el scanner

	}

}
