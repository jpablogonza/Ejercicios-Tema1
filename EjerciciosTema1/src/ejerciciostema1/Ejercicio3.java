package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int num1, num2, resto, suma; //Añadimos las variables que vamos a tener que usar
		
		Scanner sc = new Scanner(System.in); //Creamos el scanner
		
		System.out.println("Dime un número: "); //Le pedimos al usuario que nos de un número
		num1 = sc.nextInt();
		System.out.println("Dime otro número: "); //Le pedimos al usuario otro número
		num2 = sc.nextInt();
		
		resto = num1 % num2; //Para sacar el resto usamos el operador módulo entre ek num1 y el num2
		suma = num2 - resto; //Para saber cuanto tenemos que sumar al num1, restamos el num2 menos el esto
				
		System.out.print("Para que " + num1 + " sea múltiplo de " + num2 + " hay que sumarle: " + suma); //Mostramos al usuario cuanto tenemos que sumar al num1 para que pueda ser múltiplo de num2
		
		sc.close(); //cerramos el scanner

	}

}
