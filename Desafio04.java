package exercicios;

import java.util.Scanner;

public class Desafio04 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);

		
		int a, b, c;
		
		
		System.out.println("Digite a primeira medida do Triângulo");
		a = ler.nextInt();
		
		System.out.println("Digite a segunda medida do Trângulo");
		b = ler.nextInt();
		
		System.out.println("Digite a terceira medida do Triângulo");
		c = ler.nextInt();
		
		if(a == b && a == c){
			System.out.println("É um triângulo equilátero");
		}
		else if(a != b && a != c) {
			System.out.println("É um triângulo escaleno");
		}
		else {
			System.out.println("É um triângulo isóceles");
		}
		
		

	}

}
