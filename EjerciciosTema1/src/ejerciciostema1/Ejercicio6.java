package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		//Declaramos las variables que vamos a usar 
		int total, h, resto, min, seg; 

		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		//Pedimmos al usuario el número total de segundos 
		System.out.print("Dime el total de segundos: ");
		total = sc.nextInt();

		//Calculamos las horas, los minutos y los segundos
		h = total / 3600;
		resto = total % 3600;
		min = resto / 60;
		seg = resto % 60;

		//Mostramos como se descompone los segundos introducidos
		System.out.println("Los " + total + "  segundos introducidos, se descomponen en: " + h + " horas, " + min + " minutos y " + seg + " segundos");

		//Cerramos el escaner
		sc.close();


	}

}
