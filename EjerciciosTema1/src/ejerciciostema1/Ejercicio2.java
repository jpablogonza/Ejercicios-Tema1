package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Introducimos las variables que vamos a usar
		int num, resto, suma;
		int multiplo = 7;
		
		Scanner sc = new Scanner(System.in);//Creamos el scanner
		
		System.out.print("Dime un número: ");//Pedimos al usuario que nos de un número
		num = sc.nextInt();
		
		resto = num % multiplo;//Para conseguir el resto usamos el operador módulo para sacarlo entre el numero dado y 7
		suma = multiplo - resto;//Para saber cuanto tenemos que sumar restamos a 7, el resto obtenido anteriormente
		
		System.out.print("Para que tu número sea múltiplo de 7, se le tiene que sumar: " + suma);//Mostramos el número que hay que sumar para que sea múltiplo de 7
		
		sc.close();//Cerramos el scanner
		
	}

}
