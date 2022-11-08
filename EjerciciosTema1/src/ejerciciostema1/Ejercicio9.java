package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		//Introducimos las variables
		int num1, num2;
		boolean iguales; 
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos un número al usuario
		System.out.print("Dime un número: ");
		num1 = sc.nextInt();
		
		//Pedimos un segundo número al usuario
		System.out.print("Dime otro número: ");
		num2 = sc.nextInt();
		
		//Comprobamos si son iguales o no
		iguales = num1==num2 ? true : false;
		
		//Mostramos si es true o false
		System.out.println(iguales ? "Los números son iguales" : "Los números no son iguales");
		
		//Cerramos el escaner
		sc.close();


	}

}
