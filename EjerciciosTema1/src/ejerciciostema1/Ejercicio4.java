package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Introducimos las variables
		double base, altura, area; 
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos  al usuario la base del triángulo
		System.out.print("Base del triángulo: ");
		base = sc.nextDouble();
		
		//Pedimos al ususrion la base del triángulo
		System.out.print("Altura del triángulo: ");
		altura = sc.nextDouble();
		
		//Calculamos el area
		area = base * altura / 2;
		
		//Mostramos el area del triángulo
		System.out.printf("El area del triangulo es %.2f",area);
		
		//Cerramos el escaner
		sc.close();

	}

}
