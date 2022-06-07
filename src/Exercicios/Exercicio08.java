package Exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double custoFabrica, percentagemDistribuidor, custoConsumidor, impostos;
		
		System.out.println("Digite o valor de custo de fábrica do carro: ");
		custoFabrica = leia.nextDouble();
		
		percentagemDistribuidor = (28 * custoFabrica) / 100;
		impostos = (45 * custoFabrica) / 100; 
		custoConsumidor = custoFabrica + percentagemDistribuidor + impostos; 
		
		System.out.printf("O custo do carro para o consumidor será R$ %.2f", custoConsumidor);
	}

}
