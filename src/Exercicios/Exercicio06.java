package Exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double distancia, x1, y1, x2, y2;
		
		System.out.println("Digite os números para calcular a distância entre eles: ");
		
		System.out.println("Valor de x1: ");
		x1 = leia.nextDouble();
		
		System.out.println("Valor de x2: ");
		x2 = leia.nextDouble();
		
		System.out.println("Valor de y1: ");
		y1 = leia.nextDouble();
		
		System.out.println("Valor de y2: ");
		y2 = leia.nextDouble();
		
		distancia = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		
		System.out.printf("A distância entre eles é %.2f: ", distancia);

	}

}
