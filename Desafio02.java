package exercicios;

import java.util.Scanner;

public class Desafio02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int a;
		
		System.out.println("Digite um número");
		a = ler.nextInt();
		
		if (a > 0) {
			System.out.println("O número é positivo");
		}
		else if (a < 0) {
			System.out.println("O número é negativo");
		}
		else
			System.out.println("O número é zero");

	}

}
