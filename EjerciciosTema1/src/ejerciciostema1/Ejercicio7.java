package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//Introducimos las variables
		double mm, cm, m, total;
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos la primera medida en milimetros
		System.out.print("Dame una medida en milímetros: ");
		mm = sc.nextDouble();
		
		//Pedimos la segunda medida en centímetro
		System.out.print("Dame otra medida en centímetros: ");
		cm = sc.nextDouble();
		
		//Pedimos la tercera medida en metros
		System.out.print("Dame otra medida en metros: ");
		m = sc.nextDouble();
		
		//Sumamos las 3 medidas ya en centímetros
		total = ( mm / 10 ) + cm + ( m * 100 );
		
		//Mostramos el total de la suma en centímetros
		System.out.print("El total de la suma de las 3 medidas en cm es " + total);
		
		//Cerramos el escaner
		sc.close();


	}

}
