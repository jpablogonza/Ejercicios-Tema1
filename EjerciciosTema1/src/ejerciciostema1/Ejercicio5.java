package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		//introducimos las variables
		int a, b, c, x, y;
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos al usuario el valor de a
		System.out.println("Dime el valor para a: ");
		a = sc.nextInt();
		
		//Pedimos al usuario el valor de b
		System.out.println("Dime el valor para b: ");
		b = sc.nextInt();
		
		//Pedimos al usuario el valor de c
		System.out.println("Dime el valor para c: ");
		c = sc.nextInt();
		
		//Pedimos al usuario el valor de x
		System.out.println("Dime el valor para x: ");
		x = sc.nextInt();
		
		//Calculamos y utilizando el polinomio
		y = a * x * x + b * x + c;
		
		//Mostramos el valor de y
		System.out.print("Con esos valores Y valdría: " + y);
		
		//Cerramos el escaner
		sc.close();


	}

}
