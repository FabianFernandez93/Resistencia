package cl.desafiolatam;

import java.util.Scanner;

public class Resistencia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese Resistencia 1: ");
		float resistencia1 = sc.nextFloat();
		
		while (resistencia1 < 0) {
			System.out.println("ingrese un valor posito mayor a 0 ");
			int r1 = sc.nextInt();
			resistencia1 = r1;
			};
			
			
			System.out.println("Ingrese Resistencia 2: ");
			float resistencia2 = sc.nextFloat();
			
		while (resistencia2 < 0) {
				System.out.println("ingrese un valor posito mayor a 0 ");
				int r2 = sc.nextInt();
				resistencia2 = r2;
				};
				
		System.out.println("Ingrese Resistencia 3: ");
		float resistencia3 = sc.nextFloat();
				
		while (resistencia3 < 0) {
					System.out.println("ingrese un valor posito mayor a 0 ");
					int r3 = sc.nextInt();
					resistencia3 = r3;
					};	
					

		float resistenciaTotal = (1 /((1/resistencia1)+(1/resistencia2)+(1/resistencia3))) ;
		System.out.printf(
				"Resistencia 1: %s\n"
				+ "Resistencia 2: %s\n"
				+ "Resistencia 3: %s\n"
				+ "Resistencia TOTAL: %s",
				resistencia1, resistencia2, resistencia3, resistenciaTotal);
		
		
		sc.close();
	}

}
