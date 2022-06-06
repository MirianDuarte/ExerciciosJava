package Exercicios;
import java.util.Scanner;
import java.util.Locale;

public class Exercicios01 {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner leia = new Scanner(System.in);
		
		double IdadeAnos, IdadeMeses, IdadeDias, IdadeTotalDias;
		
		System.out.println("Calculadora de idade em dias \n");
		
		System.out.println("Digite os anos: ");
		IdadeAnos = leia.nextDouble();
		
		System.out.println("Digite os meses: ");
		IdadeMeses = leia.nextDouble();
		
		System.out.println("Digite os dias: ");
		IdadeDias = leia.nextDouble();
		
		IdadeTotalDias = IdadeAnos * 365 + IdadeMeses * 30 + IdadeDias;
		System.out.println("Idade total em dias: " + IdadeTotalDias);
	}

}
