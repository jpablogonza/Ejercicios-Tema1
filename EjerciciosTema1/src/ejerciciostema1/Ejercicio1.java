package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		double num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime un número: ");
		num = sc.nextDouble();
		
		num += 0.5;
		
		System.out.print("El número redondeado sería: " + (int) num);
		
		sc.close();

	}

}
