package exercicios;

import java.util.Scanner;

public class Desafio03 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner (System.in);
		
		int a;
		
		System.out.println("Informe um número");
		a = ler.nextInt();
		
		if(a%2 == 0) {
			System.out.println("O número é par");
		}
		else {
			System.out.println("O número é ímpar");
		}

	}

}
